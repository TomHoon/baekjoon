package test;

import java.util.Arrays;
import java.util.Scanner;

//N개의 수를 선언한 뒤 N개의 숫자를 N줄로 나열하여 기입함.
//기입한 숫자들을 오름차순으로 정렬하여 한줄에 하나씩 출력
public class ArraySort {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		for(int i=0; i<length; i++){
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<length; i++){
		 System.out.println(arr[i]);	
		}
		
	}
}
