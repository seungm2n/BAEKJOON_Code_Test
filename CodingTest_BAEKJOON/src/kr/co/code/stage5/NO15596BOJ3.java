package kr.co.code.stage5;

import java.util.Scanner;

public class NO15596BOJ3 {

	static long sum(int[] a) {
		long sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(sum(arr));
	}

}
