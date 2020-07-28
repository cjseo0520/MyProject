package com.cjseo.dao;

public class userVO {

	private String userid;
	private String userpw;
	private String username;
	private String userjumin;
	private String useremail;
	private String userphone;
	//쿠키기억
	private boolean rememberID; 
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserjumin() {
		return userjumin;
	}
	public void setUserjumin(String userjumin) {
		this.userjumin = userjumin;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUserpw() {
		return userpw;
	}
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	public boolean isRememberID() {
		return rememberID;
	}
	public void setRememberID(boolean rememberID) {
		this.rememberID = rememberID;
	}
	
	
}
