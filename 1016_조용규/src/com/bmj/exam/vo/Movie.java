package com.bmj.exam.vo;

import java.sql.Date;

public class Movie {

	private int no,audienceNum,genre;
	private String name,director;
	private Date releaseDate,endDate;

	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public Movie(int genre2, String name2, String director2, Date releasedate2, Date endDate2, int audience) {
		this.genre = genre2;
		this.name = name2;
		this.director = director2;
		this.audienceNum = audience;
		this.endDate = endDate2;
		this.releaseDate=releasedate2;
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getAudienceNum() {
		return audienceNum;
	}

	public void setAudienceNum(int audienceNum) {
		this.audienceNum = audienceNum;
	}

	public int getGenre() {
		return genre;
	}

	public void setGenre(int genre) {
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
}
