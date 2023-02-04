package kr.co.code.stage4;

import java.util.Arrays;
import java.util.Scanner;

public class NO1546BOJ {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		double[] arr = new double[s.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextDouble();
		}
		s.close();

		double sum = 0;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);
		}
		System.out.println(sum / (arr.length));
	}
}
