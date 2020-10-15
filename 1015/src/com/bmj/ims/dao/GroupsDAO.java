package com.bmj.ims.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bmj.ims.util.SqlSessionUtil;
import com.bmj.ims.vo.Group;

public class GroupsDAO {

	                  //↓↓ 제네릭은 resultType과 같다!!
	public static List<Group> selectList(){
		List<Group> groups = null;
		SqlSession session = null;
		
		try {
			session = SqlSessionUtil.getSession();
			groups = session.selectList("groups.selectList"); 
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
		}//try~catch~finally end
		
		return groups;
	}//selectList() end
	
	//리턴자료형은 insert, update, delete는 int형, 인자는 파라미터값과 동일하게 넣어준다
	public static int insert(Group group){
		int result = 0;
		SqlSession session= null;

		try {
			session=SqlSessionUtil.getSession();
			result=session.insert("groups.insert", group);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
		}
		
		
		return result;
	}
	
	public static int delete(int groupId) {
		
		int result = 0;
		
		SqlSession session = null;
		
		try {
			session  = SqlSessionUtil.getSession();
			result = session.delete("groups.delete", groupId);//두번째 인자는 메소드의 인자를 넣으면된다.
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null) session.close();
		}
		
		return result;
	}
	
}//GroupsDAO end
