package com.thread_group_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * �̳߳صĺô����̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��г�Ϊ����״̬���ȴ���һ��������ʹ�á�
 *     //Executor���̹߳���
 * ���ʵ���̵߳Ĵ�����?
 * 		A:����һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:�����̳߳ص��߳̿���ִ�У�
 * 			����ִ��Runnable�������Callable���������߳�
 * 			��һ����ʵ��Runnable�ӿڡ�
 * 		C:�������·�������
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:�Ҿ�Ҫ������������?
 *		���ԡ�
 */
class MyRun implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=0;x<101;x++){
			System.out.println(Thread.currentThread().getName()+":"+x);
		}
	}
} 
public class Thread_pool_runnable {
	public static void main(String[] args) {
		// ����һ���̳߳ض��󣬿���Ҫ���������̶߳���
		// public static ExecutorService newFixedThreadPool(int nThreads)
		ExecutorService pool = Executors.newFixedThreadPool(2);

		// ����ִ��Runnable�������Callable���������߳�
			pool.submit(new MyRunnable());   //��ʱδʹ�÷���ֵ
			pool.submit(new MyRunnable());
			
		//�����̳߳�
			pool.shutdown();
	}
}
