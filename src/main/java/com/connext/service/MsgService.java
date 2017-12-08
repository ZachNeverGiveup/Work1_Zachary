package com.connext.service;

import java.util.List;

import com.connext.pojo.Msg;

public interface MsgService {
	List<Msg> selectByMsguser(String msguser);
	
	int deleteByPrimaryKey(Integer msgid);
	
	 Msg selectByPrimaryKey(Integer msgid);
	 
	 int updateByPrimaryKeySelective(Msg record);
	 
	 int insert(Msg record);
}
