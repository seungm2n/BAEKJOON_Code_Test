package kr.co.code.stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO2439BOJ2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		br.close();

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a - i; j++) {
				sb.append(" ");
			}
			for (int k = 0; k < i; k++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
