package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import util.ConnectionUtil;

public class Ex1 {
	public static void main(String[] args) throws Exception {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("삭제할 아이돌 이름은?");
		String name = scan.nextLine();
	
		Connection con = ConnectionUtil.getConnection();
		System.out.println("2) 커낵션 얻기");
		//3) 구문객체 생성
		Statement stmt = con.createStatement();
		
		//4) SQL구문 작성
		String sql = "DELETE idols "
					+"WHERE name = '"+name+"'";
		
		//5) 결과 수행
		//- insert, update, delete는 extcuteUpadte(sql구문), int형
		// - select는 executeQuery(sql구문) 
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"명 삭제");
		
	}//main end
	
	
	
}//Ex1 end
