package token;

import java.util.StringTokenizer;

public class Ex2 {

	public static void main(String[] args) {
		
		StringTokenizer stok=new StringTokenizer("테넷|위플래시|라라랜드|인셉션","|");

		/*
		 * StringTokenizer가 가진 주요 메서드
		 * - hasMoreTokens() : 남아있는 토큰의 유무를 확인(true, false)
		 * -nextToken() : 현재 토큰을 반환하면서 다음 토큰으로 넘어감
		 */
		
		while(stok.hasMoreTokens()) {
			String movie = stok.nextToken();
			System.out.println(movie);
		}//while end
	}//main() end
	
}//Ex2 end
