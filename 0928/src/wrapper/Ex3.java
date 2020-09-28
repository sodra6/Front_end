package wrapper;

public class Ex3 {

	
	public static void main(String[] args) {
		/*
		 * Wrapper들이 기본 -> 객체로 변경 하는것이므로, 편리함을 위해서 
		 * 자바 5(1.5)에서 오토박싱(기본->객체)과 언박싱(객체->기본)을 추가했는데 
		 * '암시적객체생성'이라는 것만 기억할것
		 */
		Integer i = 3;//오토박싱
		Integer i2 = new Integer("3");
		System.out.println(i==i2);
		System.out.println(i.equals(i2));
		
		int a = i;//언박싱
	}
}
