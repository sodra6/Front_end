package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {

	
	public static void main(String[] args) {
	
		//중복허용 안됨~~ 인덱스 없음!!!!!!
		Set<Integer> set = new HashSet<Integer>();//무적권 정렬안됨
		Set<Integer> set2 = new TreeSet<Integer>();//정렬이됨 같은자료형끼린
		
		set.add(9);
		set.add(15);
		set.add(50);
		set.add(1);
		set2.add(9);
		set2.add(15);
		set2.add(50);
		set2.add(1);
		System.out.println(set);
		System.out.println(set2);
	}
	
}
