package token;

import java.util.StringTokenizer;

public class Ex1 {

	public static void main(String[] args) {
	
		
		/*
		 * 문자열을 쪼갤때
		 * 예) "가,나,다,라" 를
		 * "가"
		 * "나"
		 * "다"
		 * "라"
		 * 로 나누는 것
		 * 방법
		 * 1) String이 가진 split() 메서드
		 * 2) StirngTokenizer 클래스 이용
		 */
		
		String movies = "테넷,인사이드아웃,인셉션,라라랜드";
		String[] movieArr = movies.split(",");
		for(int i=0;i<movieArr.length;i++) {
			System.out.println(movieArr[i]);
		}
		
		for(String title:movieArr) {
			System.out.println(title);
		}
		
		StringTokenizer stok = new StringTokenizer("가 나 다 라");
		
	}//main() end
	
	
}//Ex1 end
