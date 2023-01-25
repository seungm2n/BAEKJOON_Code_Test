package kr.co.code.stage3;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int x = s.nextInt();

		s.close();
		int y;
		for (y = 1; y < 10; y++) {
			System.out.println(x + " * " + y + " = " + x * y);
		}

	}

}
