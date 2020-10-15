package com.bmj.ims.app;

import java.util.Scanner;

import com.bmj.ims.dao.GroupsDAO;

public class Ex4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 그룹번호?");
		
		int groupId = scan.nextInt();
		
		int result = GroupsDAO.delete(groupId);
		
		System.out.println(result+"개 삭제!");
		
		
		
	}//main() end

}//Ex4 end
