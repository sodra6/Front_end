package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;
import vo.Book;

public class BookDAO {

	public static List<Book> selectList() {
		List<Book> book = null;
		SqlSession session = null;
		
		try {
			session = SqlSessionUtil.getSession();
			book= session.selectList("books.selctList");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(session!=null) session.close();
		}
		
		return book;
	}
	
}
