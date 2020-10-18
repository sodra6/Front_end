package com.bmj.exam.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bmj.exam.util.SqlSessionUtil;
import com.bmj.exam.vo.Genre;
import com.bmj.exam.vo.Movie;

import oracle.net.ns.SessionAtts;

public class MoviesDao {
	/*
	 * DAO
	 * - 데이터베이스와 연동하여 CRUD만 담당하는 전용 객체
	 */

	public static List<Movie> selectList(String name) {
		List<Movie> movies = null;
		SqlSession session =null;
		
		try {
			session=SqlSessionUtil.getSession();
			movies=session.selectList("movies.selectList", "%"+name+"%");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) session.close();
		}
			
		return movies;
	}
	
	
	public static int delete(int no) {
		int result=0;
		SqlSession session = null;
		
		try {
			session = SqlSessionUtil.getSession();
			result = session.delete("movies.delete", no);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) session.close();
		}
		
		return result;
	}
	
	public static int insert(int genre, String name, String director, Date releasedate, Date endDate, int audience) {
		int result=0;
		SqlSession session = null;
		
		try {
			session=SqlSessionUtil.getSession();
			Movie movie = new Movie(genre, name, director, releasedate, endDate, audience);
			result=session.insert("movies.insert", movie);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
		return result;
		
	}
	
	public static List<Movie> list() {
		List<Movie> movies =null;
		SqlSession session = null;
		try {
			session=SqlSessionUtil.getSession();
			movies= session.selectList("movies.list");
		} catch (Exception e) {
			e.printStackTrace();	
		} finally {
			if(session!=null) session.close();
		}
		
		return movies;
	}

	
}
