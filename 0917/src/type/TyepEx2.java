package type;

public class TyepEx2 {

	
	public static void main(String[] args) {
		
		/*
		 * 자바의 기본자료형(정수형)
		 * 
		 * - byte : -128 ~ 127(1byte==8bit)
		 * - short : -32768 ~ 32767(2byte==16bit)
		 * - int : -2147483648 ~ 2147483647(4btye)
		 * 		
		 * 		자바의 기본정수가 int형	
		 * 
		 * - long : (8byte) 1L을 붙여씀
		 * 
		 */
		
		//기본자료형 byte형 변수 b를 선언
		byte b;
		//변수 b에 -128을 대입(초기화)
		b=-128;
		System.out.println(b);
		//기본자료형 short형 변수 s를 선언하고 32767으로 초기화
		short s = 32767;
		System.out.println(s);
		
		//기본자료형 int형 변수 i를 선언
		int i;
		//지역변수 i의 100을 대입(초기화)
		i=100;
		System.out.println(i);
		
		//기본자료형 long형 변수 l을 선언
		long l;
		//지역변수 l에 214783647을 대입(초기화)
		l=214783647;
		//지역변수 l에 long형 7을 대입
		l=7L;
		//2147483648이상의 수는 int형이 표현 불가 무적권 L을 붙여야 한다.
		l=2147483648L;
		
		System.out.println(l);
		
		short k = 1150;
		byte m =(byte)k;
		System.out.println(m);
	}//main() end









}//TypeEx2 end