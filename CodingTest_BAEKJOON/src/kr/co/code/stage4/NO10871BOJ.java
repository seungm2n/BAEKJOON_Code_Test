package kr.co.code.stage4;

import java.util.Scanner;

public class NO10871BOJ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int X = s.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i < N; i++)
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
	}
}
