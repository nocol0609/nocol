package com.nocol_03;

import java.util.Scanner;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 * ģ���¼��������� ��Ϸ,�����λ���,����ʾ���м��Ρ�
 * 
 * ������ A:�����û��������롣�Ѵ��ڵġ� 
 *      B:����¼���û��������롣 
 *      C:�Ƚ��û��������롣 �������ͬ�����¼�ɹ������ǿ����������Ϸ�������һ����ͬ�����¼ʧ��
 *      D:�����λ��ᣬ��ѭ���Ľ��������forѭ����
 */
// ������Ϸ��
class GuessNumber {
	// �����޲ι��췽��
	private GuessNumber() {}

	// ������Ϸ����
	public static void start() {  //����static��̬������ʱ���ô�����������ֱ�ӵ�
		// ���������
		int GuessNumber = (int) (Math.random() * 100) + 1;
       //ѭ��������Ϊֹ
		while (true) {
			// ����Scanner����
			Scanner sc = new Scanner(System.in);
			System.out.println("��������Ҫ�µ�����0-100����");
			int number = sc.nextInt();
			// �ж�
			if (GuessNumber > number) {
				System.out.println("��µ���С��");
			} else if (GuessNumber < number) {
				System.out.println("��µ�������");
			} else {
				System.out.println("�����ˣ�����");
			}
		}
	}
}
public class StringTest {
	public static void main(String[] args) {
		// �����û���������
		String userName = "nocol";
		String password = "123";
		// 3�λ���
		for (int x = 1; x < 4; x++) {
			// ���̻�ȡ������û���������
			Scanner sc = new Scanner(System.in);
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();

			// �ж�
			if (name.equals(userName) && pwd.equals(password)) {
				System.out.println("��¼�ɹ��������������Ϸ��");
					GuessNumber.start();
			} else {
				if ((3 - x) == 0) {
					System.out.println("�û�����");
				} else {
					System.out.println("��¼ʧ�ܣ��㻹��" + (3 - x) + "�λ���");
				}
			}
		}
	}
}
