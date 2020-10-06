package practice;

class A{
	int a=5;
	void test() {
		a=10;
	}
}

public class Ex extends A {
	int a = 100;
	void test() {
		a=500;
	}
		public static void main(String[] args) {
			
			A a= new Ex();
			a.test();
			System.out.println(a.a);
		}
	
}
