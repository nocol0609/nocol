package com.nocol.test1;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ��̬����顢��������͹��췽����ִ��˳��
 * 
 * ��̬�����-->��������-->���췽��    (***��̬�����ִֻ��һ��***)
 * 
 * ��˧��-->��˧��nocol-->��̬�����-->��������-->���췽��-->��������-->���췽��
 * (�ȼ���class CodeDemo���ڴ棬��ʱ���õ�������ִ�о�̬����飬��ִ��main����)
 */
class Code{
	static{
		System.out.println("��̬�����");
	}
	
	{
		System.out.println("��������");
	}
	
	public Code(){
		System.out.println("���췽��");
	}
}
public class CodeDemo {
	static{
		System.out.println("��˧��");
	}
	public static void main(String[] args){
		
		System.out.println("��˧��nocol");
		
		Code c1=new Code();
		Code c2=new Code();
		
	}
}
