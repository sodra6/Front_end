package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisApp2 {

	
	public static void main(String[] args) throws Exception{
		Reader reader= Resources.getResourceAsReader("config/mybatis-config.xml");
		
		SqlSessionFactoryBuilder sb= new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = sb.build(reader);
		
		//SQLSession !!!!!가장중요!!!!!
		SqlSession session = factory.openSession(true);
		int result = session.delete("idols.delete");
		
		System.out.println(result);
	}
}
