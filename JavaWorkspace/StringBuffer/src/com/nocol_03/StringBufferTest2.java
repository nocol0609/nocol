package com.nocol_03;
/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 两种方式（String/StringBuffer）把数组拼接成一个字符串
 */
public class StringBufferTest2 {
	public static void main(String[] args) {
		//定义数组
		int[] arr = { 44, 33, 55, 11, 22 };
		
		//调用String功能实现拼接
		String result1=StringBufferTest2.arrToString(arr);
		System.out.println("用String拼接法结果："+result1 );
		//调用StringBuffer功能实现拼接
		String result2=StringBufferTest2.arrToString2(arr);
		System.out.println("用StringBuffer拼接法结果："+result2 );
	}
	//StringBuffer拼接法
	public static String arrToString2(int[] arr){  //注意是返回String类型
		StringBuffer sb=new StringBuffer();
		
		sb.append("[");
		//遍历数组并拿到每一个字符
				for(int x=0;x<arr.length;x++){
					if(x==arr.length-1){
						sb.append(arr[x]);
						sb.append("]");
					}else{
						sb.append(arr[x]);
						sb.append(", ");
					}
				}
		//return sb.toString();//使用toString()方法将StringBuffer转换成String
	    return new String(sb); //使用String类下构造方法StringBuffer转换成String
	} 
	//String拼接方法
	public static String arrToString(int[] arr){
		String s1="";
		s1+="[";
		
		//遍历数组并拿到每一个字符
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
