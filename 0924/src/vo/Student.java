package vo;

public class Student {
	
	private String name;
	private double height;
	private double weight;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	/*
	 * getter, setter 생성 단축키
	 * - alt + shift + s 누르고 r 누르고 alt+a -> alt+r
	 */
	/*
	 * VO 만드는 규칙
	 * 1) 멤버필드를 private으로 선언
	 * 2) 멤버필드당 setter, getter를 만들어야됨
	 * 3) 기본생성자를 무적권 만들어야됨
	 */
	
}
