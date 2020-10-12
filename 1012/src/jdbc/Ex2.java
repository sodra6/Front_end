package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Ex2 {
	
	
	public static void main(String[] args) throws Exception {
		// 드라이버 로딩
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("1) 드라이버 로딩완료!");
		// 커넥션 데이터
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="test";
		String password="1111";
		// 커넥션 객체 얻기
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2) 커넥션 객체 얻기!");	
		// 구문객체 생성
		Statement stmt = con.createStatement();
		// SQL작성
		String sql = "INSERT INTO idols"
					+"(idol_id, name, height, weight, birth_date, gender, group_id)"
					+"VALUES(9, '용규', 179, 71, '1993-06-26', 'M', 4)";
		//구문출력
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"개의 멤버 입력완료!");
		
		
	}
}
