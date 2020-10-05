package wrapper;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 오토박싱 : 기본 -> 객체
		 * 언박싱 : 객체 -> 기본
		 */
		
		int i = 10;
		Integer i2 = i;//오토박싱 -> 암시적객체생성 래퍼런스값이 들어감
		i=i2;//언박싱 -> 언박싱은 값이 복사되어서 들어감
		
		/*
		 * 오토박싱이 암시적 객체생성이 되는 경우
		 * 
		 * Boolean, 
		 * Character 0~127까지
		 * Byte 전부
		 * Short, Integer, Long : -128~127
		 * 
		 * !!!! 그외에는 명시적객체생성 !!!!
		 * 
		 */
		
		
	}//main() end
	
	
}//Ex5 end
