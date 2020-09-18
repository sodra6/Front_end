package operator;

public class OperatorEx1 {
	public static void main(String[] args) {
	
		/*
		 * 산술연산자(숫자끼리)
		 * 1) + : 덧셈연산, 
		 *        문자열합침연산(산술연산 X)
		 * 
		 * 		  피연산자중에 하나라도 문자열이 있으면
		 * 		  나머지 하나도 문자열로 변경하여 합침.
		 * 2) - : 뺄셈연산
		 * 3) * : 곱셈연산
		 * 4) / : 나눗셈연산
		 * 5) % : 나머지연산
		 * 
		 */
		
		//클래스는 객체자료형이다.
		String s = "4";
		int i = 2;
		System.out.println(s+i);
		
		//덧셈연산
		int a=4;
		int b=5;
		
		int result=a+b;
		System.out.println("4+5="+result);
		//뺄셈연산
		result=a-b;
		System.out.println("4-5="+result);
		//곱셈연산
		result=a*b;
		System.out.println("4*5="+result);
		//나눗셈연산
		int c=5;
		int d=2;
		double result2 = (double)c/d;
		
		System.out.println("5/2="+result2);
		//나머지연산(홀수, 짝수...)
		result = c%d;
		System.out.println("5%2="+result);
		
		
	}//main() end
}//OperatorEx1 end
