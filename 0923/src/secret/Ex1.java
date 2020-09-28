package secret;

/* 
 * 				!!자바의 숨겨진 비밀 첫번째!!
 * java.lang패키지 안에 있는 클래스들은 빈번하게 사용되기 떄문에
 * 항상 import하면 귀찮아서 편리함을 위해서 생략 가능
 */
					// import java.lang.*;
import java.util.Scanner;
class A{
	static int a;
}

public class Ex1 {

	static int b;
	public static void main(String[] args) {
	
	//같은패키지가 아니면 무적권 임포트해야된다
		
		A.a=10;
		/*
		 * 			!!자바의 숨겨진 비밀 2번째!!
		 * 같은 클래스 내부에서 static멤버들끼리 접근할 때
		 * 클래스명. 을 생략할 수 있다.
		 */
		Ex1.b=5;
		int b;
		b=7;
		String s = "퍽?";
		
		Scanner scan;
		System.out.println(b);
	}//main() end 
	/*
	 * 개발자들이 편리하게 하기 위하여 기본개념에서
	 * 생략되는 것들이 상당히 많이 존재, 
	 * 
	 * 이를 '자바의 숨겨진 비밀'이라고 칭함
	 * 
	 */
}//EX1 end
