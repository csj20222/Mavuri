package com.sogondak.app.user.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.sogondak.mybatis.SqlMapConfig;

public class UserDAO {
	SqlSessionFactory factory = SqlMapConfig.getFactory();
	SqlSession sqlsession;
	
	public UserDAO() {
		sqlsession = factory.openSession(true);
	}
	
	public boolean join(UserDTO user) {
		boolean result = false;
		
		if(sqlsession.insert("User.join", user) == 1) {
			result = true;
		}
		
		return result ;
	}

	public boolean login(String userid, String userpw) {
		boolean result = false;
		HashMap<String, String> datas = new HashMap<>();
		datas.put("userid",userid);
		datas.put("userpw",userpw);
		
		
		// 오브젝트 타입으로 넘어와서 인티져로 형변환
		if((Integer)sqlsession.selectOne("User.login", datas) == 1) {
			result = true;
		}
		
		return result;
			
	}
	
	public boolean checkId(String userid) {
		boolean result = false;
		
		int cnt = 0;
		cnt = sqlsession.selectOne("User.checkId", userid);
		if(cnt == 1) {
			result = true;
		}
		System.out.println(result);
		return result;
       
	}
	

	
}
