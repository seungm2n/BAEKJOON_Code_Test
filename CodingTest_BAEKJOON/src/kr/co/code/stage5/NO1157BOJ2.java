package kr.co.code.stage5;

import java.io.IOException;

public class NO1157BOJ2 {
	public static void main(String[] args) throws IOException {
		 
		int[] arr = new int[26]; 
		int read = System.in.read();
 
		while (read > 64) {	// 엔터를 누르면 종료됨
			
			if (read < 91) {
				arr[read - 65]++;
			} else {
				arr[read - 97]++;
			}
			read = System.in.read();
		}
 
 
		int max = 0;
		int ch = 'a';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = i;
			} else if (arr[i] == max) {
				ch = -2;
			}
		}
		System.out.print((char) (ch+65));
	}
 
}
