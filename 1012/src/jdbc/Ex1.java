package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex1 {

	public static void main(String[] args) throws Exception {
		
		/*
		 *  JDBC프로그래밍 순서
		 *
		 * 0) 해당프로젝트에 OJDBC(오라클 드라이버)를 쓸수 있도록 연결
		 * 		add External jar로 등록
		 * 1) 드라이버 로딩 
		 */
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1) 드라이버 로딩완료!");
		// 1.5) 커넥션 연결용 데이터 설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "test";
			String password = "1111";
		// 2) 커넥션 객체 얻어옴
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2) 커넥션 객체 얻기!");
		
		// 3) 구문객체 생성
			Statement stmt=con.createStatement();
		// 4) SQL구문 작성
			String sql = "INSERT INTO groups"
						+"(group_id, name, debut_date)"
						+"VALUES(4,'룰라','1995-07-01')";
		// 5) 수행 및 결과 얻기
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result+"개의 그룹 입력완료!");
 		  
		 
		
	
		/*
		 * 자바와 데이터베이스(오라클)을 연동하는 방법
		 * 1) JDBC(Java DataBase Connectivity)로 연결하는 방법
		 * 	- 순수 자바
		 * 
		 * 2) mybatis
		 * 
		 * 
		 * 3) hirvernate(JPA)
		 * 
		 * 
		 */
		
	}
	
	
}
