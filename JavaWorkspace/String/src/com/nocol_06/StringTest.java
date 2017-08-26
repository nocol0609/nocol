package com.nocol_06;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * 需求：把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：
 * 		int[] arr = {1,2,3};	
 * 输出结果：
 *		"[1, 2, 3]"
 * 分析：
 * 		A:定义一个字符串对象，只不过内容为空
 * 		B:先把字符串拼接一个"["
 * 		C:遍历int数组，得到每一个元素
 * 		D:先判断该元素是否为最后一个
 * 			是：就直接拼接元素和"]"
 * 			不是：就拼接元素和逗号以及空格
 * 		E:输出拼接后的字符串
 */
/*public class StringTest {
	public static void main(String[] args) {
		//定义字符串对象，只不过内容为空
		String s="";
		//先把字符串拼接一个"["
		s+="[";
		//定义数组并遍历数组
		int[] arr={1,2,3};
		for(int x=0;x<arr.length;x++){
			// 先判断该元素是否为最后一个
			if(x==arr.length-1){
				s+=arr[x];
				s+="]";
			}else{
				//就拼接元素和逗号以及空格
				s+=arr[x];
				s+=", ";
			}
		}
		System.out.println(s);  //[1, 2, 3]
	}
}
*/
//改进版 用方法实现
public class StringTest{
	public static void main(String[] args) {
		//定义数组
		int[] arr={1,2,3};
		
		//写方法，实现结果
		String result=StringTest.ArrToString(arr);
		String result2=ArrToString(arr);
		System.out.println(result);  //[1, 2, 3]
		System.out.println(result2); //[1, 2, 3]
		
	}
	
	public static String ArrToString(int[] arr){
		//定义字符串对象
		String s="";
		// 先把字符串拼接一个"["
				s += "[";
				
				// 遍历int数组，得到每一个元素
				for (int x = 0; x < arr.length; x++) {
					// 先判断该元素是否为最后一个
					if (x == arr.length - 1) {
						// 就直接拼接元素和"]"
						s += arr[x];
						s += "]";
					} else {
						// 就拼接元素和逗号以及空格
						s += arr[x];
						s += ", ";
					}
				}
		return s;
	}
}