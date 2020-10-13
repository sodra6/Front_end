package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "test";
		String password = "1111";
		
		String sql = "INSERT INTO groups(group_id, name, debut_date)"
					+"VALUES(5,'씨스타','2016-06-03')";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
			stmt = con.createStatement();
			
			int result = stmt.executeUpdate(sql);
			System.out.println(result+"개 입력");
		} catch (Exception e) {
			
			e.printStackTrace();//에러 추적 메서드
			
		} finally {
			try {
				if(stmt!=null) {
				stmt.close();
				}//if end
			} catch (Exception e2) {

			}//try~catch end
			try {
				if(con!=null) {
				con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}//try~catch end
			
		}//try~catch~finally end
		
	}//main end
}//Ex5 end