package app;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Group;

public class Ex5 {

	

	public static void main(String[] args) {
	
		SqlSession session = SqlSessionUtil.getSession();
		
		Group group = session.selectOne("groups.selectOne");//파라미터타입이 있으면 두번째 인자가 있다.
		
		System.out.println(group);
		System.out.println(group.getName());

		
		
		/*
		 * SqlSession의 주요 메서드
		 * - insert
		 * - update
		 * - delete
		 * - selectList
		 * - selectOne(객체 1개)
		 */
		
	}
	
	
	
}
