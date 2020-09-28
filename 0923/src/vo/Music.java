package vo;

public class Music {
	
	
	private String title;//제목
	private int playTime;//시간(초)
	
	public void setTitle(String title) {
		this.title=title;
	};
	public String getTitle() {
		return this.title;
	}
	public void setPlayTime(int playTime) {
		this.playTime=playTime;
	}
	public int getPlayTime() {
		return this.playTime;
	}
	
	/*
	 * vo 만드는 규칙
	 * 1) 멤버필드를 private으로 선언
	 * 2) 멤버필드당 setter, getter를 만들어야됨
	 * 3) 기본생성자를 무적권 만들어야됨
	 */
	
}
