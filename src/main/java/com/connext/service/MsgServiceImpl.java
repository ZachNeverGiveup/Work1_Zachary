package com.connext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connext.dao.MsgMapper;
import com.connext.pojo.Msg;
@Service
public class MsgServiceImpl implements MsgService {
	
	@Autowired
	MsgMapper msgMapper;
	
	@Override
	public List<Msg> selectByMsguser(String msguser) {
		
		return msgMapper.selectByMsguser(msguser);
	}

	@Override
	public int deleteByPrimaryKey(Integer msgid) {
		msgMapper.deleteByPrimaryKey(msgid);
		return 0;
	}

	@Override
	public Msg selectByPrimaryKey(Integer msgid) {
		return msgMapper.selectByPrimaryKey(msgid);
	}

	@Override
	public int updateByPrimaryKeySelective(Msg msg) {
		msgMapper.updateByPrimaryKeySelective(msg);
		return 0;
	}

	@Override
	public int insert(Msg record) {
		msgMapper.insert(record);
		return 0;
	}

}
