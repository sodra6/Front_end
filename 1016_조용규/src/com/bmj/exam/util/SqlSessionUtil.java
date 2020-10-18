package com.bmj.exam.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	
	public static SqlSession getSession() {
		try {
			Reader reader = Resources.getResourceAsReader("com/bmj/exam/config/mybatis-config.xml");
			SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();

			SqlSessionFactory factory = sb.build(reader);
			
			//SqlSession <--- 이놈
			return factory.openSession(true);
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}//try ! catch end
	
	}//getSession() end
}
