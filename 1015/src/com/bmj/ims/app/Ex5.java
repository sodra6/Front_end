package com.bmj.ims.app;

import java.util.Scanner;

import com.bmj.ims.dao.IdolsDAO;
import com.bmj.ims.vo.Idol;

public class Ex5 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 아이돌 번호?");
		String idolIdStr = scan.nextLine();
		int idolId = Integer.parseInt(idolIdStr);// 이것좀 외워라~~~~!!!!!!
		
		System.out.println("수정할 아이돌 이름 입력");
		String name = scan.nextLine();
		
		Idol idol = new Idol();
		idol.setIdolId(idolId);
		idol.setName(name);
		
		
		int result = IdolsDAO.update(idol);
		
		
		System.out.println(result+"명의 아이돌이름이 수정됨");
		
	}
	
	
}
