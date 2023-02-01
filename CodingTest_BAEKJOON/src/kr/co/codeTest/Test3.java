package kr.co.codeTest;

import java.util.ArrayList;
import java.util.Scanner;

/* 다음에 제시하는 java의 collection을 사용하여 lotto 출력 프로그램을 완성하시오.
 * 	1. 문제 풀이 시 아래에 나열된 java 함수를 이용하여 풀이
 *		- @Collections.shuffle(List<Integer> numList)(배열 혼합)
 *		- @Arrays.sort(int[] num) (정렬)
 *		- @Arrays.toString(int[] num) (배열 내용 조회)
*/
public class Test3 {

	public static void main(String[] args) {

		Lotto lo = new Lotto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호 개수 입력 : ");
		int cnt = sc.nextInt();
		
		for (int i = 1; i <= cnt; i++) {
			System.out.println(i+"번 : "+ lotto.lottoNum());
		}
		String lottoNum() {
			List<Integer> lottoNum = new ArrayList<Integer>();
			
			//입력1) num에 로또 번호를 추가하는 식을 완성하시오.(1~45까지 추가)

			//입력2) 번호를 무작위로 섞으시오.

			//입력3) 묵자위로 섞인 번호그룹에서 6개의 번호를 추출하여 담으시오

			//입력4) 추출된 번호를 순서대로 정렬하시오

			//입력5) 추출된 배열결과를 문자열로 보여줄 수 있도록 처리하여 return하시오
		}

	}

}
