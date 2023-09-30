package com.kbds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_boj_14493 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int N = Integer.parseInt(st.nextToken());
		int current =0;
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int start = current/(a+b)*(a+b);
			int end = start +b;
			
			if(end >= current) current = end+1;
			else current++;	//구간통과
		}
		System.out.println(current);
	}
	/*
	 * 3/5  => 0-5, 8-13, 16-21, 24-29, ---
	 * 4/1  => 0-1, 5-6, ---
	 * 3/3  => 0-3, 6-9, ---
	 * 6/4  => 0-4, 10-4, ---
	 * */
}
