package kr.co.code.stage3;

import java.util.Scanner;

public class Costco {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int total = s.nextInt();				// 총 금액
		int tAmount = s.nextInt();				// 총 수량

		for (int i = 0; i < tAmount; i++) {
			int price = s.nextInt();			// 개별 가격
			int amount = s.nextInt();			// 개별 수량

			total = total - (price * amount);	// 입력 가격 = 총 금액 - (개별 가격 * 개별 수량)
		}
		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
