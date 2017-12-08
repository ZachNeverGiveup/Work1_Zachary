package com.connext.pojo;

import java.util.Date;

public class Msg {
    private Integer msgid;

    private String msgtitle;

    private Date msgdate;

    private String msgcontent;

    private String msguser;

    public Integer getMsgid() {
        return msgid;
    }

    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    public String getMsgtitle() {
        return msgtitle;
    }

    public void setMsgtitle(String msgtitle) {
        this.msgtitle = msgtitle == null ? null : msgtitle.trim();
    }

    public Date getMsgdate() {
        return msgdate;
    }

    public void setMsgdate(Date msgdate) {
        this.msgdate = msgdate;
    }

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent == null ? null : msgcontent.trim();
    }

    public String getMsguser() {
        return msguser;
    }

    public void setMsguser(String msguser) {
        this.msguser = msguser == null ? null : msguser.trim();
    }
}