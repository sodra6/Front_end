package com.bmj.exam.app;

import java.util.List;
import java.util.Scanner;

import com.bmj.exam.dao.MoviesDao;
import com.bmj.exam.vo.Movie;

public class Ex13 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 영화제목을 입력해 주세요");
		String name = scan.nextLine();
		
		List<Movie> movies= MoviesDao.selectList(name);
		if(movies.size()==0) {
			System.out.println("검색된 영화가 없습니다.");
		}
		else {
			for (Movie movie : movies) {
					System.out.println(movie.getNo()+") "+movie.getName()+" / 감독 : "+movie.getDirector()+" / 개봉일 : "+String.format("%1$tY년%1$tm월%1$td일", movie.getReleaseDate())+" / 관객수 : "+String.format("%,d", movie.getAudienceNum())+"명 / 장르 : "+movie.getGenre());
				}//for end
		}//if~else end
	
	}//main() end
}//Ex13 end
