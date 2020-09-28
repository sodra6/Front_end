package ex;

class A {

	int a;
	int test(int a, int b) {
		return a + b;
	}}
public class Test {
	public static void main(String[] args) {
		A b = new A();
		int a = b.test(6, 5);
		a= b.test(b.a, a);
		System.out.println(a);
	}//main end
}//Test end