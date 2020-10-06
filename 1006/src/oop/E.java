package oop;
class A extends Object{
	int a =1;
}
public class E extends A{
	int a=10;
	
	public static void main(String[] args) {
		
		Object e = new E();
		A a =(A) e;
		E o =(E) e;
		System.out.println(a.a);
		System.out.println(o.a);
		
		e="TEST";
		a=new E();
		//o=new A();
	}
}
