package kr.co.code.stage4;

import java.util.Scanner;

public class NO5597BOJ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr = new int[31];
		
		for (int i = 1; i < 29; i++) {
			int n = s.nextInt();
			arr[n] = 1;
		}
		
		s.close();
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}	
		
	}

}
