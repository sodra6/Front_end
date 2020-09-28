package constructor;

public class Ex1 {
	
	public Ex1() {
		
	}
	/*    생성자 선언 규칙
	-> 접근제한자+생성자명(인자) {}
	생성자명은 클래스명과 같아야됨
	
	리턴자료형이 있으면 메소드,
	생성자는 레퍼런스가 넘어오기 때문에 리턴이 없음
	생성자와 메소드는 이름으로 구분하는게 아니라
	!!리턴자료형 존재 유무로 구분하는것!!
	생성자는 멤버가 아님
	*/
	public static void main(String[] args) {
		
		Ex1 e = new Ex1();// 인자(괄호안)를 아무것도 안넣은것을 기본생성자(default 생성자)
				//Ex1의 기본생성자를 호출하는 코드
		
		//생성자에서 다른생성자를 호출할떄 this()를 사용
		
	}//main() end
}//Ex1 end
