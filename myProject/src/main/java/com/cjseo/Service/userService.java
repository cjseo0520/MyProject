package com.cjseo.Service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjseo.dao.userVO;

@Service
public class userService {

	@Autowired
	private SqlSessionTemplate userSqlSession;
	private UserDaoInterface userDAO;
	
	public void userSignup(userVO userVO) {
		// TODO Auto-generated method stub
		
	}

}
