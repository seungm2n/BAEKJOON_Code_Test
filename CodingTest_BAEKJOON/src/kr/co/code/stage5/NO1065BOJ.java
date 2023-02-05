package kr.co.code.stage5;

import java.util.Scanner;

public class NO1065BOJ {
	// 함수
	public static int arithmetic_sequence(int num) {
		int cnt = 0; 		// 한수 갯수

		if (num < 100) {
			return num;
		} else {
			cnt = 99;

			for (int i = 100; i <= num; i++) {
				int hundred = i / 100; 		// 백의 자리
				int ten = (i / 10) % 10; 		// 십의 자리
				int one = i % 10; 		// 일의 자리

				if ((hundred - ten) == (ten - one)) { 		// 각 자리수가 수열을 이루면
					cnt++; 		// 한수 갯수 증가
				}
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

		System.out.print(arithmetic_sequence(s.nextInt()));
		s.close();

	}

}
