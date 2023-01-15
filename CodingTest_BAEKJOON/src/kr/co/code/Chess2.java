package kr.co.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chess2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		String[] str = br.readLine().split(" ");
		king = king - Integer.parseInt(str[0]);
		queen = queen - Integer.parseInt(str[1]);
		rook = rook - Integer.parseInt(str[2]);
		bishop = bishop - Integer.parseInt(str[3]);
		knight = knight - Integer.parseInt(str[4]);
		pawn = pawn - Integer.parseInt(str[5]);
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn);	

	}

}
