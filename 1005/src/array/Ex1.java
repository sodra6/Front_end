package array;

import java.util.List;
import java.util.Set;

public class Ex1 {

	/*
	 * 자바스크립트의 배열 = 자바 List 클래스
	 */
	public static void main(String[] args) {
	
		/*
		 * 자바의 배열은 크기 고정에 메서드도 없음
		 * (그래서 컬랙션 클래스들을 활용)
		 * 
		 * 배열과 for문간의 연관관계가 높음
		 * 
		 */
		
		int[] iArr= {3,5,7,9,11,13,20,100};
		//int[] iArr = new int[4];
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}//for end
		
		/*
		 * 향상된 for문(for each문)
		 * for( 자료형 변수	: 배열 혹은 컬렉션) {
		 * 
		 * }
		 */
		for(int a:iArr) {
			System.out.println(a);
		}//for end
		
		
		iArr[0]=3;
		iArr[1]=5;
		iArr[2]=7;
		iArr[3]=9;
		
		
	}//main() end
	
}//Ex1 end
