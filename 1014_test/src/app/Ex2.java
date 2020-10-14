package app;

import java.sql.Date;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Idol;

public class Ex2 {


	
	public static void main(String[] args) {
		
		
		//유저가 콘솔에 입력하는 데이터를 얻기 위해서 Scanner객체 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.println("🍭🍭🍭🍭아이돌 입력 프로그램 ver 0.99🍭🍭🍭🍭");
		System.out.println("이름?");
		String name=scan.nextLine();		
		
		System.out.println("키?");
		String heightStr = scan.nextLine();
		double height = Double.parseDouble(heightStr);
		
		System.out.println("몸무게?");
		String weightStr = scan.nextLine();
		double weight = Double.parseDouble(weightStr);
		
		System.out.println("생년월일?");		
		System.out.println("ex)2001-12-22");
		String birthDateStr = scan.nextLine();
		Date birthDate = Date.valueOf(birthDateStr);
		
		System.out.println("성별?");
		System.out.println("ex) 남자면 M, 여자면 F");
		String genderStr = scan.nextLine();
		char gender = genderStr.charAt(0);
		
		System.out.println("그룹번호?");
		System.out.println("1) 레드벨벳 2) 나인뮤지스 3) 동방신기 4) 룰라 5) 여자친구 6) 씨스타");
		String idolIdStr = scan.nextLine();
		int idolId = Integer.parseInt(idolIdStr);

		SqlSession session = SqlSessionUtil.getSession();
		Idol idol = new Idol(name, height, weight, birthDate, gender, idolId);

		int result = session.insert("idols.insert", idol);
		
		
	
		System.out.println(result+"명이 등록되었습니다.");


	}
}
