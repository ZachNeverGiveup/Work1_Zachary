package com.connext.dao;

import com.connext.pojo.Msg;
import com.connext.pojo.MsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
/**
 * 
 * @author Zach.Zhang
 *
 */
public interface MsgMapper {
    int countByExample(MsgExample example);

    int deleteByExample(MsgExample example);

    int deleteByPrimaryKey(Integer msgid);

    int insert(Msg record);

    int insertSelective(Msg record);

    List<Msg> selectByExample(MsgExample example);

    Msg selectByPrimaryKey(Integer msgid);
    
    List<Msg> selectByMsguser(String msguser);

    int updateByExampleSelective(@Param("record") Msg record, @Param("example") MsgExample example);

    int updateByExample(@Param("record") Msg record, @Param("example") MsgExample example);

    int updateByPrimaryKeySelective(Msg record);

    int updateByPrimaryKey(Msg record);
}