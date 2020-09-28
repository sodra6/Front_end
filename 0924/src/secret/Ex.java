package secret;
import java.lang.*;
/*				!!!!!!!! 자바의 숨겨진 비밀 !!!!!!!!!!!!
 * 1) java.lang패키지에 있는 클래스는 빈번하게 사용(임포트 생략가능)
 * 2) 같은 클래스 내부에서 static 멤버들끼리 접근할때 클래스명. 을 생략가능
 * 3) 같은 클래스 내부에서 instance 멤버들끼리 접근시 this. 생략가능
 * 4) 개발자가 단 한개라도 생성자를 한개라도 선언하지 않으면 컴파일시 기본 생성자를 하나 만들어 줍니다.
 * 하지만, 개발자가 단 한개라도 생성자를 선언한다면 컴파일러는 컴파일시 안만들어줍니다.

 */
public class Ex {
	
	static int a;
	int b;
	void test() {
		int b;
		b=10;
	}
		public static void main(String[] args) {
			
			
			
			int a =3;// 지역변수는 자동초기화가 안됨, stack 영역 내에 static과 같은변수명이 생기면
					 // 자바의 숨겨진 비밀 2가 작동 안됨.
			
			Ex e = new Ex();
			e.b = 5;//instance는 객체가 생성이되고 reference로 접근 -> 변수명. 으로 접근
			Ex.a=5;//static은 클래스. 으로 접근
			
			
		}//main() end
	
}//Ex end
