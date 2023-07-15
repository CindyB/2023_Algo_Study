package com.kbds.w09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_boj_3107 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String tmp = in.readLine();
		StringTokenizer st = new StringTokenizer(tmp.replace("::", "#:"),":");
		StringBuilder sb = new StringBuilder();
		String[] zero = {"","000", "00", "0"};
		int cnt = 0;
		while(st.hasMoreTokens()) {
			String group = st.nextToken();
			
			int len = group.length();
			if(group.charAt(len-1)=='#')len--;
			
			if(len==0)cnt--;
			if(len<4) {
				sb.append(zero[len]);
			}
			cnt++;
			sb.append(group);
			sb.append(":");
//			System.out.println(group);
		}
		sb.setLength(sb.toString().length()-1);
//		System.out.println(sb.toString());
//		System.out.println(cnt);
		StringBuilder case2= new StringBuilder();
		cnt = 8-cnt;
		while(cnt>0) {
			case2.append(":0000");
			cnt--;
		}
		
		StringBuilder result= new StringBuilder();
		
		if(case2.length()!=0) {
			String str = sb.toString().replace("#", case2.toString());
			if(str.charAt(0)==':')	result.append(str.substring(1));
			else result.append(str);
		}else {
			result.append(sb.toString());
		}
		
		System.out.println(result.toString());
//		 0022
	}

}
