package kr.co.code.stage5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NO1152BOJ2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 공백을 기준으로 나눈 토큰들을 저장한다
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// countTokens()를 사용하여 토큰의 개수를 반환한다
		System.out.println(st.countTokens());

	}

}