package app;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import oracle.net.ns.SessionAtts;
import util.SqlSessionUtil;
import vo.Idol;

public class Ex7 {

	
	public static void main(String[] args) {
		
		SqlSession session = SqlSessionUtil.getSession();
		
		List<Idol> list =session.selectList("idols.select");
		
		for (Idol idol : list) {
			System.out.println(idol);
		}
		
		
	}//main end
}//Ex7 end
