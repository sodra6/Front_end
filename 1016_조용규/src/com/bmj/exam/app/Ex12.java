package com.bmj.exam.app;

import java.util.List;
import java.util.Scanner;

import com.bmj.exam.dao.MoviesDao;
import com.bmj.exam.vo.Movie;

public class Ex12 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Movie> movies = MoviesDao.list();
//		for (Movie movie : movies) {
//			System.out.print(movies);
//		}
		for(int i = 0; i<movies.size()	; i++)	{
			System.out.print(movies.get(i).getNo()+") "+movies.get(i).getName()+" ");
			if(i%4==3) {
				System.out.println();
			}
		}
		
		System.out.println("\n삭제할 영화번호는?");
		
		String noStr = scan.nextLine();
		int no = Integer.parseInt(noStr);
		
		int result = MoviesDao.delete(no);
		
		if(result==1) {
			System.out.println(result+"개가 삭제되었습니다.");
		}else{
			
			System.out.println("삭제되지 않았습니다.");	
		}
		
		
	}
}
