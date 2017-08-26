package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*输入�?��字符，分别统计出其中英文字母、空格�?数字和其它字符的个数*/

public class Test2 {
	public static void main(String[] args) throws IOException {
		System.out.println("请输入任意字符串:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb=new StringBuffer(br.readLine());
		JudgeElement je=new JudgeElement(sb);
		System.out.println("字母的�?数为:" + je.getCharCount());
		System.out.println("数字的�?数为:" + je.getNumberCount());
		System.out.println("空格的�?数为:" + je.getSpaceCount());
		System.out.println("其它字符的�?数为:" + je.getOtherCount());
	}
}

class JudgeElement {
	StringBuffer sb;
	int charCount = 0;
	int spaceCount = 0;
	int numberCount = 0;
	int otherCount = 0;

	public JudgeElement(StringBuffer sb) {
		// TODO Auto-generated constructor stub
		this.sb = sb;
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z' || (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z')) {
				charCount++;
			} else if (sb.charAt(i) == ' ') {
				spaceCount++;
			} else if (sb.charAt(i) > '0' && sb.charAt(i) < '9') {
				numberCount++;
			} else {
				otherCount++;
			}
		}

	}

	public int getCharCount() {
		return charCount;
	}

	public int getSpaceCount() {
		return spaceCount;
	}

	public int getNumberCount() {
		return numberCount;
	}

	public int getOtherCount() {
		return otherCount;
	}
}

