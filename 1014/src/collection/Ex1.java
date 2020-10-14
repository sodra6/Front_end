package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		 list.add(1);
		 list.add("3");
		 list.add("6");
		 list.add("6");
		 list.add("후후후");
		 //일반for문
 		 for(int i =0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
 		 for(Object o:list) {
 			 System.out.println(o);
 		 }
		 
	}
	
	/*
	 * Collection 프레임워크(수집하는놈)
	 * 
	 * - 객체의 레퍼런스를 수집하는 객체(배열처럼 여러 객체를 갖고있는 느낌적인 느낌)
	 * 
	 * List : 무한배열같은 느낌(인터페이스)
	 * - 인덱스가 있음
	 * - 주요 구현클래스 : Vector, ArrayList
	 * - 주요 메서드
	 * add() : 리스트에 객체추가
	 * size() : 객체의 개수
	 * get(idx) : 해당idx의 레퍼런스를 얻어옴
	 * Set 
	 * Map
	 */

}
