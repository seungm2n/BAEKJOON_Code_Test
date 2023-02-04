package kr.co.code.stage4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NO4344BOJ2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int[] arr;

		int C = Integer.parseInt(br.readLine()); // 몇 개의 케이스를 돌려볼 건지

		for (int i = 0; i < C; i++) {
			st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken()); // 학생수 N명을 받음
			arr = new int[N];

			double sum = 0; // 누적 성적을 받을 함수

			for (int j = 0; j < N; j++) {
				int E = Integer.parseInt(st.nextToken()); // 성적을 입력 받음
				arr[j] = E;
				sum += E; // 입력받은 성적 누적 합계

			}
			double avg = (sum / N); // 성적 평균
			double cnt = 0; // 평균 넘는 학생 변수

			for (int j = 0; j < N; j++) {
				if (arr[j] > avg) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", (cnt / N) * 100);
		}
		br.close();
	}
}