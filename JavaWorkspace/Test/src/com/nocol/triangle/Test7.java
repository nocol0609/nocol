package com.nocol.triangle;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
    ======打印正人字状======
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
			// 左半部分
			for (int j = 1; j <= i; j++) {
				if (j == 1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			// 右半部分
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
