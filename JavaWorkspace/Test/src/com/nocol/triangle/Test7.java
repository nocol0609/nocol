package com.nocol.triangle;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
    ======��ӡ������״======
               * 
            *     * 
         *           * 
      *                 * 
   *                       *  

*/
public class Test7 {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 4; j++) {
				System.out.print("   ");
			}
			// ��벿��
			for (int j = 1; j <= i; j++) {
				if (j == 1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			// �Ұ벿��
			for (int j = 1; j <= i-1; j++) {
				if (j == i - 1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}
