package com.nocol_06;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};	
 * ��������
 *		"[1, 2, 3]"
 * ������
 * 		A:����һ���ַ�������ֻ��������Ϊ��
 * 		B:�Ȱ��ַ���ƴ��һ��"["
 * 		C:����int���飬�õ�ÿһ��Ԫ��
 * 		D:���жϸ�Ԫ���Ƿ�Ϊ���һ��
 * 			�ǣ���ֱ��ƴ��Ԫ�غ�"]"
 * 			���ǣ���ƴ��Ԫ�غͶ����Լ��ո�
 * 		E:���ƴ�Ӻ���ַ���
 */
/*public class StringTest {
	public static void main(String[] args) {
		//�����ַ�������ֻ��������Ϊ��
		String s="";
		//�Ȱ��ַ���ƴ��һ��"["
		s+="[";
		//�������鲢��������
		int[] arr={1,2,3};
		for(int x=0;x<arr.length;x++){
			// ���жϸ�Ԫ���Ƿ�Ϊ���һ��
			if(x==arr.length-1){
				s+=arr[x];
				s+="]";
			}else{
				//��ƴ��Ԫ�غͶ����Լ��ո�
				s+=arr[x];
				s+=", ";
			}
		}
		System.out.println(s);  //[1, 2, 3]
	}
}
*/
//�Ľ��� �÷���ʵ��
public class StringTest{
	public static void main(String[] args) {
		//��������
		int[] arr={1,2,3};
		
		//д������ʵ�ֽ��
		String result=StringTest.ArrToString(arr);
		String result2=ArrToString(arr);
		System.out.println(result);  //[1, 2, 3]
		System.out.println(result2); //[1, 2, 3]
		
	}
	
	public static String ArrToString(int[] arr){
		//�����ַ�������
		String s="";
		// �Ȱ��ַ���ƴ��һ��"["
				s += "[";
				
				// ����int���飬�õ�ÿһ��Ԫ��
				for (int x = 0; x < arr.length; x++) {
					// ���жϸ�Ԫ���Ƿ�Ϊ���һ��
					if (x == arr.length - 1) {
						// ��ֱ��ƴ��Ԫ�غ�"]"
						s += arr[x];
						s += "]";
					} else {
						// ��ƴ��Ԫ�غͶ����Լ��ո�
						s += arr[x];
						s += ", ";
					}
				}
		return s;
	}
}