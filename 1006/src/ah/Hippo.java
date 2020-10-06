package ah;

public class Hippo extends Animal {
	//상속받은 추상클래스 Animal에서 추상메서드 cry를 오버라이딩하지 않아서 에러


@Override
public void cry() {
	System.out.println("크아아아악");
}
	
	
}
