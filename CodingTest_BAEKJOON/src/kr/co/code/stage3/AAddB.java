package kr.co.code.stage3;

import java.util.Scanner;

public class AAddB {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		for (int i = 1; i < t + 1; i++) {
			int a = s.nextInt();
			int b = s.nextInt();
			System.out.println("Case #" + i + ": " + (a + b));
		}
		s.close();
	}

}
