package operator;

public class OperatorEx2 {
public static void main(String[] args) {
	
	/*
	 * int이하의 자료형은 산술연산시 결과값이 무적권 int
	 * 
	 * int 초과의 자료형은 둘중에 큰자료형으로
	 * 
	 */
	
	
	
	//기본자료형 byte형인 지역변수a를 선언하고 숫자 1로 초기화(대입)
	int a =2147483647;
	//기본자로형 byte형인 지역변수b를 선언하고 숫자 2로 초기화(대입)
	int b =2147483647;
	
	int c = a+b;
	System.out.println(c);
	
}//main() end
}//OperatorEx2
