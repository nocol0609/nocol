package com.nocol_02;

import java.io.File;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ���󣺵ݹ�ɾ�������ݵ�Ŀ¼
 * 
 * Ŀ¼���Ѿ�������demo
 * 
 * ������ A:��װĿ¼ B:��ȡ��Ŀ¼�µ������ļ������ļ��е�File���� C:������File���飬�õ�ÿһ��File����
 * D:�жϸ�File�����Ƿ����ļ��� �ǣ��ص�B �񣺾�ɾ��
 */
public class FileDeleteByDiGui {
	public static void main(String[] args) {
		// ��װĿ¼
		File srcFileFolder = new File("Demo");
		// д����ʵ�ֵݹ�ɾ��
		deleteFileFolder(srcFileFolder);
	}

	private static void deleteFileFolder(File srcFileFolder) {
		// ��ȡ��Ŀ¼�µ������ļ������ļ��е�File����
		File[] fileArray = srcFileFolder.listFiles();
		// �����������
		if (fileArray != null) {
			for (File file : fileArray) {
				if (fileArray != null)
					if (file.isDirectory()) {
						deleteFileFolder(file);
					} else {
						file.delete();
					}
			}
			srcFileFolder.delete();
		}
	}
}
