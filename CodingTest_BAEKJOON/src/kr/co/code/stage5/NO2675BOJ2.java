package kr.co.code.stage5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NO2675BOJ2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String[] str = br.readLine().split(" "); // 공백으로 분리
			
			int R = Integer.parseInt(str[0]); // 형변환(String -> int)
			String S = str[1];

			for (int j = 0; j < S.length(); j++) {
				for (int k = 0; k < R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
