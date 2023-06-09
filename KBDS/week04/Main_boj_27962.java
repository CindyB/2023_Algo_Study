package com.kbds.w04;

import java.util.Scanner;

public class Main_boj_27962 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		
		for(int i=1; i<N; i++) {
			String str1 = str.substring(0, i);
			String str2 = str.substring(N-i, N);
			
			if(isVitaminStr(str1, str2)) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
	
	public static boolean isVitaminStr(String s, String t) {

		if(s.length()!=t.length())return false;
		int cnt =0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != t.charAt(i)) cnt++;
		}
		if(cnt==1) return true;
		
		return false;
	}
}
