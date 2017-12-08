package com.connext.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.connext.pojo.Msg;
import com.connext.pojo.User;
import com.connext.service.MsgServiceImpl;
/**
 * 
 * @author Zach.Zhang
 *
 */
@Controller
public class MsgController {

	@Autowired
	MsgServiceImpl msgService;
	
	@RequestMapping("toMessageList.do")
	public String toMessageList(HttpServletRequest request){
		User user = (User) request.getSession().getAttribute("user");
		List<Msg> list = msgService.selectByMsguser(user.getUserid()+"");
		request.setAttribute("msglist", list);
		return "messageList";
		
	}
	/**
	 * msgMore.do
	 */
	@RequestMapping("msgMore.do")
	@ResponseBody
	public Msg msgMore(Integer msgid){
		return msgService.selectByPrimaryKey(msgid);
	}
	
	/**
	 * msgDel.do
	 */
	@RequestMapping("msgDel.do")
	@ResponseBody
	public String deleteMsgById(Integer msgid){
		msgService.deleteByPrimaryKey(msgid);
		return "OK";
	}
	
	
	@RequestMapping("toEdit.do")
	public String toEditMsgById(Integer msgid,HttpServletRequest request){
		Msg msg = msgService.selectByPrimaryKey(msgid);
		request.setAttribute("mesg", msg);
		return "messageEdit";
	}
	@RequestMapping("toAdd.do")
	public String toAddMsgPage(){
		return "messageAdd";
	}
	
	@RequestMapping("updateMsg.do")
	public String updateMsg(Msg msg) throws ParseException{
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        String formatDate = dFormat.format(new java.util.Date());  
        msg.setMsgdate(dFormat.parse(formatDate));
		msgService.updateByPrimaryKeySelective(msg);
		return "redirect:toMessageList.do";
	}
	@RequestMapping("addMsg.do")
	public String addMsg(Msg msg) throws ParseException{
		SimpleDateFormat dFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        String formatDate = dFormat.format(new java.util.Date());  
        msg.setMsgdate(dFormat.parse(formatDate));
		msgService.insert(msg);
		return "redirect:toMessageList.do";
	}
}
