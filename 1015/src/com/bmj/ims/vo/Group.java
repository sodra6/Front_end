package com.bmj.ims.vo;

import java.sql.Date;

public class Group {
	
	private int groupId;
	private String name;
	private Date debutDate;
	
	public Group() {
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return groupId+") "+name+" / 데뷔일 : "+debutDate;
	}
	public Group(String name, Date debutDate) {
		this.name = name;
		this.debutDate = debutDate;
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

	public Date getDebutDate() {
		return debutDate;
	}

	public void setDebutDate(Date debutDate) {
		this.debutDate = debutDate;
	}
	
	
}
