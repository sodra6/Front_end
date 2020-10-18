package com.bmj.exam.app;

import java.sql.Date;
import java.util.Scanner;

import com.bmj.exam.dao.MoviesDao;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("📽 영화입력 프로그램📽");
		int genre=0;
		
		while(true) {
			try {
				System.out.println("1) SF / 2) 드라마 / 3) 애니메이션 / 4) 액션 / 5) 로맨스/멜로 6) 판타지 / 7) 가족 / 8) 뮤지컬 / 9) 스릴러");
				String genreStr = scan.nextLine();
				genre = Integer.parseInt(genreStr);
				
				if(1<genre && genre>9) {
					System.out.println("정확한 장르번호를 입력해주세요");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("정확한 장르번호를 입력해주세요");
				continue;
			} //try~catch end
		}//while end
		
		System.out.println("영화이름은?");
		String name = scan.nextLine();
		
		System.out.println("감독 이름은?");
		String director = scan.nextLine();
		
		Date releasedate;
		while(true) {
			try {
				System.out.println("아래와 같은 포맷으로 개봉일을 입력해주세요");
				System.out.println("2020-10-16(년-월-일)");
				String releaseDateStr = scan.nextLine();
				releasedate = Date.valueOf(releaseDateStr);
				break;
				
			} catch (Exception e) {
				System.out.println("제대로 된 포멧으로 입력해주세요.");
				continue;
			}//try~catch end
		}//while end
		
		Date endDate; 
		
		while(true) {
			try {
				System.out.println("아래와 같은 포맷으로 종료일을 입력해주세요");
				System.out.println("2020-10-16(년-월-일)");
				String endDateStr = scan.nextLine();
				if(endDateStr.length()>0) {
					endDate = Date.valueOf(endDateStr);
				}else {
					endDate = null;
				}
				break;
				
			} catch (Exception e) {
				System.out.println("제대로 된 포멧으로 입력해주세요.");
				continue;
			}//try~catch end
		}//while end
		
		System.out.println("관객수를 입력해 주세요");
		String audienceStr = scan.nextLine();
		int audience;
		if(audienceStr.length()>0) {
		 audience = Integer.parseInt(audienceStr);
		}else {
			audience=0;
		}
		int result = MoviesDao.insert(genre,name,director,releasedate,endDate,audience);
		
		System.out.println(result+"개의 영화가 등록되었습니다.");
	}
	
}
