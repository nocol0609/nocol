package com.test_12;

public class Counter extends Thread
{
	private Storage data;	

	public Counter(Storage data){
		this.data = data;
	}
	
	public void run(){
		int num = 0;
		while(num<100){
			synchronized(data){
				if(!data.isCount){//Ã»Êı¾İ				
					data.setNum(num++);
					data.isCount = true;
					data.notify();					
				}else{				
					try{
						data.wait();
					}catch(Exception e){}
				}
			}
		}
	}
};