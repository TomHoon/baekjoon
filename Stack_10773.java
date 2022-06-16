package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Stack_10773{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<Integer>();
		int result = 0;
		
		int count = sc.nextInt();
		
		while(count!=0){
			int a = sc.nextInt();
			
			if(a==0){
				st.pop();
			}else{
				st.push(a);
			}
			count--;
		}
		while(!st.empty()){
			result += st.pop();
		}
		System.out.println(result);
	}
}

