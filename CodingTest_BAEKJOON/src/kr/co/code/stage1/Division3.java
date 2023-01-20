package kr.co.code.stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);

		System.out.println(a / b);

	}

}
