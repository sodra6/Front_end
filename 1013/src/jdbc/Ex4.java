package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import util.ConnectionUtil;

public class Ex4 {

	
	public static void main(String[] args) throws Exception {
		
		System.out.println("100) Steven King / 부서명 : Executive");
		
		//커넥션객체 얻어오기
		Connection con = ConnectionUtil.getConnection("hr");
		
		//구문 객체 생성
		Statement stmt = con.createStatement();
		//SQL구문 작성
		String sql = "SELECT employee_id, first_name, last_name, department_name"
					+" From employees e, departments d"
					+" Where e.department_id=d.department_id AND employee_id=100";
		//수행후 결과집합 얻기
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			int employeeId = rs.getInt(1);
			String firstName = rs.getString(2);
			String lastName = rs.getNString(3);
			String departmentName = rs.getString(4);			
			System.out.println(employeeId+") "+firstName+" "+lastName+" / 부서명 : "+departmentName);
		}//while end
		
	}//main end
}//Ex4 end
