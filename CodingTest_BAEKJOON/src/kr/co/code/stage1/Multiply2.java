package kr.co.code.stage1;

import java.util.Scanner;

public class Multiply2{
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int A = sc.nextInt();
		int B = sc.nextInt();
        
		sc.close();
 
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
	}
 
}
