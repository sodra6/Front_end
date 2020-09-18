package scanner;

import java.util.Scanner;

public class ScannerEx2 {
public static void main(String[] args) {
	//객체자료형 Scanner클래스형 지역변수 scan을 선언
	Scanner scan;
	//Scanner 생성자를 호출하여 Scanner 객체생성
	scan = new Scanner(System.in);
	
	System.out.println("당신의 취미는?");
	//유저가 입력한 취미를 받음
	String hobby = scan.nextLine();
	
	System.out.println("당신의 취미는 "+hobby+" 입니다.");
	
}//main() end
}//ScannerEx2 end
