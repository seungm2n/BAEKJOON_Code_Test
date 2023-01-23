package kr.co.code.stage2;

import java.util.Scanner;

public class TestScore3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		s.close();

		System.out.println((a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D" : "F");

	}

}
