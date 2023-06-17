package com.kbds.w05;

import java.util.Scanner;

public class Main_boj_28224 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result =0;
		for(int i=0; i<N; i++) {
			result += sc.nextInt();
		}
		System.out.println(result);
	}

}
