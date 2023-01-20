package kr.co.code.stage2;

import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		s.close();

		String result = (a > b) ? ">" : ((a < b) ? "<" : "==");
		System.out.println(result);
	}

}
