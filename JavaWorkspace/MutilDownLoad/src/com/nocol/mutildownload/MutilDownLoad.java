package com.nocol.mutildownload;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author lxp
 *
 * @TODO
 * 
 */

public class MutilDownLoad {
	
	//��ȡ�ļ�����·��
	public static String path = "http://192.168.56.1:8080/haozip.exe";
	// �����̸߳���
	public static int ThreadCount = 3;

	// ===�����������е��߳�===
	public static int RunningThread;

	public static void main(String[] args) throws Exception {
		// ���ӷ���������ȡ���ص��ļ�����
		// ����URL����
		URL url = new URL(path);
		// ��ȡ���Ӷ���
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// �����������ݵķ�ʽ
		conn.setRequestMethod("GET");
		// ��������ʱʱ��
		conn.setReadTimeout(5000);
		// ��ȡ������״̬��
		int code = conn.getResponseCode();
		if (code == 200) {
			// ��ȡ�ļ�ʵ�ʳ���
			int lenth = conn.getContentLength();

			// ===���̸߳�����ֵ���������е��߳�====
			RunningThread = ThreadCount;

			// ����Ҫ�����ļ����ļ��ռ�
			RandomAccessFile raf = new RandomAccessFile(getName(path), "rw");
			// ָ���ÿռ�ĳ���(��Ҫ���ص��ļ��ĳ�����ͬ)
			raf.setLength(lenth);
			raf.close();
			// ����ÿ���߳�Ҫ���ص��ļ�����
			int blockSize = lenth / ThreadCount;
			for (int ThreadId = 1; ThreadId <= ThreadCount; ThreadId++) {
				// ����ûÿ���߳����صĿ�ʼλ��
				int startIndex = (ThreadId - 1) * blockSize;
				int endIndex = startIndex + (blockSize - 1);
				if (ThreadId == ThreadCount) {
					endIndex = lenth;
				}

				System.out.println(ThreadId + "�������صĴ�С��" + startIndex + "-----" + endIndex);

				// �����߳�����
				DownLoadThread downLoadThread=new DownLoadThread(startIndex, endIndex, ThreadId);
				downLoadThread.start();
			}
		}
	}

	// �����߳������ļ�
	public static class DownLoadThread extends Thread {//��̬�ڲ���

		private int startIndex;
		private int endIndex;
		private int ThreadId;

		public DownLoadThread(int startIndex, int endIndex, int ThreadId) {
			this.endIndex = endIndex;
			this.startIndex = startIndex;
			this.ThreadId = ThreadId;
		}

		@Override
		public void run() {
			try {
				// ����URL����
				URL url = new URL(path);
				// ��ȡ���Ӷ���
				HttpURLConnection conn = (HttpURLConnection) url.openConnection();
				// �����������ݵķ�ʽ
				conn.setRequestMethod("GET");
				// ��������ʱʱ��
				conn.setReadTimeout(5000);

				// ==����¼�߳�λ�� ���ļ���װ��File����
				File file = new File(ThreadId + ".txt");
				// ==����ǰ�ж��Ƿ���ڱ����߳�����λ�õ��ļ����ж��Ƿ�Ҫ���жϵ�����
				if (file.exists()) {
					FileInputStream fis = new FileInputStream(file);
					BufferedReader br = new BufferedReader(new InputStreamReader(fis));
					// ��ȡ�߳����ص�����λ��
					String Lastpostion = br.readLine();
					// װ��Ϊint����
					int LastPositionn = Integer.parseInt(Lastpostion);
					// ����λ�ø�ֵ����ʼλ��
					startIndex = LastPositionn;
					// �ͷ���Դ
					fis.close();

					System.out.println(ThreadId + "ʵ�����صĴ�С��" + startIndex + "-----" + endIndex);
				}

				// ����Ҫ��������������ز��ֵ��ļ���ָ����λ��(����ͷ��Ϣ)  Range:���ֶ�����ʹ��
				conn.setRequestProperty("Range", "bytes=" + startIndex + "-" + endIndex);
				// ��ȡ������״̬��
				int code = conn.getResponseCode();
				if (code == 206) {// ״̬��=206��ʾ���󲿷���Դ�ɹ�
					// ��ȡ����������
					InputStream in = conn.getInputStream();
					// ������������ļ�����
					RandomAccessFile raf = new RandomAccessFile(MutilDownLoad.getName(path), "rw");
					// ָ���߳������ļ��Ŀ�ʼλ��
					raf.seek(startIndex);

					// ����ȡ���ļ�д�봴�����ļ��ռ�
					int len = 0;
					byte[] bys = new byte[1024*1024];

					// ===���嵱ǰ�߳����صĴ�С
					int total = 0;

					while ((len = in.read(bys)) != -1) {
						raf.write(bys, 0, len);

						// ==total��Ϊÿ���̴߳Ӹ�����ʵλ�ÿ�ʼ���ص��ļ���С
						total += len;
						// ==Ϊʵ�ֶϵ���������ȡ��ǰ�߳����ص�λ��
						int CurrentThreadPosition = startIndex + total;
						// ==����ǰ�߳����ص�λ�ü�¼������.txt�ļ���,����������ʶ��ļ�����
						// =="rwd" ���Ա��ȡ��д�룬���� "rw"����Ҫ����ļ����ݵ�ÿ�����¶�ͬ��д�뵽�ײ�洢�豸��
						RandomAccessFile raff = new RandomAccessFile(ThreadId + ".txt", "rwd");
						raff.write(String.valueOf(CurrentThreadPosition).getBytes());
						raff.close();
					}
					// �ͷ���Դ
					in.close();
					raf.close();

					System.out.println("�߳�" + ThreadId + "������ɣ�");

					// ===��ÿ���߳�������Ϻ�ÿ���̵߳�".txt"�ļ�ɾ����Ϊ���Ⲣ������,Ϊɾ�ļ���������====
					synchronized (DownLoadThread.class) {
						RunningThread--;// �߳�������ɺ󽫲������У������е��̸߳�����Ӧ����
						if (RunningThread == 0) {// ��RunningThread����Ϊ0ʱ˵���ļ�ȫ���������
							for (int i = 1; i <= ThreadCount; i++) {
								File deleteFile = new File(i + ".txt");
								deleteFile.delete();
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//��ȡԴ�ļ����ļ���
	public static String getName(String path){
		//http://192.168.56.1:8080/haozip.exe
		//��ȡ"/"���һ�γ��ֵ�����
		int index=path.lastIndexOf("/");
		String name=path.substring(index+1);
		return name;
	}
}