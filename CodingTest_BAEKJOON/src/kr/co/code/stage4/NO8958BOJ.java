package kr.co.code.stage4;

import java.util.Scanner;

public class NO8958BOJ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String arr[] = new String[s.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.next();
		}
		
		s.close();

		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;
			int sum = 0;

			for (int j = 0; j < arr[i].length(); j++) {

				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}