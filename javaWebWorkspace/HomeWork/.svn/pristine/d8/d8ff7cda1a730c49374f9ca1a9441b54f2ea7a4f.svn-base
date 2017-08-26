package com.test_array_06;

public class test4 {
	public static void main(String[] args) {
		int[][] twoD = new int[4][];
		int[] arr = new int[4];
		twoD[0] = arr;

		twoD[1] = new int[5];
		twoD[2] = new int[6];
		twoD[3] = new int[7];

		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				twoD[i][j] = (int) (Math.random() * 100);
			}
			System.out.println();
		}

		int[] oneD=new int[4];
		oneD=twoD[0];
		oneD[0]=1;
		oneD[1]=2;
		oneD[2]=3;
		oneD[3]=4;
		
		System.out.println("´òÓ¡oneD:");
		for(int i=0;i<oneD.length;i++){
			System.out.print(oneD[i]+"\t");
		}
		
		System.out.println();
		
		System.out.println("´òÓ¡twoD:");
		for (int i = 0; i < twoD.length; i++) {
			for (int j = 0; j < twoD[i].length; j++) {
				System.out.print(twoD[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
