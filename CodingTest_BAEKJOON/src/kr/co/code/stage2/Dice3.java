package kr.co.code.stage2;

import java.util.Scanner;

//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. 

public class Dice3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		s.close();

		if (a != b && a != c && b != c) {		// a, b, c가 모두 다른 숫자 일 경우,
			int top;
			if (a > b) {						// b보다 a가 큰지
				if (c > a) {					// 크면 c가 a보다 큰지
					top = c;					// c가 크다면 c가
				} else {						// 그렇지 않으면
					top = a;					// a가 가장 큰 숫자
				}
			} else {							// b보다 a가 크지 않으면
				if (c > b) {					// c랑 b를 비교해서 c가 크면
					top = c;					// c가 가장 큰 숫자
				} else {						// c랑 b를 비교해서 b가 크면
					top = b;					// 가장 큰 숫자는 b
				}
			}
			System.out.println(top * 100);		// 가장 큰 숫자와 100을 곱해줌.
		} 
		else {
			if (a == b && a == c) {				// a, b, c가 모두 같을 때
				System.out.println(10000 + a * 1000);
			} else {
				if (a == b || a == c) {			// a, b, c 중 두 숫자만 같을 경우
					System.out.println(1000 + a * 100);
				} else {						// a, b, c 중 두 숫자만 같을 경우
					System.out.println(1000 + b * 100);
				}
			}
		}
	}
}
