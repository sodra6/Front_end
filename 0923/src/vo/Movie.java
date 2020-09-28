package vo;
/*
 * 
 * VO란
 *  - Value Object의 줄임말로 데이터를 저장하는 객체
 *  - DTO라고도 함(Data Transfer Object)
 *  - VO생성 규칙
 * 	 1) 멤버필드를 private으로 선언
 *	 2) 멤버필드의 접근을 setter, getter로 접근
 */

import java.io.ObjectInputStream.GetField;
import java.util.Set;

public class Movie {

	//접근제한자 private인 객체자료형 String형인 instance 멤버필드 title
	private String title;//영화제목
	//접근제한자 private이고 객체자료형 스트링형인 인스턴스 맴버필드 디랙터
	private String director;//영화감독
	//접근제한자가 private고 기본자로형 인트형인 인스턴스 맴버필드 오디언스넘
	private int audienceNum;//관객수
	
	// title의 setter(public으로 선언하고 instance면서 void(리턴값 x)이다.)
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDirector(String director) {
		this.director=director;
	};
	public void setAudienceNum(int audienceNum) {
		this.audienceNum=audienceNum;
	}
	// title의 getter(public으로 선언하고 인자가 X, )
	public String getTitle() {
		return this.title;
	}
	public String getDirector() {
		return this.director;
	}
	public int getAudienceNum() {
		return this.audienceNum;
	}
  	
	/*
	 * 은닉화
	  : 은닉화란 멤버를 private으로 선언하여 
	  외부에서 직접 접근하지 못하게 막는 방법
	  (은행의 창구와 금고를 생각하면됨)
	 * why? 
	  : 외부에서 직접 접근할 경우 잘못된 값이 들어갈 수 있고
	  적절하지 않게 사용될 수 있어서
	  
	 * 캡슐화
	  : 외부에 알릴 필요가 없는 기능 및 속성을 숨기는 것(멤버를 private으로 선언)
	 
	  
	 */
	
}
