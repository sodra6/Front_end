package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import oracle.net.ns.SessionAtts;
import util.SqlSessionUtil;
import vo.Book;

public class Ex4 {

	
	public static void main(String[] args) {

		SqlSession session = SqlSessionUtil.getSession();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 책번호?");
		
		String noStr = scan.nextLine();
		
		int no = Integer.parseInt(noStr);// 이것좀 외워라~~~~!!!!!!
		
		System.out.println("수정할 제목은?");
		
		String title = scan.nextLine();
		
		Book book = new Book(no, title); 
		
		int result = session.update("books.update", book);// 두번째인자에는 객체를 넣는다
		System.out.println(result+"개의 책이 수정됨" );
	}
}
