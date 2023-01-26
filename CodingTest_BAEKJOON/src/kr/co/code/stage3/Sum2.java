package kr.co.code.stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int total = 0;
		for (int i = 0; i <= n; i++) {
			total = total + i;
		}
		System.out.println(total);
	}

}
