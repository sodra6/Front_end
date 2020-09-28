package equal;

public class Ex2 {
	
	public static void main(String[] args) {
		
		String s=new String("TEST");
		String s2=new String("TEST");
		
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		// ==은 래퍼런스비교
		//String,Wrapper Class 에서는 equals는 값비교, 다른곳에선 거의 래퍼런스 비교
		/*
		 * 객체생성 --> 명시적 객체생성 ex) String A = new A();
		 * 			ㄴ> 암시적 객체생성 ex) String A = "TEST" : 상수풀이 비어있을때 동일한 값이 없으면 객체생성
		 * 
		 */
		
	}//main() end
	
}//equal end
