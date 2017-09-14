package com.hanhan.springboothtmltest.EDto;

public class Msg {
    private String msg="";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("com.hanhan.springboothtmltest.EDto.Msg{");
        sb.append("msg='").append(msg).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
