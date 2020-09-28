package test;

import vo.Movie;
import vo.Music;

public class MovieApp {
	public static void main(String[] args) {
		
		Movie m1=new Movie();
		Music m2=new Music();
		
		m2.setTitle("공기남");
		m2.setPlayTime(300);
	
		
		m1.setTitle("테넷");
		m1.setDirector("크리스토퍼 놀란");
		m1.setAudienceNum(1566895);
		
		String title = m1.getTitle();
		String director = m1.getDirector();
		int audienceNum = m1.getAudienceNum();
		
		String title2=m2.getTitle();
		int playTime=m2.getPlayTime();
		
		System.out.println(title);
		System.out.println(director);
		System.out.println(audienceNum+"명");
		System.out.println(title2);
		System.out.println(playTime+"초");
		
	}//main end
}//MovieApp end
