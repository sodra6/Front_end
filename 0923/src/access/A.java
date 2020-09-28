package access;

public class A {
	
	void test() {
		//같은 클래스 내부이기 때문에 a,b,c,d 전부 접근 가능
		a=10;
		b=10;
		c=new A();
		d="zz";
	}
	
	//접근제한자가 private 이고 기본자료형 int형인 인스턴스 멤버필드 a
	private int a;
	//접근제한자가 default이고 기본자료형 int형인 instance memberField
	int b;
	//접근제한자가 protected이고 객체자료형 A형 instance memberField c
	protected A c;
	//접근제한자가 public이고 객체자료형 String형인 instance memberField d
	public String d;
	
}//A end
