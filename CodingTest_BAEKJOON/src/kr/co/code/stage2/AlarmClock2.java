package kr.co.code.stage2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlarmClock2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int hour = Integer.parseInt(st.nextToken()); // 시를 저장함
		int min = Integer.parseInt(st.nextToken()); // 분을 저장함

		StringBuilder sb = new StringBuilder();

		if (min < 45) { 		// 분이 45분 미만 일 때
			if (hour == 0) {	// 시가 0이면
				hour = 23;		// 시를 23으로 바꿈
				sb.append(hour).append(' ');	// 저장한 시와 뒤에 공백을 넣어줌
			} else {			// 시가 0이 아니면
				hour--;			// 시를 -1
				sb.append(hour).append(' ');	// 시를 -1한 값을 저장하고 뒤에 공백을 넣어줌
			}
			sb.append(min = 60 - (45 - min));	// 입력 받은 분 - 45를 해서 저장
		} 
		else {				// 분이 45 이상이면
			sb.append(hour).append(' ').append(min - 45);
		}

		System.out.println(sb);

	}

}
