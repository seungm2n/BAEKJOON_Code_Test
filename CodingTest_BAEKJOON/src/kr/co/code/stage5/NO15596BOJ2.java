package kr.co.code.stage5;

public class NO15596BOJ2 {

	long sum(int[] a) {

		long sum = 0;
		int count = 0;

		while (count < a.length) {
			sum += a[count];
			count++;
		}

		return sum;

	}
}
