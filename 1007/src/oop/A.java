package oop;

public interface A {

	//상수는 static, final과 주로 같이 많이 쓰임
	
	static final int A=10; // 상수는 대문자로 써야됨~~~
	
	abstract void test();
	
	/*
	 * 인터페이스는 클래스와 클래스간의 접점
	 * 
	 * - 인터페이스는 클래스가 아님
	 *  (생성자 X, 객체 생성 안됨)
	 *  
	 * - 인터페이스는 무적권 상수, 추상메서드만 가짐
	 * - 인터페이스는 상수만 가질수 있기 때문에 static과 final을 생략가능
	 * - 인터페이스는 추상메서드만 가질수 있기 떄문에 abstract를 생략가능
	 * 
	 * - 자바는 다중상속이 불가능한데, 다중구현은 가능함.
	 */
}
