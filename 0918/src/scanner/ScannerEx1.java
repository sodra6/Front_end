package scanner;

import java.util.Scanner;

public class ScannerEx1 {
public static void main(String[] args) {
	
	/*
	 * 자바개발자들이 만들어 놓은 수많은 클래스들이 있다.
	 * (그 클래스 안에는 수많은 메소드가 있다.)
	 * 그래서 위의 클래스나 메소드들을 엮어놓은 것을 API라고 한다.
	 * (JDK안에 존재함)
	 */
	
	
	/* 
	 * 같은 패키지 안에 있는 클래스들은 그냥 사용이 가능한데,
	 * 다른 패키지에 있는 클래스들은 반드시 import하여야 합니다.
	 * 
	 */
	
	int i;
	
// 객체자료형 Scanner클래스형 지역변수 scan을 선언.-> "사전적 의미"
// Scanner클래스를 가지고 만들어진 객체의 레퍼런스를 담을 수 있는 지역변수 scan을 선언->"실제 의미"
	Scanner scan;
//Scanner생성자를 호출하여 객체를 생상후 scan변수에 대입! 호출하면 객체가 만들어진다.
	scan = new Scanner(System.in);
	
	System.out.println("당신의 이름은?");
	
	/* Scanner클래스가 가진 메소드중에
	* - nextLine() : 유저에게 문자열을 한줄을 입력받는 메소드
	* - nextInt() : 정수형 한개 입력받는 메소드
	*/
	String name = scan.nextLine();
	System.out.println("당신의 이름은"+name+"입니다.");
	
	/*
	 * new라는 키워드로 heap메모리 영역에 공간을 할당받고 Scanner클래스의 생성자를 호출하여
	 * Scanner객체를 생성후 그 래퍼런스를 scan변수에 대입
	 * 
	 */
	
}//main()end
}//ScannerEx1 end
