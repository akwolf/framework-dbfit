package com.justsy.dbfit.pojo;

import java.sql.Timestamp;

/**
 * @author zhangh
 * @createTime 2013-6-3 下午8:07:09
 */
public class User {
	private int userId ;
	
	private String userName ;
	
	private int credits ;
	
	private String password ;
	
	private Timestamp lastVisit ;
	
	private String lastIp ;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Timestamp getLastVisit() {
		return lastVisit;
	}

	public void setLastVisit(Timestamp lastVisit) {
		this.lastVisit = lastVisit;
	}

	public String getLastIp() {
		return lastIp;
	}

	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [userId=");
		builder.append(userId);
		builder.append(", userName=");
		builder.append(userName);
		builder.append(", credits=");
		builder.append(credits);
		builder.append(", password=");
		builder.append(password);
		builder.append(", lastVisit=");
		builder.append(lastVisit);
		builder.append(", lastIp=");
		builder.append(lastIp);
		builder.append("]");
		return builder.toString();
	}

	
}
