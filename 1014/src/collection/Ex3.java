package collection;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
	
	public static void main(String[] args) {
		
		/*
		 * 제네릭은 자료형을 고정시키는 목적으로 사용됨 <자료형>
		 */
		
		List<String> list = new ArrayList();
		
		list.add("아이린");
		//list.add("3");// -> string으로 형변환이 안되기때문에 ClassCastException 발생
		list.add("예리");
		list.add("조이");
		list.add("슬기");
		list.add("웬디");
		

		for (String s : list) {
			System.out.println(s.substring(1));
		}
		
		
		
		
		
		
		
		
	}

}
