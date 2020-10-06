package vo;

public class Actor {
	private String name;
	private int height,weight;
	public Actor() {
		// TODO Auto-generated constructor stub
	}
	public Actor(String name,int height,int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	/*toString을 메서드 재정의(overriding)*/
	@Override
	public String toString() {
		return "이름: "+name+" 키 : "+height+"cm 몸무게 : "+weight+"kg";
	}
	@Override
	//메서드만드는 초급방법
	//리턴자료형과 동일한 지역변수를 선언후 초기화함
	//마지막줄에 리턴키워드와 지역변수 선언
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}//if end
		if(obj instanceof Actor) {
			Actor tmp = (Actor)obj;
			
			return name==tmp.name&&height==tmp.height&&weight==tmp.weight; 
		}//if end
		return false;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}//Actor end
