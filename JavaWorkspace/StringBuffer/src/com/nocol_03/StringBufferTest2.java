package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���ַ�ʽ��String/StringBuffer��������ƴ�ӳ�һ���ַ���
 */
public class StringBufferTest2 {
	public static void main(String[] args) {
		//��������
		int[] arr = { 44, 33, 55, 11, 22 };
		
		//����String����ʵ��ƴ��
		String result1=StringBufferTest2.arrToString(arr);
		System.out.println("��Stringƴ�ӷ������"+result1 );
		//����StringBuffer����ʵ��ƴ��
		String result2=StringBufferTest2.arrToString2(arr);
		System.out.println("��StringBufferƴ�ӷ������"+result2 );
	}
	//StringBufferƴ�ӷ�
	public static String arrToString2(int[] arr){  //ע���Ƿ���String����
		StringBuffer sb=new StringBuffer();
		
		sb.append("[");
		//�������鲢�õ�ÿһ���ַ�
				for(int x=0;x<arr.length;x++){
					if(x==arr.length-1){
						sb.append(arr[x]);
						sb.append("]");
					}else{
						sb.append(arr[x]);
						sb.append(", ");
					}
				}
		//return sb.toString();//ʹ��toString()������StringBufferת����String
	    return new String(sb); //ʹ��String���¹��췽��StringBufferת����String
	} 
	//Stringƴ�ӷ���
	public static String arrToString(int[] arr){
		String s1="";
		s1+="[";
		
		//�������鲢�õ�ÿһ���ַ�
		for(int x=0;x<arr.length;x++){
			if(x==arr.length-1){
				s1+=arr[x];
				s1+="]";
			}else{
				s1+=arr[x];
				s1+=", ";
			}
		}
		return s1;
	}
}
