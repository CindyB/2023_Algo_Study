package com.kbds.w12;

import java.util.*;
import java.io.*;

public class Main_boj_14719 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int H = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());
		
		int[] map = new int[W];
		st = new StringTokenizer(in.readLine());
		for (int i = 0; i < W; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		int left =0, right =0;
		int rain = 0;
		
		for(int i=1; i<W-1; i++) {
			left = right = 0;
			
			for(int j=0; j<i; j++) {
				left = Math.max(map[j], left);
			}
			for(int j=i+1; j<W; j++) {
				right = Math.max(map[j], right);
			}
			if(Math.min(left, right) > map[i]) {
				rain += (Math.min(left, right) - map[i]);
			}
		}
		System.out.println(rain);
	}

}
