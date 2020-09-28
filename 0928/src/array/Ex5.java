package array;

public class Ex5 {
	
	public static void main(String[] args) {
		

		String[] movies = {"테넷","엑스맨","반지의제왕","인터스텔라","겨울왕국2"};
		
		for (int i= 0; i < movies.length; i++) {
			System.out.println(movies[i]);
		};
		
		/*
		 * java 5(1.5)에서 추가된 향상된 for문 ->(for each문)
		 * 
		 * for(	 자료형 변수명 : 배열 or 컬랙션	){
		 * 		
		 * };
		 */
		
		//for each문(향상된 for문)
		for (String title:movies) {
			System.out.println(title);
		}
		
	
		
		
	}// main end
	
}//Ex5

