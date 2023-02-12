package kr.co.code.stage5;

import java.util.Scanner;
 
public class NO10809BOJ {
 
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
 
		int[] arr = new int[26];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
 
		String str = s.nextLine();
 
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
 
		for(int v : arr) {	// 배열 출력
			System.out.print(v + " ");
		}
	}
}