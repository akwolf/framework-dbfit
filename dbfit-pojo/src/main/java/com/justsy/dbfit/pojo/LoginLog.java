package com.justsy.dbfit.pojo;

import java.sql.Timestamp;

/**
 * @author zhangh
 * @createTime 2013-6-3 下午8:10:13
 */
public class LoginLog {
	private int loginLogId ;
	private int userId ;
	private String ip ;

	private Timestamp LoginDatetime ;

	public int getLoginLogId() {
		return loginLogId;
	}

	public void setLoginLogId(int loginLogId) {
		this.loginLogId = loginLogId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Timestamp getLoginDatetime() {
		return LoginDatetime;
	}

	public void setLoginDatetime(Timestamp loginDatetime) {
		LoginDatetime = loginDatetime;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LoginLog [loginLogId=");
		builder.append(loginLogId);
		builder.append(", userId=");
		builder.append(userId);
		builder.append(", ip=");
		builder.append(ip);
		builder.append(", LoginDatetime=");
		builder.append(LoginDatetime);
		builder.append("]");
		return builder.toString();
	}
	
	
}
