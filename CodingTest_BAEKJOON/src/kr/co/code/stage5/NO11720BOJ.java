package kr.co.code.stage5;

import java.util.Scanner;

public class NO11720BOJ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		String str = s.next();
		
		s.close();
		
		int sum = 0;
		
		for (int i = 0; i < N; i++) {
			sum += str.charAt(i) - 48;
		}
		System.out.println(sum);
	}

}
