package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	
	public static void main(String[] args) {
		
		//Hashset은 정렬이 없음
		//TreeSet은 정렬이 가능 같은자료형끼리만
		Set set	= new HashSet();
		
		set.add(129);
		set.add("나");
		set.add(new SetEx1());
		set.add(new SetEx1());
		set.add(129);

		for (Object object : set) {
			System.out.println(object);
		}
		
		/*
		 * Collection의 대표적인 종류
		 * 
		 * - Set : 인덱스 X 중복허용 X
		주요 구현체 : HashSet, TreeSet
		
		
		 * - Map : 인덱스 X 중복허용 O
		 * - List : 인덱스 O 중복허용 O
		 * 
		 * 
		 */
	}
}
