package codeup;

import java.util.Scanner;

public class CodeUp1462 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		int num = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num*(i+1) + size*j;
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
