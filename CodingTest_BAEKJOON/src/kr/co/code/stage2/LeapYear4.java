package kr.co.code.stage2;

import java.util.Scanner;

public class LeapYear4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		s.close();

		System.out.print((a % 4 == 0) ? ((a % 400 == 0) ? "1" : (a % 100 == 0) ? "0" : "1") : "0");

	}

}
