package org.bmj.hr.app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.bmj.hr.dao.DepartmentsDAO;
import org.bmj.hr.util.SqlSessionUtil;
import org.bmj.hr.vo.Department;

import oracle.net.ns.SessionAtts;

public class Ex3 {
	
	public static void main(String[] args) {
		
		List<Department> departments = DepartmentsDAO.selectDepartment();
		
		for (Department department : departments) {
			
			System.out.println(department);
		}
	}
	
	
}
