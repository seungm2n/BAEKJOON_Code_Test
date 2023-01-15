package kr.co.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YearConversion2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int a = 543;
		int year = Integer.parseInt(str[0]);
		
		System.out.println(year - a);
		
	}

}
