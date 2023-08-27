package com.kbds.w15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_boj_1325 {

	static int N, M;
	static ArrayList<ArrayList<Integer>> list;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		list = new ArrayList<>();

		for (int i = 0; i <= N; i++) {
			list.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(in.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			list.get(B).add(A);
		}
		int[] computer = new int[N + 1];
		int max = Integer.MIN_VALUE;

		for (int i = 1; i <= N; i++) {
			computer[i] = bfs(i);
			max = Math.max(max, computer[i]);
		}
		for (int i = 1; i <= N; i++) {
			if (max == computer[i])
				System.out.print(i + " ");
		}
	}

	public static int bfs(int num) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[N + 1];
		int cnt = 0;

		queue.offer(num);
		visited[num] = true;

		while (!queue.isEmpty()) {
			int tmp = queue.poll();

			for (int i : list.get(tmp)) {
				if (visited[i]) continue;

				queue.offer(i);
				visited[i] = true;
				cnt++;
			}
		}
		return cnt;
	}

}
/*
 * 1 - 3 2 - 3 3 - 4, 5 4 5
 * 
 * 
 */
/*
 * 1 - 3, 4, 5 2 - 3, 4, 5 3 - 4, 5 4, 5 - x
 */
