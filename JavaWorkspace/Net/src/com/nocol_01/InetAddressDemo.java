package com.nocol_01;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
* @author lxp
*
* @TODO 
* 
*/
/*
 * ���һ����û�й��췽����
 * A:��Աȫ���Ǿ�̬��(Math,Arrays,Collections)
 * B:�������ģʽ(Runtime)
 * C:�����о�̬�������ظ���Ķ���(InetAddress)
 * 		class Demo {
 * 			private Demo(){}
 * 
 * 			public static Demo getXxx() {
 * 				return new Demo();
 * 			}
 * 		}
 * 
 * ��InetAddress�ĳ�Ա������
 * public static InetAddress getByName(String host):��������������IP��ַ���ַ�����ʾ�õ�IP��ַ����
 */
public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		// public static InetAddress getByName(String host)
		 InetAddress address = InetAddress.getByName("Nocol");
		// InetAddress address = InetAddress.getByName("192.168.56.1");
		 
		// ��ȡ������������������IP��ַ
		// public String getHostName()
		String name = address.getHostName();//������
		
		// public String getHostAddress()
		String ip = address.getHostAddress();//ip��ַ
		
		System.out.println(name + "---" + ip);
	}
}
