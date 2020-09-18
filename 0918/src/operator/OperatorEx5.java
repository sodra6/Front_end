package operator;

public class OperatorEx5 {

	
	public static void main(String[] args) {
		
		/*
		 * 논리 연산자
		 * 
		 * 논리곱 : &&(true = 1, false = 0 값이 1일때만 true 모두 true일때만 true)
		 * 피연산자1 | 피연산자2 | 결과값
		 *   true	 |	 true    |  true
		 *   true	 |	 false   |  false
		 *   false   |	 true    |  false
		 *   false	 |	 false   |  false
		 * 
		 * 
		 * 논리합 : ||(true = 1, false = 0 일때 1이상이면 true, 모두 false일때만 false) 
		 * 피연산자1 | 피연산자2 | 결과값
		 *   true	 |	 true    |  true
		 *   true	 |	 false   |  true
		 *   false   |	 true    |  true
		 *   false	 |	 false   |  false
		 * 
		 */
	
		System.out.println(true || true);
		
		
	}
	
}
