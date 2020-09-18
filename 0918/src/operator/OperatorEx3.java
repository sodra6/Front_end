package operator;

public class OperatorEx3 {
public static void main(String[] args) {
	
	/*
	 * ++ / --
	 * 
	 * - 1항연산자
	 * - 증감연산자
	 * - 피연산자 앞에 붙으면 선위, 피연산자 뒤에 붙으면 후위
	 * 
	 *  후위연산자는 대입연산자보다 우선순위가 낮다
	 * 
	 */
	
	int i = 3;
	
	++i; // 선위증가연산자(4)
	i++; // 후위증가연산자(5)
	
	--i;// 선위감소연산자(4)
	i--;// 후위감소연산자(3)
//	System.out.println(i);
	int a=4;
	int b=++a;
	System.out.println(a);
	System.out.println(b);
	
}//main() end
}//OperatorEx3 end
