package kr.co.code.stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO2562BOJ2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 9개의 정수 값을 입력 받음
		int[] arr = new int[9];
		// 9개의 정수 값을 받도록 for문 구현
		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		br.close();
		
		int cnt = 0;
		int max = 0;
		int result = 0;
		for (int i : arr) {
			cnt++;						// arr에서 하나씩 꺼낼 때마다 cnt +1 증가
			if (i > max) {				// max 초기 값이 0이니 0보다 크면 i로 저장, 하나씩 꺼내어 비교하면서 큰 값을 저장함
				max = i;				// 비교하여 큰 값을 max로 저장
				result = cnt;			// 몇 번째로 꺼냈는지도 저장
			}
		}
		System.out.println(max);		// 가장 큰 값 출력
		System.out.println(result);		// 가장 큰 값이 몇 번째 숫자인지 출력
	}
}
