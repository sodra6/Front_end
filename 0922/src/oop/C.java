package oop;

class A{
	int a;
	A b;
}//A end
class B{
	int a;
	B b;
}

public class C {
	public static void main(String[] args) {
		
		int c = 3;
		A a = new A();
		B b = new B();
		a.a= c;
		int d=5;
		b.a=d;
		a = new A();
		a.b = a;
		b.b = new B();
		
//	//A클래스 객체 생성
//		A a = new A();//생성자만 호출만하면 객체 생성됨
//	  //a.a = a;
//		a.b = 3;
//		System.out.println(a.a.a.a.a.a.b);
//		
		System.out.println(a.b.b.a);
	}//main() end
}//B end
