package com.kbds.w01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_boj_1251_v2 {

	static String word;
	static String result="";
	static int N, R=2;
	static String words[];
	
	//arrest
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		word = sc.next();
		N = word.length()-1;
		words = new String[3];
		
		combi(0,0);
		System.out.println(result);
	}
	public static void combi(int cnt, int start) {
		if(cnt==R) {
			StringBuilder sb = new StringBuilder();
			words[cnt] = word.substring(start);
			
			for(int i=0; i<3; i++) {
				sb.append(reverse(words[i]));
			}
			String newWord = sb.toString();
			if(result.equals(""))result = newWord;
			else {
				result = result.compareTo(newWord)>0 ? newWord : result;
			}
			return;
		}
		
		for(int i=start; i<N; i++) {
			words[cnt] = word.substring(start,i+1);
			combi(cnt+1, i+1);
		}
	}
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
