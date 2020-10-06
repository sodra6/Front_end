package oop;

public class InstanceOfEx {

	
	public static void main(String[] args) {
	
		Object o = new C();
		
		// 변수 instanceof 클래스
		
		for(int i =1; i<10	;i++	) {
			
			System.out.println("🍕");
				if(o instanceof String) { //형변환하기전에 사용
					String s = (String)o;
					System.out.println(s.substring(1));
				}//if end
		}//for end
	
	}
	
	
}
