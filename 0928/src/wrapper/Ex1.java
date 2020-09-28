package wrapper;

public class Ex1 {

	public static void main(String[] args) {
		
		/*
		 * Wrapper클래스들
		 * - 기본자료형을 객체자료형처럼 사용하기 위해 필요한 클래스
		 * 
		 * - 기본자료형에 필요한 메소드나 상수등을 가지고 있는 클래스 
		 * 
		 *  Boolean, Character, Byte, Short, Interger, Long, Float, Double 이것들이 Wrapper 클래스
		 *  
		 * - 자바5 (1.5)에서 변경된 부분 -> 
		 * 
		 * - 생성자(기본자료형 or String)
		 */
		//예시 자기자신의 기본자로형 or String임
		Integer i = new Integer(3);
		
		//A를 숫자로 형변환 할수 없으니까 NumberFormatException이 발생
		//Integer i2 = new Integer("A");
		
		System.out.println(i);
		//System.out.println(i2);
		
		//String -> int 형으로 변환하는 메소드
		//Integer.parseInt("문자열")
		int a = Integer.parseInt("33");// public static int parseInt(String s);
		
		int max = Integer.MAX_VALUE;//상수는 final로 선언되있음
		long l = Long.MIN_VALUE;
		Character c =new Character('a');//캐릭터형은 무적권 차형밖에 안대무
		
		//Boolean의 생성자 인자 String은 대소문자 안가리고 T,R,U,E만 true고 나머진 전부 false
		Boolean b = new Boolean(false);
		b=new Boolean("트루");
		System.out.println(b);
		
	}//main end
	
}//Ex1 end
