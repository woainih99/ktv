package com.kb.servlet;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QueryAction implements Action {

	public String excute(HttpServletRequest req, HttpServletResponse res) {
		// TODO �Զ����ɵķ������
		String username= req.getParameter("username");
		UserManager userManager=new UserManager();
		List<String> userList= userManager.findUserByName(username);
		req.setAttribute("userList", userList);	
		
		return "/c.jsp";
	}

}
