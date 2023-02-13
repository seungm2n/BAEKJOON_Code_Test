package kr.co.code.stage5;

import java.util.Scanner;

public class NO2675BOJ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int T = s.nextInt();

		for (int i = 0; i < T; i++) {

			int R = s.nextInt();
			String S = s.next();

			for (int j = 0; j < S.length(); j++) {

				for (int k = 0; k < R; k++) {

					System.out.print(S.charAt(j));	// println()이 아님!!
				}
			}
			System.out.println();
		}
	}
}
