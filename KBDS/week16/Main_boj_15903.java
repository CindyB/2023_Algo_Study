package com.kbds.w16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main_boj_15903 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		PriorityQueue<Long> queue = new PriorityQueue<>();
		
		st = new StringTokenizer(in.readLine());
		while(st.hasMoreTokens()) {
			queue.add(Long.parseLong(st.nextToken()));
		}
		for(int i=0; i<m; i++) {
			Long sum = queue.poll();
			sum += queue.poll();
			queue.add(sum);
			queue.add(sum);
		}
		Long result = (long) 0;
		while(!queue.isEmpty()) {
			result += queue.poll();
		}
		
		System.out.println(result);
	}

}
//3 2 6

// 두 숫자를 더한 값의 2배가 되기 때문에 작은 값으로 만들어야함
//1. 5(3+2) 5(3+2) 6 => 16
//2. 3 8(2+6) 8(2+6) => 21
//3. 9(3+6) 2 9(3+6) => 20