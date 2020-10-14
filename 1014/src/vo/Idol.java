package vo;

import java.sql.Date;

public class Idol {

	private int idolId, groupId;
	private String name;
	private double height, weight;
	private Date birthDate;
	private char gender;
	
	public Idol() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return idolId+") 이름 : "+name+" 키 : "+height+" 몸무게 : "+weight+" 생년월일 : "+birthDate+" 성별 : "+ (gender=='M'?"남":"여")+" 그룹번호 : "+groupId;
	}
	public int getIdolId() {
		return idolId;
	}

	public void setIdolId(int idolId) {
		this.idolId = idolId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
