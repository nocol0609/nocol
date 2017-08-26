package com.thread_group_pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���߳�ʵ�ֵķ�ʽ3��
 *  	A:����һ���̳߳ض��󣬿���Ҫ���������̶߳���
 * 			public static ExecutorService newFixedThreadPool(int nThreads)
 * 		B:�����̳߳ص��߳̿���ִ�У�
 * 			����ִ��Runnable�������Callable���������߳�
 * 			��һ����ʵ��Runnable�ӿڡ�
 * 		C:�������·�������
 * 			Future<?> submit(Runnable task)
 *			<T> Future<T> submit(Callable<T> task)
 *		D:�Ҿ�Ҫ������������?
 *			���ԡ�
 */
class MyCallable implements Callable<Integer>{  //δʹ�÷���
    private int number;
    public MyCallable(int number){
    	this.number=number;
    }
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for (int x =1 ; x <=number; x++) {
			sum+=x;
		}
		return sum;
	}
	
}
public class Thread_pool_callable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//�����̳߳ض���
		ExecutorService pool = Executors.newFixedThreadPool(2);//����2���߳�
				
		//����ִ��Runnable�������Callable���������߳�
		Future<Integer> f1= pool.submit(new MyCallable(100));   //��ʱδʹ�÷��ͣ��޷���ֵ
		Future<Integer> f2= pool.submit(new MyCallable(200));
		
		//ͨ��Future��get()�����õ�����ֵ
		Integer i1=f1.get();
		Integer i2=f2.get();
		
		//�������ֵ
		System.out.println(i1);//5050
		System.out.println(i2);//20100
				
		//����
		pool.shutdown();
	}
}
