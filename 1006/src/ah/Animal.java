package ah;

public abstract class Animal {
	
	String name;
	String species;
	int age;
	Double weight;

	public abstract void cry();
	
	
	
	/*
	 * 추상의 키워드 : abstract
	 * 
	 * 추상클래스
	 * - 선언 : 접근제한자 abstract class 클래스명
	 * - 일반클래스와 같지만 단, new 생성자호출로 객체생성 불가!!!
	 * 
	 * 
	 * 추상메소드
	 * - 본체(body)가 없는 메서드
	 * - 호출은 가능하지만 내용이 없음
	 * - 추상메소드를 가진 추상클래스를 상속받으면 반드시 추상메소드를
	 * 	 overriding해야함
	 * - 선언 : 접근제한자 abstract (static) 리턴자료형 메소드명(인자);
	 * 
	 */
}
