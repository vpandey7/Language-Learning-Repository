package org.vish.loginservlets.dto;

//dto is data transfer object.It is same as Model.Used to transfer data between layers.(data layer to business layer and so on)

public class User {
	
	private String userName;
	private String userId;
	
	//getters and setters for userName and userId
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	

}
