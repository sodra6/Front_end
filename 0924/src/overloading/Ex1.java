package overloading;

public class Ex1 {
	
	static void test(int a, boolean b) {
		System.out.println("U");
	}	
	static void test(boolean b, int a) {
		System.out.println("U");
	}
	static void test() {
		System.out.println("A");
	}
	static void test(int a) {
		System.out.println("B");
	}

static void test(boolean b) {
	System.out.println("F");
}
	

	public static void main(String[] args) {
		
		test(3,true);
		/*
		 * 오버로딩이란?
 			- 이름이 같고 인자가 다른 것
		 
					   -> 인자가 다르다는것은
					  1) 자료형이 다름 
					  2) 개수가 다름. 
					  3) 순서가 다름.
		  접근제한자나 리턴값과는 상관이 없음. 호출할떄 명확히 호출하는 방법이기에
    	 */
		System.out.println(1);
		System.out.println("1");
		System.out.println('1');
		System.out.println(true);
		System.out.println(new Ex1());
		
	}
	
}
