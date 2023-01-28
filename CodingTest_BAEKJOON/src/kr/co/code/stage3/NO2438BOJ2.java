package kr.co.code.stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO2438BOJ2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		br.close();

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				sb.append("*"); 	// 반복 횟수만큼 작성하고 sb에 저장
			}
			sb.append("\n"); 		// 줄바꿈 처리를 해줌
		}
		System.out.println(sb);		// sb에 있는 데이터를 한번에 꺼내어 출력
	}
}
