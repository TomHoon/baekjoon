package BaekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//하하하 Que가 아니라 Stack으로 풀었어야 했네 ^^
//다시 풀어야됨~ 
public class Que_17413 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		StringBuilder sb = new StringBuilder(a);
		StringBuilder sb2 = new StringBuilder();
		
		Queue<Character> que = new LinkedList<Character>();
		int i=0;
		for(i=0; i<sb.length(); i++){
			if(sb.charAt(i)=='<'){
				while(sb.charAt(i)!='>'){
					i++;
				}
				i++;
			}
			if(i>=sb.length())
				break;
			que.add(sb.charAt(i));
		}
		int size = que.size();
		for(int j=0; j<size; j++){
			String str= (que.remove()).toString();
			sb2.append(str);
		}
		System.out.println(sb2);
	}
}
