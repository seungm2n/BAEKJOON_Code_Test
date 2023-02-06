package kr.co.code.stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NO11720BOJ2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		
		for (byte v : br.readLine().getBytes()) {
			sum += v - 48;
		}
		System.out.println(sum);
	}

}
