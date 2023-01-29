package kr.co.code.stage3;

import java.util.Scanner;

public class NO10951BOJ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while (s.hasNextInt()) {
			int a = s.nextInt();
			int b = s.nextInt();

			System.out.println(a + b);
		}
		s.close();
	}

}
