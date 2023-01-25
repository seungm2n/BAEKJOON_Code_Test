package kr.co.code.stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gugudan2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int y;
		for (y = 1; y < 10; y++) {
			System.out.println(x + " * " + y + " = " + x * y);
		}

	}

}
