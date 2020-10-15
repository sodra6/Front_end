package org.bmj.hr.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.bmj.hr.util.SqlSessionUtil;
import org.bmj.hr.vo.Employee;

import oracle.net.ns.SessionAtts;

public class EmployeesDAO {
	
	public static List<Employee> selectSearchName(String q){
		List<Employee> employees = null;
		SqlSession session = null;
		
		try {
			session = SqlSessionUtil.getSession();
			employees = session.selectList("employees.selectSearchName","%"+q.toLowerCase()+"%");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(employees!=null) {
				session.close();
			}
		}
		
		
		return employees;
	}
	

	public static List<Employee> selectList(){
		List<Employee> employees = null;
		
		SqlSession session = null;
		
		try {
			session = SqlSessionUtil.getSession();
			employees = session.selectList("employees.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) {
				session.close();
			}//if end
			
		}//try~catch~finally end
		
		
		return employees;
	}
	
	
	/*
	 * DAO(Data Access Object)
	 * - 데이터베이스와 연동하여 CRUD만 담당하는 전용객체(무적권!) 일관성유지 테이블당 1개씩
	 * 
	 */
}
