package kr.co.code.stage1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Joonas2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String back = "??!";
		
		String id = br.readLine();
		System.out.println(id + back);
	}

}
