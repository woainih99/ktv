package com.kb.servlet;
import java.util.ArrayList;
import java.util.List;

public class UserManager {
	public List<String> findUserByName(String name){
		List<String> userList=new ArrayList<String>();
		userList.add("����1");
		userList.add("����2");
		return userList;	
	}
}
