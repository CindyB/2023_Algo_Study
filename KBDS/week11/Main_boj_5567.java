package com.kbds.w11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_boj_5567 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int M = Integer.parseInt(in.readLine());
		
		int[][] friends = new int[N+1][N+1];
		for(int i=0; i<M; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			friends[a][b] = b;
			friends[b][a] = a;
		}
		boolean[] visited = new boolean[N+1];
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=N; i++) {
			if(friends[1][i]!=0) {
				queue.offer(friends[1][i]);
			}
		}
		visited[1] = true;
		int cnt =-1;
		while(!queue.isEmpty()&&cnt<1) {
			cnt++;
			int size = queue.size();
			while(--size>=0) {
				int find = queue.poll();
				visited[find] = true;
				for(int i=1; i<=N; i++) {
					int tmp = friends[find][i];
					if(visited[tmp] || tmp ==0)continue;
					queue.offer(tmp);
				}
			}
		}
		int result=0;
		for(int i=2; i<=N; i++){
			if(visited[i])result++;
		}
		System.out.println(result);
	}

}
