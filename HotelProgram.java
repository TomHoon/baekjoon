package BaekJoon;

import java.util.Scanner;

//floors층 rooms방수 N번째 손님
public class HotelProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int repeat = scan.nextInt();
		
		for(int i=1; i<=repeat; i++){
			int floors = scan.nextInt();
			int rooms = scan.nextInt();
			int n = scan.nextInt();
			
			int roomNumber =0;
			//층수		
			if(n%floors==0){
				roomNumber = (n/floors);
			}else{
				roomNumber = (n/floors)+1;
			}
			//호수
			int roomFloor = 1;
			
			if(n%floors==0)
				roomFloor = 6;
			else
				roomFloor = n%floors;
			
			if(roomNumber>=10){
				String result = roomFloor + "" + roomNumber;
				System.out.println(result+"호 입니다.");
			}else{
				String result = roomFloor + "0" + roomNumber;
				System.out.println(result+"호 입니다.");
			}
		
		
	}
	}
}


