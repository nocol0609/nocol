package com.nocol.triangle;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
 ======��ӡ������������======
             * 
          *     * 
       *           * 
    *                 * 
 *  *  *  *  *  *  *  *  * 

 */
public class Test8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print("   ");
			}
			// ��벿�֣��ո��ѱ���䣩
			for (int j = 1; j <= i; j++) {
				if (i == 5 || j == 1 )//j==1��ʾ���ſո���ӡ1��
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			// �Ұ벿��
			for (int j = 1; j <= i - 1; j++) {
				if (j == i - 1 || i == 5)//j==i-1��ʾ
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}