package com.nocol_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ��ȡ���ܣ�
 * ��ȡ��������ַ������������ַ���ɵĵ���
 * da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
 */
public class RegexGetTest {
	public static void main(String[] args) {
		// �����ַ���
		String s = "da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?";
		// ����
		String regex="\\b[a-zA-Z_0-9]{3}\\b";
		//String regex = "\\b\\w{3}\\b";            //  \b��ʾ���ʱ߽�

		// �ѹ�������ģʽ����
		Pattern p = Pattern.compile(regex);
		// ͨ��ģʽ����õ�ƥ��������
		Matcher m = p.matcher(s);
		// ����ƥ��������Ĺ���
		// ͨ��find�������ǲ�����û�������������Ӵ�
		// public boolean find()
		
		// boolean flag = m.find();//��find();
		// System.out.println(flag);
		
		// // ��εõ�ֵ��?
		// // public String group()
		
		// String ss = m.group();//�ٵ�group();�õ����ҵ���ֵ
		// System.out.println(ss);
		//
		// // ����һ��
		// flag = m.find();
		// System.out.println(flag);
		// ss = m.group();
		// System.out.println(ss);

		while (m.find()) {
			System.out.println(m.group());
		}

		// ע�⣺һ��Ҫ��find()��Ȼ�����group()
		// IllegalStateException: No match found
		// String ss = m.group();
		// System.out.println(ss);
	}
}

