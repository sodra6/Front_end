package com.bmj.exam.app;

import java.util.Scanner;

import com.bmj.exam.dao.GenresDao;

public class Ex08 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("추가할 장르를 입력하세요");
		String genre = scan.nextLine();
		
		int result = GenresDao.insert(genre);
		
		
		System.out.println(result+"개의 장르가 입력되었습니다.");
	}
}
