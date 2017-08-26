package com.nocol.io;

import java.io.File;

/**
* @author lxp
*
* @TODO 
* 
*/
public class FileTest {
	public static void main(String[] args) throws Exception{
		//绝对路径
		File file=new File("I:\\JavaWorkspace\\Test\\a.txt");
		//相对路径
		File file2=new File("b.txt");
		File file3=new File("b.txt2");
		File file4=new File("./test3");
		file2.renameTo(file3);
		System.out.println(file2);
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println("----------------------");
		System.out.println(file.getParent());//绝对路径
		System.out.println(file2.getParent());//相对路径
		System.out.println("-------------------------");
		System.out.println(file.getPath());
		System.out.println(file2.getPath());
		System.out.println("--------------------------");
		System.out.println(file4.getCanonicalPath());
		System.out.println(file4.getAbsolutePath());
		System.out.println(file4.getParent());
		System.out.println(file4.getPath());
		
/*		File file3=new File("src\\com\\nocol\\test");
		File file4=new File("src\\com\\nocol\\io");
		
		if(!file3.exists()){
			file3.mkdirs();
		}
		System.out.println(file3.isDirectory());
		file2.delete();
		
		String[] files=file4.list();
		for(String s:files){
			//System.out.println(s);
			//new File(file3,s).createNewFile();
			new File(file3,s).delete();
		}
		file3.delete();*/
		
		
/*		System.out.println(file.exists());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		//执行权限
		System.out.println(file.canExecute());
		
		if(!file2.exists()){		
			file2.createNewFile();		
		}*/
	}
}
