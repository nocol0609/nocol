package com.nocol.triangle;

/**
 * @author lxp
 *
 * @TODO
 * 
 */
/*
       ======打印中倒空三角形======
       
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
			//左边部分
			for (int j = i; j <= 5; j++) {
				if (i == 1 || j == i || i == 5)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			//右边部分
			for (int j = i; j <= 4; j++) {
				if (i == 1 || j == 4)//j==4   ？？？
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}
}
