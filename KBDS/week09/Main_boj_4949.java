package com.kbds.w09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main_boj_4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String tmpStr = in.readLine();
			if(tmpStr.equals(".")) break;
			String result = isBalance(tmpStr.toString()) ? "yes" : "no";
			System.out.println(result);
		}
		
	}
	public static boolean isBalance(String sentence) {
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if(ch == '(' || ch == '[') stack.push(ch);
			if(ch == ')') {
				if(!stack.isEmpty() && stack.peek() =='(')stack.pop();
				else return false;
			}
			if(ch == ']') {
				if(!stack.isEmpty() && stack.peek() =='[')stack.pop();
				else return false;
			}
		}
		if(!stack.isEmpty()) return false;
		else return true;
	}

}
