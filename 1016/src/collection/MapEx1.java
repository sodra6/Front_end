package collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MapEx1 {

	
	public static void main(String[] args) {
		
		/*
		 * Map은 key와 value로 구성
		 * (JS의 객체와 비슷함)
		 * 중복허용하지 않아요!
		 */
		Map person = new ConcurrentHashMap();
		person.put("name", "황정민");
		person.put("height", 180);
		person.put("weight", 70);
		person.put("weight", 78);
		
		System.out.println(person.get("weight"));
		
	}//main end
	
}//MapEx1
