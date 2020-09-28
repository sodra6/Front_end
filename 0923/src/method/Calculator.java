package method;

public class Calculator {
	
	//void는 리턴값이 없다라는 뜻
	
	//더하는 메소드
	public static int add(int a, int b) {
		return a + b;		
	}
	//빼는 메소드
	public static int subtract(int a, int b) {
		return a-b;
	}	
	//곱하는 메소드
	public static int multiply(int a, int b) {
		return a*b;
	}
	//나누는 메소드
	public static float divide(int a, int b) {
		return (float) a/b;
	}
	
	/*
	 * 멤버필드의 선언
	  1) 접근제한자 2) (instance)static 3) 자료형 4) 이름
	  
	  멤버메소드의 선언
	  1) 접근제한자 2)스테틱 3)리턴자료형 메소드명(인자...){
	  		구문 작성....
	  }
	  
	 */
	
}
