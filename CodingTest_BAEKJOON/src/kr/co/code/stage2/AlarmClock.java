package kr.co.code.stage2;

import java.util.Scanner;

public class AlarmClock {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int hour = s.nextInt();		// 시를 저장함
		int min = s.nextInt();		// 분을 저장함

		s.close();

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
