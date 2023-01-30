package kr.co.code.stage3;

import java.util.Scanner;

public class NO1110BOJ2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		s.close();

		int cnt = 0;
		int C = N;

		do {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;

		} while (C != N);

		System.out.println(cnt);
	}

}
