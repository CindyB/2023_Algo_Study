package com.kbds.w10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main_boj_2002 {


	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(in.readLine());
		
		ArrayList<String> before = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			before.add(in.readLine());
		}
		
		int result=0;
		int order = 0;
		for(int i=0; i<N; i++) {
			String after = in.readLine();			
			if(after.equals(before.get(order))) {
				order++;
			}else {
				before.remove(after);
				result++;
			}
		}
		System.out.println(result);
	
	}

}
