package kr.co.code.stage1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NO11382BOJ {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		Long a = Long.parseLong(st.nextToken());
		Long b = Long.parseLong(st.nextToken());
		Long c = Long.parseLong(st.nextToken());
		
		System.out.println(a+b+c);

	}

}
