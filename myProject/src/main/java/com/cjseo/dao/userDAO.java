package com.cjseo.dao;

import org.apache.ibatis.annotations.Param;

public interface userDAO {

	void insertUser(@Param("udao")userVO userVO);
}
