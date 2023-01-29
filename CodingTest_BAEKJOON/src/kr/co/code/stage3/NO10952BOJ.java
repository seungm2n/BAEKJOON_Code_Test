package kr.co.code.stage3;

import java.util.Scanner;

public class NO10952BOJ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (true) {
			int a = s.nextInt();
			int b = s.nextInt();

			if (a == 0 && b == 0) {

				break;
			}
			System.out.println(a + b);
		}
	}
}
