package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
	// 오름차순 정렬
	// 중복되면 안됨
	// 절대값이 1,000,000 보다 작거나 같은 정수
	// 수의 갯수 제한 1<= N <= 1,000,000
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		if(count<=0 || count>10000000)
			System.out.println("input 갯수는 1이상 10,000,000 이하입니다.");
		
		int[] arr = new int[count];
		
		//입력 받은 값들을 배열에 저장하기
		for(int i=0; i<count; i++){
			int a= Integer.parseInt(br.readLine());
			if(a>10000){
				System.out.println("10,000보다 작거나 같은 자연수를 기입하세요.");
			}else{
				arr[i] =a;
			}
			
		}
		
		//배열에 저장된 값들을 오름차순으로 정렬하기
		Arrays.sort(arr);
		
		//배열에 저장된 입력받은 값을 출력하기
		for(int i=0; i<count; i++){
			System.out.println(arr[i]);
		}
	}

}
