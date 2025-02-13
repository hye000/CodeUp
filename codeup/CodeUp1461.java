package codeup;

import java.util.Scanner;

public class CodeUp1461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[][] arr = new int[size][size];
		
		int num = 1;
		
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
			arr[i][j] = (num*size)*(i+1)-j;
			System.out.printf("%d ", (num*size)*(i+1)-j);
			}
			System.out.println();
		}
		sc.close();
	}

}
