package kr.co.code.stage1;

import java.util.Scanner;

public class Addition1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a+b);
		
		s.close();
	}
}