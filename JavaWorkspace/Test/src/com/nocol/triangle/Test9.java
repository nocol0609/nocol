package com.nocol.triangle;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
       ======��ӡ�е���������======
       
     *  *  *  *  *  *  *  *  * 
        *                 * 
           *           * 
              *     * 
                 * 

 */
public class Test9 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print("   ");
			}
			//��߲���
			for (int j = i; j <= 5; j++) {
				if (i == 1 || j == i || i == 5)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			//�ұ߲���
			for (int j = i; j <= 4; j++) {
				if (i == 1 || j == 4)//j==4   ������
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}