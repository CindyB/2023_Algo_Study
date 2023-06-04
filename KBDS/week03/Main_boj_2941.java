package com.kbds.w03;

import java.util.Scanner;

public class Main_boj_2941 {

	public static void main(String[] args) {
		
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int result=0;
		for(int i=0; i<str.length();) {
			boolean flag = true;
			for(int j=0; j<croatia.length; j++) {
				
				if(i+croatia[j].length() > str.length()) continue;
				String tmp = str.substring(i, i+croatia[j].length());
//				System.out.println(i+" "+ tmp + " vs "+croatia[j]);
				if(tmp.equals(croatia[j])) {
					i+=croatia[j].length();
					flag = false;
					break;
				}
			}
			if(flag) {
				i++;
			}
			result++;
//			System.out.println("==>"+result);
		}
		System.out.println(result);
	}

}
