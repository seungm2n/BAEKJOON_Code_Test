package kr.co.code.stage2;

import java.util.Scanner;

public class OvenClock {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();		// 시(1)
		int b = s.nextInt();		// 분(2)
		
		int c = s.nextInt();		// 걸리는 시간(3)
		
		s.close();
		
		int min = 60 * a + b; 		// (1)+(2)를 분으로 변환(4)
		min = min + c;				// (4)+(3)을 더해줌(5)
		
		// (5)를 시 분으로 나눔
		int h = (min/60) % 24;
		int m = min % 60;
		
		System.out.println(h + " " + m);
		
	}
}
