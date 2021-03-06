package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class LogoutAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	private String logoutMessage;

	public String execute() {
		String result = SUCCESS;

		session.clear();
		setLogoutMessage("ログアウトしました。");

		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getLogoutMessage() {
		return logoutMessage;
	}

	public void setLogoutMessage(String logoutMessage) {
		this.logoutMessage = logoutMessage;
	}
}
