package kr.co.code.stage3;

import java.util.Scanner;

public class NO1110BOJ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		s.close();

		int cnt = 0;
		int C = N;

		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;

			if (C == N) {
				break;
			}

		}
		System.out.println(cnt);
	}

}
