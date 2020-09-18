package type;

public class TypeEx1 {

	public static void main(String[] args){
		/*
		 * 자바의 자료형
		 * - 기본자료형
		 * - 객체자료형
		 * 
		 * 자바의 기본자료형
		 * 	- boolean(논리형) : true, false
		 *  - 
		 * 
		 * 
		 */

		//기본자료형 boolean형 지역변수
		//b를 선언
		boolean b;
		//지역변수 b에 true를 대입(초기화)
		b=true;
		
		System.out.println(b);
		
		//기본자료형 boolean형 지역변수 a를 선언하고 false로 초기화,!!같은지역에 같은변수명을 '선언'을 못함!!
		
		boolean a = false;
		//지역변수 a에 true값을 대입
		a=true;
		System.out.println(a);
		
		
	}//main() end
		
	
}//TypeEx1 end
