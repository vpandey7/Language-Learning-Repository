package org.vish.loginservlets.service;

import java.util.HashMap;

import org.vish.loginservlets.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService(){
		
		
		users.put("johndoe", "John Doe");
		users.put("vpandey", "Vishal Pandey");
		users.put("mkom", "Mary Kom");
	}
	
	public boolean authenticate(String userId, String password){
		
		if(password == null || password.trim()==""){
			return false;		
		}
		else{
			return true;
		}
	}
	
	public User getUserDetails(String userId){
		
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
		
		
	}
	
	
}
