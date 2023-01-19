package kr.co.code;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Cat3 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\    /\\");
		bw.newLine();			// 줄 개행
		
		bw.write(" )  ( ')");
		bw.newLine();
		
		bw.write("(  /  )");
		bw.newLine();
		
		bw.write(" \\(__)|");
				
		bw.flush();				// 스트림에 들어있는 데이터를 비움
		bw.close();				// 스트림 종료
	}
}
