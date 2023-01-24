package kr.co.code.stage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmClock3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		
		int hour = Integer.parseInt(st.nextToken());		// 시를 저장함
		int min = Integer.parseInt(st.nextToken());		// 분을 저장함


		if (min < 45) {					// 분이 45분 미만이면
			hour--;						// 시를 -1
			min = 60 - (45 - min);		// 분을 -45
			if (hour < 0) {				// 0시면
				hour = 23;				// 23시로
			}
			System.out.println(hour + " " + min);
		} else {
			System.out.println(hour + " " + (min - 45));		// 분을 -45
		}

	}

}
