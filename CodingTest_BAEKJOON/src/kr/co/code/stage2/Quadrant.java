package kr.co.code.stage2;

import java.util.Scanner;

public class Quadrant {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		int y = s.nextInt();

		s.close();

		if (x > 0) {
			if (y > 0) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}
		}

		else {
			if (y > 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		}
	}
}
