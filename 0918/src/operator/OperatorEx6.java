package operator;

public class OperatorEx6 {
public static void main(String[] args) {
	
	/*
	 * 비트연산자
	 * 
	 * - |
	 * - &
	 * 
	 * 비트연산자와 논리연산자의 차이
	 * 비트연산은 피연산자 1,2모두 실행됨
	 * 논리연산은 논리(true or false)가 중요하기 떄문에
	 * 피연산자1이 true이거나 false일떄 피연산자 2가 수행되지 않음 
	 *
	 */
	
	byte a = 4;
	byte b = 5;
	
	int  c= a&b;
	System.out.println(true|true);
}//main() end
}//OperatorEx6 end
