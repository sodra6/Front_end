package oop;

class B {
	int a = 5;
	void test() {
		System.out.println("🍕");
	}
}
class C extends B{
	int a = 10;
	void test() {
		System.out.println("🍟");
	}
}

public class OverridingEx {

	public static void main(String[] args) {
		
		
		/*
		 * 오버라이딩 이란?
		 * - 메소드 재정의
		 * - 상속관계에서 부모에서 물려받은 메소드를 새로운 기능으로 재정의함
		 * - 조상의 메소드를 호출해도 최하위 자손의 메소드가 실행됨
		 */
		
		Object o = new C();
		B b= (B)o;
		C c= (C)b;
		
		String s="TEST";
		System.out.println(s.equals(o));
		System.out.println(o.equals(b));
		System.out.println(b==c);
		System.out.println(c==o);
		
		b.test();//이게 오버라이딩, 완벽히 똑같이만들어야됨 메소드 재정의
		c.test();//상속관계에서 최하위의 메소드만 호출됨
		
	}
	
}
