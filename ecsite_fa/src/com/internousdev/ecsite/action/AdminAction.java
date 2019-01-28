package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;

public class AdminAction extends ActionSupport {

	private String adminFlg;

	public String execute() {

		adminFlg = "1";

		return SUCCESS;
	}

	public String getAdminFlg() {
		return adminFlg;
	}
}
