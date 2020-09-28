package control;

import java.util.Scanner;

public class BreakEx1 {
	public static void main(String[] args) {
	
		/*
		 * break구문만나면 반복문을 멈춤
		 */
		
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("비밀번호를 입력하세요.");
		int password = scan.nextInt();
		if(password==1234) {
			break;
		}
		}//while end
		System.out.println("환영합니다.");
		
//		for(int i=0;i<100000000;i++) {
//			
//			System.out.println(i);
//			if(i>10) {
//				break;
//			}//if end
//		}//for end
		
	}//main end
}//break end
