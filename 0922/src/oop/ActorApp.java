package oop;

public class ActorApp {

	/*
	 * 객체는 아는 것과 하는것을 가지고 있음 
	 * 아는것은 속성이고 품사로 보면 명사
	 * 하는것은 기능이고 품사로 보면 동사
	 * 
	 * 자바는 클래스기반 객체지향형 언어
	 * 
	 * !!!!!!!클래스는 객체의 설계도이자 자료형!!!!!!!!!
	 * 
	 * 클레스에서 아는 것은 멤버필드
	 * 클레스에서 하는 것은 (멤버)메소드
	 * 클레스의 멤버는 필드와 메소드이다.
	 */

	public static void main(String[] args) {
		//객체 자료형 Actor클래스형 a1이라는 지역변수를 선언하고 Actor 객체를 생성한 뒤 a1에 대입
		   Actor a1 = new Actor();//생성자 호출할땐 new를 사용
		   a1.name="김슬기";
		   a1.height=157.3f;
		   a1.sex='F';
		   a1.debut="넌 내게 반했어";
		   
		   System.out.println("이름 : "+ a1.name);
		   System.out.println("키 : "+ a1.height);
		   System.out.println("성별 : "+ a1.sex);
		   System.out.println("데뷔작 : "+ a1.debut);
		   
		   //new Actor(); --> 이것이 객체 생성
		  Actor a2 = new Actor();
		  a2.name = "최민식";
		  a2.height = 177.0f;
		  a2.sex = 'M';
		  a2.debut= "야망의 세월";
		  
		  System.out.println("이름 : "+ a2.name);
		  System.out.println("키 : "+ a2.height);
		  System.out.println("성별 : "+ a2.sex);
		  System.out.println("데뷔작 : "+ a2.debut);
		  
		  //a3변수 선언후 Actor객체 생성(이름,키,성별,데뷔작,출력)
		  
		  Actor a3=new Actor();
		  
		  a3.name="주지훈";
		  a3.height=187;
		  a3.sex='M';
		  a3.debut="2006년 MBC 궁";
		  
		  System.out.println("이름 : "+ a3.name);
		  System.out.println("키 : "+ a3.height);
		  System.out.println("성별 : "+ a3.sex);
		  System.out.println("데뷔작 : "+ a3.debut);
		  
		  System.out.println(a3);
		
	}//main() end
	
}//ActorApp end
