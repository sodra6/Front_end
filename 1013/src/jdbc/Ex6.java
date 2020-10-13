package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex6 {

	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String sql = "SELECT group_id, name, debut_date"
					+" FROM groups"
					+" ORDER BY 1";
		
		try {
			con = ConnectionUtil.getConnection();
			stmt = con.createStatement();
			rs= stmt.executeQuery(sql);
			while(rs.next()) {
				int groupId = rs.getInt(1);
				String name = rs.getString(2);
				Date debutDate = rs.getDate(3);
				System.out.println(groupId+name+debutDate);
			}
		} catch (Exception e) {
			e.printStackTrace();//개발자가 에러가 보여야 디버깅이 가능
		} finally {
			try {
				if(rs!=null) {
				rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(stmt!=null) {
				stmt.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(con!=null) {
				con.close();}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}//try~catch~finally end
		
	}//main end
	
	
}//Ex6 end
