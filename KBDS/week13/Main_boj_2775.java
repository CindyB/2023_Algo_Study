package com.kbds.w13;

import java.util.Scanner;

public class Main_boj_2775 {
	//    1호 2호 3호 4호
	// 3층 1
	// 2층 1 1+(1+2) 1+(1+2)+(1+2+3)
	// 1층 1 1+2 1+2+3 1+2+3+4
	// 0층 1  2   3  4
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int testCase = 0; testCase<T; testCase++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(func(k,n));
		}
	}
	
	public static int func(int k, int n) {
		if(n==0) return 0;
		else if(k==0) return n;
		else
			return func(k, n-1) + func(k-1,n);
		

	}
}
