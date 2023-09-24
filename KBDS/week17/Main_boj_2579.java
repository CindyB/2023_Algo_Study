package com.kbds.w17;

import java.util.Scanner;

public class Main_boj_2579 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] s = new int[N+1];		
		int[] d = new int[N+1];
		
		for(int i=1; i<=N; i++) {
			s[i] = sc.nextInt();
		}
		d[1] = s[1];
		if(N>=2)d[2] = s[1] + s[2];
		
		for(int i=3; i<=N; i++) {
			d[i] =Math.max(d[i-3]+s[i-1], d[i-2])+s[i];
		}
		System.out.println(d[N]);
	}

}
//연속 3번 못밟음
// 1  2  3  4  5  6(n)
// 10 20 15 25 10 20
// n = max(n-3+n-1 or n-2) + 현재