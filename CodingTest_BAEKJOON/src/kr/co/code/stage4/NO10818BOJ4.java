package kr.co.code.stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NO10818BOJ4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int min = 1000001;
		int max = -1000001;

		while (st.hasMoreTokens()) {
			int v = Integer.parseInt(st.nextToken());
			if (v < min) {
				min = v;
			}
			if (v > max) {
				max = v;
			}
		}
		System.out.println(min + " " + max);
	}

}
