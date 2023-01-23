package kr.co.code.stage2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TestScore4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		System.out.println((a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D" : "F");
	}
}
