package test;

import java.util.Scanner;

public class Main {
		public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			int result = a*b*c;
			System.out.println("result : " + result);
			
			if(result<100){
				double result1 = result/(int) Math.pow(10, 2);
				int result2 = (int) Math.floor(result1);
				System.out.println(result2);
			} else if(result>=100 && result<1000){
				double result1 = result/(int) Math.pow(10, 2);
				int result2 = (int) Math.floor(result1);
				System.out.println(result2);
			} else if(result>=1000 && result<10000){
				double result1 = result/(int) Math.pow(10, 2);
				int result2 = (int) Math.floor(result1);
				System.out.println(result2);
			} else if(result>=10000 && result<100000){
				double result1 = result/(int) Math.pow(10, 2);
				int result2 = (int) Math.floor(result1);
				System.out.println(result2);
			}
		}
	}
	
	