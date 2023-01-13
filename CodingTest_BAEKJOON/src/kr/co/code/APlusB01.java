package kr.co.code;

import java.util.Scanner;

public class APlusB01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력 : ");
		int a = s.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int b = s.nextInt();
		
		System.out.println(a+b);
		
		s.close();
	}
}