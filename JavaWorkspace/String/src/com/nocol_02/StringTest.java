package com.nocol_02;
/**
* @author lxp
*
* @TODO 
* 
*/
/*������һ��
 * 
 * String s = new String(��hello��) �� String s = ��hello��;������?
 * �С�ǰ�߻ᴴ��2�����󣨶��ڴ�һ����������һ���������ߴ���1�����󣨷���������
 * 
 * ==:�Ƚ��������ͱȽϵ��ǵ�ֵַ�Ƿ���ͬ���Ƚϻ�������ʱ�Ƚϵ���ֵ�Ƿ���ͬ
 * 
 * equals:�Ƚ���������Ĭ��Ҳ�ǱȽϵ�ֵַ�Ƿ���ͬ����String����д��equals()�������Ƚϵ��������Ƿ���ͬ��
 */
public class StringTest {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";

		System.out.println(s1 == s2);// false
		System.out.println(s1.equals(s2));// true
	}
}
