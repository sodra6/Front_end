package equal;

class A{
	int a;
	
	public A(int a) {
		this.a=a;
	}
	
}

public class Ex1 {

		
	public static void main(String[] args) {
		
		A a=new A(3);
		A b=new A(3);
		a=b;
		System.out.println(a == b);//객체의 항등이란 reference의 비교이다.
		//모든 객체에는 equals 메소드가 있다 == 와 같은 의미, ==은 래퍼런스비교임!!
		
		System.out.println(a.equals(b));
	}
}
