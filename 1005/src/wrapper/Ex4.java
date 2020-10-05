package wrapper;

public class Ex4 {

	public static void main(String[] args) {
	
		// 자바5 에 추가 된 기능 -> 오토박싱(편리성을 위해) 암시적 객체생성
		//오토박싱(기본->객체)과 언박싱(객체->기본)
		// true, false값 -128~127까지 객체를 생성해 놓은후 상수풀에 추가시킴
		//
		Integer i = 128;
		Integer i2 = 128;
				System.out.println(i==i2);
		
	}//main() end
	
	
}//Ex4 end
