package com.nocol.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
* @author lxp
*
* @TODO 
* 
*/
public class ByteTest {
	public static void main(String[] args) {
/*		int num=-10>>2;
		System.out.println(num);//2
		//1000 1010(原码)------> 1111 0110(补码-负数)--（向右移2位，高位补1）--1111 1101（补码）
		                                          //---(变源码，取反加1)--1000 0011（-3）
*/	
		byte[]  bys={1,2,3,4,5};
		ByteArrayInputStream bis=new ByteArrayInputStream(bys);
		
		BufferedInputStream bus=new BufferedInputStream(bis,3);
		//System.out.println(bus.markSupported());//true
		try {
			System.out.println(bus.read());
			System.out.println("mark");
			bus.mark(3);
			System.out.println("first:"+bus.read());
			System.out.println("first:"+bus.read());
			
			System.out.println("reset");
			bus.reset();
			System.out.println("seconde:"+bus.read());
			System.out.println("seconde:"+bus.read());
			System.out.println("seconde:"+bus.read());
			
			System.out.println("reset");
			bus.reset();
			System.out.println("third:"+bus.read());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
/*		//字节输出流
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		bos.write(10);
		bos.write(-10);
		//1000 1010(原码)------> 1111 0110(补码)
		byte[] bys=bos.toByteArray();
		//字节输入流
		ByteArrayInputStream bis=new ByteArrayInputStream(bys);
		
		//略过
		bis.skip(-1);
		
		int date=0;
		while((date=bis.read())!=-1){
			System.out.println(date);
		}*/
		
//		for(int i=0;i<bys.length;i++){
//			System.out.println(bys[i]);
//		}
	}
}
