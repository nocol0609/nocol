package com.nocol.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
public class CopyTest {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("test.txt");
		FileOutputStream fos=new FileOutputStream("testOut.txt");
/*		// System.out.println(fis.available());
		int len=0;
		while ((len=fis.read())!=-1) {
			System.out.println((char) len);
		}*/
		byte[] bys=new byte[10];
		int date=0;
		while((date=fis.read(bys))!=-1){
			fos.write(bys, 0, date);
			fos.flush();
		}
		//关闭资源
		fis.close();
		fos.close();
			

/*			System.out.println(fis.read(bys));//9 打印读取的个数，空间只有9，因此只读取9个
			System.out.println(new String(bys));//123456789
			
			System.out.println(fis.read(bys));//1 第二次读取，读取1个
			System.out.println(new String(bys));//023456789，第二次读的将第一个替换
*/
	}
}
