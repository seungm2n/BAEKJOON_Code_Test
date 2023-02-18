package kr.co.code.stage5;

import java.util.Scanner;

public class NO1157BOJ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr = new int[26]; // 영문자의 갯수
		String str = s.next();

		for (int i = 0; i < str.length(); i++) {
			// 대문자를 받았을 경우 아스키코드 값에서 대문자의 범위
			if (65 <= str.charAt(i) && str.charAt(i) <= 90) {
				arr[str.charAt(i) - 65]++; // 65는 대문자 'A'로 대체 가능
			}
			// 소문자를 받았을 경우 아스키코드 값에서 소문자의 범위
			else {
				arr[str.charAt(i) - 97]++; // 97은 소문자 'a'로 대체 가능
			}
		}

		int max = 0;
		char ch = 'a';

		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				// 대문자로 출력해야하기 때문에 65를 더해줌
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}

}
