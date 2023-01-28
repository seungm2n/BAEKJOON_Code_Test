package kr.co.code.stage3;

import java.util.Scanner;

public class NO2439BOJ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		s.close();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
