package com.kbds.w03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main_boj_17952 {

	static class HomeWork{
		int A, T;
		
		public HomeWork(int A, int T) {
			this.A=A;
			this.T=T;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		Stack<HomeWork> stack = new Stack<>();
		int result =0; 
		
		for(int i=0; i<N; i++) {
			
			StringTokenizer st = new StringTokenizer(in.readLine());
			int caseType = Integer.parseInt(st.nextToken());
			if(caseType==0) {
				if(!stack.empty()) {
					HomeWork hw = stack.pop();
					hw.T--;
					if(hw.T==0) {
						result+=hw.A;
					}else {
						stack.push(hw);
					}
				}
				
			}else {
				int A = Integer.parseInt(st.nextToken());
				int T = Integer.parseInt(st.nextToken());
				T-=1;
				if(T==0) result+=A;
				else stack.push(new HomeWork(A, T));
			}
			
		}
		System.out.println(result);
		
	}

}
