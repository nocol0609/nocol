package com.nocol.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
* @author lxp
*
* @TODO 
* 
*/
public class Gather {
	public Collection<Student> gather(String path) throws Exception{
		
		BufferedReader br=new BufferedReader(new FileReader(path));		
		String len=null;
		String[] str=null;
		Student s=null;
		List<Student> list=new ArrayList<Student>();
		while((len=br.readLine())!=null){
			str=len.split(":");
			s=new Student();
			s.setName(str[0]);
			s.setAge(Integer.parseInt(str[1]));
			s.setSex(str[2]);
			list.add(s);
		}
		return list;	
	}
}
