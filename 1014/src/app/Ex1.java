package app;

import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import util.SqlSessionUtil;

public class Ex1 {

	
	public static void main(String[] args) {
	
		SqlSession session = SqlSessionUtil.getSession();
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("삭제할 책번호는?");

		int no = scan.nextInt();

		int result = session.delete("books.delete",no); //namespace.id로 꼭!!, 넘겨줄 파라미터가 존재한다면 두번째 인자에 입력
		
		System.out.println(result+"개 삭제");
		
	}//main end
	
}//Ex1 end
