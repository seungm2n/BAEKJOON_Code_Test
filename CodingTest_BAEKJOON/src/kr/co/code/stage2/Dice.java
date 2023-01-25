package kr.co.code.stage2;

import java.util.Scanner;

//같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다. 

public class Dice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		s.close();

		if (a == b && a == c && b == c) {
			System.out.println(10000 + (a * 1000));
		} else if (a == b || a == c) {
			System.out.println(1000 + (a * 100));
		} else if (b == c) {
			System.out.println(1000 + (b * 100));
		} else {
			System.out.println((Math.max(a, Math.max(b, c)) * 100));
		}

	}

}
