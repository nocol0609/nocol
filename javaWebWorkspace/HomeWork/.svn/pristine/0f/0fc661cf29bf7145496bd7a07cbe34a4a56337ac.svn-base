package com.test_12;

public class Printer extends Thread
{
	private Storage data;
	
	public Printer(Storage data){
		this.data = data;
	}

	public void run(){
		while(true){			
			synchronized(data){
				if(data.isCount){
					int num = data.getNum();
					System.out.println(num);
					data.isCount = false;				
					if(num==99)
						break;	
					data.notify();
				}
				else{
					try{
						data.wait();
					}catch(Exception e){}
				}
			}
		}
	}
};