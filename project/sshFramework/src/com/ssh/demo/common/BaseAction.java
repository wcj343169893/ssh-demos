package com.ssh.demo.common;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	public HttpServletRequest getRequest() {
		return ServletActionContext.getRequest();
	}
}
