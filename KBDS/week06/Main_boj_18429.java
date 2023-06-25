package com.kbds.w06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_boj_18429 {
	
	static boolean[] isSelected;
	static int N,K;
	static int[] kit, tmpKit;
	static int result;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		kit = new int[N];
		tmpKit = new int[N];
		isSelected = new boolean[N];
		
		st = new StringTokenizer(in.readLine());
		for(int i=0; i<N; i++) {
			kit[i] = Integer.parseInt(st.nextToken());
		}
		result=0;
		perm(0);
		System.out.println(result);
	}
	public static void perm(int cnt) {
		if(cnt == N) {
			int workout =0;
			for(int i=0; i<N; i++) {
				workout += tmpKit[i];
				workout-=K;
				if(workout<0)return;
			}
			result++;
			return;
		}
		for(int i=0; i<N; i++) {
			if(isSelected[i])continue;
			
			tmpKit[cnt] = kit[i];
			isSelected[i] = true;
			perm(cnt+1);
			isSelected[i] = false;
		}
	}

}
