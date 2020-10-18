package com.bmj.exam.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bmj.exam.util.SqlSessionUtil;
import com.bmj.exam.vo.Genre;

public class GenresDao {
	/*
	 * DAO
	 * - 데이터베이스와 연동하여 CRUD만 담당하는 전용 객체
	 */

	
	public static int insert(String name) {
		int result=0;
		SqlSession session = null;
				
		try {
			session = SqlSessionUtil.getSession();
			result = session.insert("genres.insert", name);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) session.close();
		}
		
		return result;
	}
	
	public static int update(int no, String name) {
		int result=0;
		SqlSession session=null;
		try {
			session = SqlSessionUtil.getSession();
			Genre genre = new Genre(no, name);
			result = session.update("genres.update", genre);
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			if(session!=null) session.close();
		}
	
		return result;
	}
	
	public static int delete(String name) {
		int result = 0;
		SqlSession session = null;
		
		try {
			session = SqlSessionUtil.getSession();
			result=session.delete("genres.delete", name);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) session.close();
		}
		
		return result;
	}
	
	public static List<Genre> selectList() {
		List<Genre> genres = null;
		SqlSession session =null;
		
		try {
			session=SqlSessionUtil.getSession();
			genres=session.selectList("genres.selectList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) session.close();
		}
		
		
		return genres;
	} 

}
