package kr.co.code.stage3;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int total = 0;
		for (int i = 0; i <= n; i++) {
			total = total + i;
		}
		System.out.println(total);
	}

}
