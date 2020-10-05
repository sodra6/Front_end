package wrapper;

public class Ex2 {

	public static void main(String[] args) {
	
		//int형의 최댓값
		System.out.println(Integer.MAX_VALUE);
		
		//long형의 최솟값
		System.out.println(Long.MIN_VALUE);
		
		//String을 int형으로 변환
		String s="651862";
		//parseInt
		int i =Integer.parseInt(s);
		System.out.println(i);
		
//		Character c = new Character('a');
		
		Boolean b = new Boolean(false);
		Boolean b2 = new Boolean("truE");
		/*
		 * 대소문자 상관없이 T R U E 가 있으면 true
		 * 나머지는 전부 false
		 */
		
		
		System.out.println(b2);

	}//main() end
	
	
}//Ex2 end
