package kr.co.code.stage3;

import java.util.Scanner;

public class APlusB2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		int arr[] = new int[t];
		
		for (int i = 0; i < t; i++) {
			int a = s.nextInt();
			int b = s.nextInt();

			arr[i] = a + b;
		}
		s.close();
		
		for(int j:arr ) {
			System.out.println(j);
		}
	}

}
