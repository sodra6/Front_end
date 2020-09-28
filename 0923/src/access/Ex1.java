package access;

import test.B;

public class Ex1 {
	
	/*
	 * 접근제한자(access modifier)
	 * - public : 어디서든지 접근 가능
	 
	 * - (default) : 같은 패키지 내부에서만 접근가능
	 
	 * - protected : 같은 패키지와 상속관계일때만 접근 가능
	  
	  
	 * - private : 같은 클래스 내부에서만 접근이 가능합니다.
	 
	 
	 */
	public static void main(String[] args) {
		//A클래스를 가지고 만들어진 객체의 레퍼런스를 담을수있는 지역변수 a를 선언하고
		A a;
		// new라는 키워드로 heap메모리 영역에 공간을 할당받고 A클래스의 생성자를
		// 호출하여 객체를 생성한후 그객체의 레퍼런스를 a에 대입
		a = new A();
		//private으로 선언된 a멤버필드엔느 접근불가
		a.b=10;
		a.c=a;
		a.d="쿠쿠";
		
		String s;
		B b= new B();
		//B와 EX1은 다른패키지에 있기 떄문에(상속관계도 아님) 접근제한자가 public인 d만 접근 가능
		b.d = a.d;
		System.out.println(b.d);
	}//main() end
}//Ex1 end
