package test.innerclass;
/**
* @author Nocol
*
* @TODO 
* 
*/
/*
             �����ڲ��ࣨ�ֲ��ڲ����һ�֣��� �����ڲ���ļ�д����

                         ǰ�᣺����һ������߽ӿ�
	                          �����������Ǿ�����Ҳ�����ǳ����ࡣ

                         ��ʽ��
	            new �������߽ӿ���(){
		                         ��д����;
	            }
	                   ע�����������һ������
	    
               ������ʲô��?
	                          ��һ���̳��˸������ʵ���˸ýӿڵ�������������
*/
//����ӿ�
interface Inter{
	public abstract void study();
	public abstract void show();
}
//
class Outer6{
	public void method(){
		//һ������ʱ
		/*
		new Inter(){
			public void study(){
				System.out.println("study");
			}
		}.study();
		*/
		//��������ʱ���ӿ�������������Ҫʵ��
		/*
		new Inter(){
			public void study() {
				System.out.println("study");
			}
			public void show() {
				System.out.println("show");
			}
		}.study();
		
		new Inter(){
			public void study() {
				System.out.println("study");
			}
			public void show() {
				System.out.println("show");
			}
		}.show();	
		*/
		
		//����Ǻܶ���������ͺ��鷳��,�Ľ�
		Inter i=new Inter(){      //��̬������ת�ͣ���ʵ�ֽӿ���Ķ��󸳸��ӿڶ���ʵ��Ϊʵ�������
			public void study() {
				System.out.println("study");
			}
			public void show() {
				System.out.println("show");
			}
		};
		
		i.study();
		i.show();	
	}
	
}

public class InnerClassDemo5 {
	public static void main(String[] args){
		Outer6 o=new Outer6();
		o.method();  //��ӡ study�� show
	}

}
