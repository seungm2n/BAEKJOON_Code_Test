package kr.co.code.stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NO10807BOJ2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 몇개의 정수값을 입력 받을 건지
		int[] arr = new int[N]; // 입력받을 Array

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); // Array에 담음
		}
		int v = Integer.parseInt(br.readLine()); // Array에 담긴 어떠한 값을 셀 건지
		
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			if (v == arr[i]) {
				cnt++;
			}
		}
		br.close();
		System.out.println(cnt);
	}
}
