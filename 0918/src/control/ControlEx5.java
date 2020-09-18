package control;

import java.util.Scanner;

public class ControlEx5 {

	public static void main(String[] args) {
		System.out.println("단을 입력(2~9까지)");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=2 ; i<10; ++i) {
			System.out.println(num*i);
		}//for end
	}//main() end
	
}//ControlEx5
