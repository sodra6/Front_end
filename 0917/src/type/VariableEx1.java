package type;

public class VariableEx1 {
	
	public static void main(String[] args) {
		
		/*
		 * 자바의 기본자료형
		 * 
		 * - 논리형: boolean
		 * 
		 * 변수
		 * - 선언 : 자료형 변수명; ex) 
		 * - 대입 및 초기화
		 * 
		 * 지역변수(메소드 안에 선언된 변수)는 반드시 초기화(대입)하여 사용해야만 함
		 * 멤버필드(클래스 영역)에 선언되면 사용가능
		 */
		
		// 기본자료형 int형 변수 a를 선언
		int a;
		//지역변수 a에 10을 대입(초기화(처음대입을 초기화라함))
		a=10;
		//지역변수 a에 100을 대입
		a=100;
		System.out.println(a);
		
	}//main() end

}//TypeEx1 end
