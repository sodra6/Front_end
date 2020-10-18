package com.bmj.exam.app;

import java.util.Scanner;

import com.bmj.exam.dao.GenresDao;

public class Ex09 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("변경할 장르번호를 입력하세요");
		String noStr = scan.nextLine();
		int no = Integer.parseInt(noStr);
		
		System.out.println("변경할 장르명을 입력하세요");
		String genre = scan.nextLine();
		
		
		int result = GenresDao.update(no, genre);
		
		System.out.println(result+"개의 장르명이 잘 변경되었습니다.");
	}
}
