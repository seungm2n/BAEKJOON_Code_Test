package kr.co.code.stage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Costco2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		

		int total = Integer.parseInt(br.readLine());
		int tAmount = Integer.parseInt(br.readLine());

		for (int i = 0; i < tAmount; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int price = Integer.parseInt(st.nextToken());
			int amount = Integer.parseInt(st.nextToken());

			total = total - (price * amount);
		}
		if (total == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
