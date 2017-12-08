package com.connext.dao;


import com.connext.pojo.User;

public interface UserMapper {
	
	int insertUser(User u);
	
	User selectByUserphone(String userphone);
	
	User selectByUser(User user);
}
