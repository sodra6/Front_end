package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("!!호출!!");
		
	}
	
	/*
	 * Server Applet 의 줄임말
	 * (서버프로그램)
	 * 
	 * - HttpServlet을 상속 받으면됨
	 */
}
