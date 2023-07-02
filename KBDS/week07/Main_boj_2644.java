package com.kbds.w07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_boj_2644 {

	static int N, M, adj[][];
	static Queue<Integer> queue;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(in.readLine());
		int target1 = Integer.parseInt(st.nextToken());
		int target2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(in.readLine());
		M = Integer.parseInt(st.nextToken());
		
		adj = new int[N+1][N+1];
		visited = new boolean[N+1];
		
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(in.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			adj[x][y] = y;
			adj[y][x] = x;
		}
		queue = new LinkedList<Integer>();
		
		queue.offer(target1);
		
		
		int result = -1;
		
		while(!queue.isEmpty()) {
			result++;			
			int size = queue.size();
			while(--size >=0) {
				int find = queue.poll();
				visited[find] = true;
				
				if(find == target2) {					
					System.out.println(result);
					return;
				}
				for(int i=1; i<=N; i++) {
					int tmp = adj[find][i];
					if(visited[tmp] || tmp == 0) continue;
					queue.offer(tmp);
				}
			}
			
		}
		System.out.println(-1);
//		for(int i=1; i<=N; i++) {
//			System.out.println(Arrays.toString(adj[i]));
//			
//		}
		
	}

}
