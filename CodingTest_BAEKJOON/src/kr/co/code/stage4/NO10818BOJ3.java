package kr.co.code.stage4;

import java.util.Arrays;
import java.util.Scanner;

public class NO10818BOJ3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}

		s.close();
		
		System.out.println(Arrays.stream(arr).min().getAsInt() + " ");
		System.out.print(Arrays.stream(arr).max().getAsInt());
	}

}
