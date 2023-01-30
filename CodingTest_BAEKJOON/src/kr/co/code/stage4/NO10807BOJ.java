package kr.co.code.stage4;

import java.util.Scanner;

public class NO10807BOJ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt(); 		// 몇개의 정수값을 입력 받을 건지
		int[] arr = new int[N]; 	// 입력받을 Array
	
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt(); 	// Array에 담음
		}

		int v = s.nextInt(); 		// Array에 담긴 어떠한 값을 셀 건지
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (v == arr[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
