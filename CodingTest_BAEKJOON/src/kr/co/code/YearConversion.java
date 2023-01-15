package kr.co.code;

import java.util.Scanner;

public class YearConversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = 543;
		int year = s.nextInt();
		
		System.out.println(year - a);
		
		s.close();
	}

}
