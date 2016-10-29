package test;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import swallow.base.dao.OrderType;
import swallow.base.dao.Query;
import swallow.base.dao.Query.Opt;
import swallow.base.dao.QueryList;
import test.dao.generate.entity.UserInfoEntity;
import test.dao.generate.mapper.UserInfoGenMapper;
import test.dao.mapper.UserInfoMapper;


public class MainTest {

	public static void main(String[] args) throws IOException {
		
		Reader reader = Resources.getResourceAsReader("conf/MybatisConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);

		System.out.println("ok");
	

		SqlSession session = factory.openSession();
		UserInfoMapper mapper= session.getMapper(UserInfoMapper.class);

		//testSel(mapper);
		//testAdd(mapper);
		//testSave(mapper);
		del(mapper);
		session.commit();
		session.close();

	}
	
	public static void testAdd(UserInfoGenMapper mapper){
		UserInfoEntity entity =new UserInfoEntity();
		entity.setName("aohanhe");
		entity.setId((long) 0);
		int l= mapper.addNewUserInfo(entity);
		Long long1=mapper.getNewUserInfoId();
		
		System.out.println(long1);
	}
	
	public static void  testSel(UserInfoGenMapper mapper) throws IOException {
		QueryList<UserInfoEntity.UserInfoEntityKey> queries=new QueryList();
		HashMap<UserInfoEntity.UserInfoEntityKey, OrderType> map =new HashMap<UserInfoEntity.UserInfoEntityKey, OrderType>();
		queries.put(new Query<UserInfoEntity.UserInfoEntityKey>(UserInfoEntity.UserInfoEntityKey.mobile,Opt.eq, "1234567"));
		
		List<UserInfoEntity> list = mapper.getAllUserInfo(queries, map);
		
		System.out.println(list.size());
		System.out.println(list.get(0).getCompanyId());
	}
	
	public static void testSave(UserInfoGenMapper mapper) {
		UserInfoEntity entity = mapper.getUserInfoById(43);
		entity.setName("ccccccc");
		
		System.out.println(mapper.saveUserInfo(entity)); 
				
	}
	
	public static void del(UserInfoGenMapper mapper){
		System.out.println(mapper.delUserInfo(43)); 
	}

}
