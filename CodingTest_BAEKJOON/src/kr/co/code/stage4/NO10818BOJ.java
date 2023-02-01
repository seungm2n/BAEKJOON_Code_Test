package kr.co.code.stage4;

import java.util.Arrays;
import java.util.Scanner;

public class NO10818BOJ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int N = s.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = s.nextInt();
		}

		s.close();
		
		Arrays.sort(arr);

		System.out.print(arr[0] + " ");
		System.out.println(arr[arr.length - 1]);

	}

}
