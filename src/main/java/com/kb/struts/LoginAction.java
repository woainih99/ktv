package com.kb.struts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 * �û���¼Action
 *
 *
 */

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		LoginActionFrom laf=(LoginActionFrom)form;
		String username=laf.getUsername();
		String password=laf.getPassword();
		if("admin".equals(username)&&"admin".equals(password)){
			//ת���ɹ�
			request.setAttribute("username", username);
			return mapping.findForward("success");
			
		}else {
			//ת��ʧ��
		return	mapping.findForward("error");
		}
		
		
	}

}
