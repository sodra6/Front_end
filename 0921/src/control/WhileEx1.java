package control;

public class WhileEx1 {
	public static void main(String[] args) {
	
		/*
		 * 분기문은 if문, switch문이 있음
		 * 모든 switch문은 if문이 변경이 가능하나, 모든 if문을 switch문으로 변경 불가능
		 * 
		 * 
		 * 반복문은 for문, while문이 있음 완벽하게 호환이 가능함
		 * - for : 반복 횟수를 알고있을때
		 * - while : 반복 횟수를 모를때
		 * (근데 상호환이 가능함)
		 * 
		 * while문 문법
		 * 
		 * 변수 선언
		 * while(조건식) {
		 *  증감식
		 * 	반복구문
		 * }
		 * 
		 */
		
		int j = 1;
		while(j<11) {
			System.out.println(j);
			++j;
		}//while end
		
		//2,4,6,8,10 출력
		for(int i=2	;i<11;i+=2) {
			
			System.out.println(i);
			
		}//for end
	
	}//main end
}//WhileEx1 end
