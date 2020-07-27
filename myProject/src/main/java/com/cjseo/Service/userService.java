package com.cjseo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjseo.dao.userDAO;
import com.cjseo.dao.userVO;

@Service
public class userService {

	@Autowired userDAO udao;

	public void insertUser(userVO userVO) {
		
		udao.insertUser(userVO);
	}

	public void selectUser(userVO userVO) {
		// TODO Auto-generated method stub
		udao.selectUser(userVO);
	}
}
