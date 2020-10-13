package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex3 {
	public static void main(String[] args) throws Exception {

		
		Connection con = ConnectionUtil.getConnection();
		
		//3) 구문객체
		Statement stmt = con.createStatement();
		
		//4) SQL구문 작성
		String sql = "SELECT idol_id, name, height, weight, birth_date, gender, group_id"
					+" FROM idols"
					+" ORDER BY 1";
		//System.out.println(sql);
		//5)수행후 결과 집합 얻기
		ResultSet rs = stmt.executeQuery(sql);
		
		//6) 결과 출력
		while(rs.next()) {
			int idolId = rs.getInt(1);
			String name = rs.getString(2);
			float height = rs.getFloat(3);
			float weight = rs.getFloat(4);
			Date birthDate = rs.getDate(5);
			String gender = rs .getString(6);
			int groupId = rs.getInt(7);
			
			System.out.println(idolId + ") "+name+" / 키 : "+height+" 몸무게 : "+weight+" 생년월일 : "+birthDate+" 성별 : "+(gender.equals("M")?"남자":"여자"));
			
		}
	}
}
