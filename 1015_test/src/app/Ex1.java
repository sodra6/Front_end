package app;

import java.util.List;

import dao.BookDAO;
import vo.Book;

public class Ex1 {

	
	public static void main(String[] args) {
		
		
		List<Book> book = BookDAO.selectList();
		
		
		for (Book book2 : book) {
			System.out.println(book2.getNo()+book2.getTitle());
		}
				
	}
}
