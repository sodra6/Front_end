package oop;

class A{
	int c = 1;
}
class B extends A{
	int b= 4;
}
class C extends B{
	int a=7;
}

public class E  extends B{
	int d=4;
	public static void main(String[] args) {
		Object o = new C();
		E e =new E();
		A a= (A)o;
		B b= e;
		C c= (C)a;
//		e = c;
		o = "TEST";
		
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==c);
		System.out.println(o.equals(a));
		System.out.println(b.equals(e));
		System.out.println(c.equals(e));
		System.out.println(c.equals(o));
	}
}
