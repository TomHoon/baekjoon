package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Stack_17413 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		StringBuilder sb1 = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder();
		Stack<Character> stk = new Stack<Character>();
		
		for(int i=0; i<sb1.length(); i++){
			if(sb1.charAt(i)=='<'){
				while(sb1.charAt(i)!='>'){
					i++;
				}
				i++;
			}
			if(i>=sb1.length() || sb1.charAt(i)=='<')
				break;
			stk.push(sb1.charAt(i));
		}
		int size = stk.size();
		for(int i=0; i<size; i++){
			sb2.append(stk.pop());
		}
		System.out.println(sb2);
		
		
	}
}
