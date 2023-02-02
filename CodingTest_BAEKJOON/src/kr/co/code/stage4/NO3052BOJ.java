package kr.co.code.stage4;

import java.util.HashSet;
import java.util.Scanner;

public class NO3052BOJ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			hs.add(s.nextInt() % 42);
		}
		
		s.close();
		
		System.out.println(hs.size());
	}
}
