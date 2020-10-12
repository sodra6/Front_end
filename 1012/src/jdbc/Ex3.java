package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex3 {

	
	public static void main(String[] args) throws Exception {
	
		//드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1)드라이버 로딩 완료!!");
		//커넥션 연결용 데이터 설정
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="test";
		String password="1111";
		//커넥션 객체 생성
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("2) 커넥션 객체 얻기!!");

		//구문객체 생성
		Statement stmt = con.createStatement();

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		//SQL작성
		String sql = "DELETE FROM idols"
					+" WHERE name='"+name+"'";
		
		//구문 출력
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"명이 삭제 되었습니다.");
		
	}
	
	
	
}
