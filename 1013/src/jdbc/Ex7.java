package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex7 {

	public static void main(String[] args) {
		
		//아이돌 번호이름
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		String sql="SELECT idol_id,name,height,weight,birth_date,gender,group_id"
					+" FROM idols"
					+" ORDER BY 1";
		
		try {
			con=ConnectionUtil.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				int idolId = rs.getInt(1);
				String name = rs.getNString(2);
				float height = rs.getFloat(3);
				float weigth = rs.getFloat(4);
				Date birthDate = rs.getDate(5);
				String gender = rs.getString(6);
				int groupId = rs.getInt(7);
				System.out.println(idolId+") "+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}//try~catch end
			try {
				if(stmt!=null) stmt.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}//try~catch end
			try {
				if(con!=null) con.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}//try~catch end
		}//try~catch~finally end
		
		
		
	}//main end
}//Ex7 end
