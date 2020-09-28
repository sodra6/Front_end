package string;

public class Ex4 {
	public static void main(String[] args) {
		
		/*
		 * string 객체는 불변(변하지않음) 그래서 StringBuffer, StringBuilder를 사용함
		 * 스트링 빌더나 스트링 버퍼 안써도됨(덧셈이 약 100개 미만은 빌더보다 훨빠름)
		 * 컴파일러가 컴파일할때 자동으로 코드를 바꿔줌
		 * 
		 * StringBuilder는 자바 5(1.5)에 추가됨 : 속도가 빠름
		 * 
		 * StringBuffer는 쓰레드에 안전하기 때문에 속도가 느림
		 * 
		 * StringBuffer와 StringBuilder의 차이는 멀티쓰레드 환경에서는
		 * StringBuffer를 사용하고 싱글쓰레드 환경일떈 StringBuilder를 사용
		 * 
		 */
		
		StringBuilder sb= new StringBuilder("A");
		
		sb.append("B");
		sb.append("C");
		sb.append("D");
		
		String m=sb.toString();
		System.out.println(sb.toString());
		System.out.println(sb);
		String s = "A";
		s+="B";
		s+="C";
		s+="D";
		
		System.out.println(s);
		
		
	}
}
