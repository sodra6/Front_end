package com.bmj.ims.vo;

import java.sql.Date;

public class Idol {
	private int idolId, groupId;
	private String idolName, groupName;
	private double height, weight;
	private Date birthDate;
	private char gender;
	
	public Idol() {
		// TODO Auto-generated constructor stub
	}
	
	public Idol(int idolId2, String name) {
		this.idolId = idolId2;
		this.idolName = name;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return idolId+") "+idolName+" / 그룹명 : "+groupName+" 키 : "+height+"cm 몸무게 : "+weight+"kg 생년월일 : "+birthDate+" 성별 : "+gender;
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
		return idolName;
	}

	public void setName(String name) {
		this.idolName = name;
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
