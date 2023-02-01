package kr.co.code.stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO2562BOJ4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int cnt = 0;
		int max = 0;
		for (int i = 0; i < 9; i++) {

			int v = Integer.parseInt(br.readLine());

			if (v > max) { 		// max 초기 값이 0이니 0보다 크면 i로 저장, 하나씩 꺼내어 비교하면서 큰 값을 저장함
				max = v; 		// 비교하여 큰 값을 max로 저장
				cnt = i + 1;	// 몇 번째로 꺼냈는지도 저장
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}

}
