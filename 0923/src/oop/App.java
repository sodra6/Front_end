package oop;

public class App {
	/*
	 * 멤버에 접근할때는 인스턴스는 객체의 레퍼런스. 으로 접근
	 * static은 클래스명. 으로 접근
	 * 
	 */
	static int a;

	public static void main(String[] args) {
		
		App.a = 7;
		
		/*
		 * 자바 프로그램이 실행되면 우선 static으로 선언된 멤버들(필드, 메소드)이
		 * 먼저 static메모리영역에 로딩됨,
		 *  그리고 main메소드를 JVM이 호출하여 프로그램이 시작됨
		 * static으로 선언된 멤버들은 객체를 생성하지 않고 바로 사용가능(대입 및 호출)
		 * 
		 */
		
		A.b=5;
		A a = new A();
		a.a=100;
		
		A b=new A();
		System.out.println(b.a);
	}//main end
	
}//App end
