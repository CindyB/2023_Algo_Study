package com.kbds.w02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_boj_1316 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		int result =0;
		for(int i=0; i<N; i++) {
			String word = compressWord(in.readLine());
			result+=checkDulicate(word);
		}
		System.out.println(result);
	}
	public static String compressWord(String word) {
		StringBuilder sb = new StringBuilder();
		
		char current = word.charAt(0);
		sb.append(current);
		
		for(int i=1; i<word.length(); i++) {
			char next = word.charAt(i);
			if(current == next)continue;
			
			sb.append(next);
			current = next;
		}
		return sb.toString();
	}
	public static int checkDulicate(String word) {
		
		if(word.length()==1)return 1;
		
		for(int i=0; i<word.length(); i++) {
			for(int j=i+1; j<word.length(); j++) {
				if(word.charAt(i) == word.charAt(j))return 0;
			}
		}
		return 1;
	}
	

}
