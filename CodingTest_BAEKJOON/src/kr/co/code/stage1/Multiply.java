package kr.co.code.stage1;

import java.util.Scanner;

public class Multiply {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int A = sc.nextInt();		// 첫번째 숫자는 int형으로 받음
		String B = sc.next();		// 두번째 숫자는 String형으로 ㅂ다음
        
		sc.close();
 
		// charAt()으로 하나씩 꺼내어 불러옴.
		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
 
	}
}
