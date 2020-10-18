package com.bmj.exam.vo;

public class Genre {
	
	private int no;
	private String name;

	public Genre() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "번호 : "+no+" / 장르명 : "+name;
	}

	public Genre(int no2, String name2) {
		this.no= no2;
		this.name= name2;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
