package kr.co.code.stage4;

import java.util.Arrays;
import java.util.Scanner;

public class NO2562BOJ3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = s.nextInt();
		}

		s.close();

		int cnt = 0;
		int max = 0;
		int result = 0;
		for (int i : arr) {
			cnt++; 					// arr에서 하나씩 꺼낼 때마다 cnt +1 증가
			if (i > max) { 			// max 초기 값이 0이니 0보다 크면 i로 저장, 하나씩 꺼내어 비교하면서 큰 값을 저장함
				max = i; 			// 비교하여 큰 값을 max로 저장
				result = cnt; 		// 몇 번째로 꺼냈는지도 저장
			}
		}

		System.out.println(Arrays.stream(arr).max().getAsInt()); // 최대값을 구함
		System.out.println(result);
	}

}
