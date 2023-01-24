package kr.co.code.stage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());		// 시(1)
		int b = Integer.parseInt(st.nextToken());		// 분(2)
		
		int c = Integer.parseInt(br.readLine());		// 걸리는 시간(3)
		
		int min = 60 * a + b; 		// (1)+(2)를 분으로 변환(4)
		min = min + c;				// (4)+(3)을 더해줌(5)
		
		// (5)를 시 분으로 나눔
		int hour = (min/60) % 24;
		int min2 = min % 60;
		
		System.out.println(hour + " " + min2);
		
	}
}
