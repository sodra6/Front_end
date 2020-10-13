package app;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisApp1 {

	
	public static void main(String[] args) throws Exception {
		
		Reader reader= Resources.getResourceAsReader("config/mybatis-config.xml");
		
		SqlSessionFactoryBuilder sb= new SqlSessionFactoryBuilder();
		
		SqlSessionFactory factory = sb.build(reader);
		
		//SQLSession !!!!!가장중요!!!!!
		SqlSession session = factory.openSession(true);
		
		int result = session.delete("groups.delete");// namespace.id
		System.out.println(result+"개 삭제");
		
	}//main end
	
	
}//MybatisApp1 end
