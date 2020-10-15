package com.bmj.ims.app;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.bmj.ims.dao.GroupsDAO;
import com.bmj.ims.util.SqlSessionUtil;
import com.bmj.ims.vo.Group;

import oracle.net.ns.SessionAtts;


public class Ex3 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("입력할 그룹명?");
		String name = scan.nextLine();
		
		
		System.out.println("데뷔일?");
		System.out.println("예시)yyyy-mm-dd");
		String debutDateStr = scan.nextLine();	
		Date debutDate = Date.valueOf(debutDateStr);
		
		Group group = new Group(name,debutDate);

		
		int result = GroupsDAO.insert(group);
		
		System.out.println(result+"개의 그룹이 등록되었습니다.");
		
	}
	
}
