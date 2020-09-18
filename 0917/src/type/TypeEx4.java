package type;

public class TypeEx4 {
	
	public static void main(String[] args) {
		
		/*
		 * 자바의 기본자료형 char형
		 * - 문자형(글자 한글자)
		 * - ''(""은 String형)
		 * - 내부적으로 정수처리
		 * - 2바이트
		 * - 0~65535
		 * - 유니코드(2byte, 글자마다 숫자값이 있음, 전세계 언어를 다 숫자값을 넣어야되서)와 동일
		 *  	-> ASCII(America standard code for information interchange)
		 * - 0 <- 48
		 * - A <- 65
		 * - a <- 97
		 * - 엔터값 <- 13  
		 * - '\u0000'~'\uffff' 16진수로 표기가능
		 * - '\''(작은따옴표는 \' 이렇게 작성)
		 */
		
		//지역변수로 기본자료형 char형을 c를 선언
		char c;
		//지역변수 c에 문자 'a'를 대입(초기화)
		c='A';
		//unicode 16진수로 표기 가능
		c='\u0044';
		
		c='\'';
		
		System.out.println(c);
		
		int d = -532222;
		System.out.println(d);
	
	}//main() end
}//TypeEx4 end
