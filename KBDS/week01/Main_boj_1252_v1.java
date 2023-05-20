package com.kbds.w01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_boj_1252_v1 {

	//arrested
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String[] words = new String[3];
		String result="";
		
		for(int i=0; i<word.length()-2; i++) {
			for(int j=i+1; j<word.length()-1; j++) {
				//나누기
				words[0] = word.substring(0,i+1);
				words[1] = word.substring(i+1,j+1);
				words[2] = word.substring(j+1);
				//뒤집기
				words[0] = reverse(words[0]);
				words[1] = reverse(words[1]);
				words[2] = reverse(words[2]);
				//합치기
				StringBuilder sb = new StringBuilder();
				sb.append(words[0]);
				sb.append(words[1]);
				sb.append(words[2]);
				
				String newWord = sb.toString();
				if(result.equals(""))result = newWord;
				else {
					result = result.compareTo(newWord)>0 ? newWord : result;
				}
			}
		}
		System.out.println(result);
				

	}
	public static String reverse(String str) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=str.length()-1; i>=0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
}
