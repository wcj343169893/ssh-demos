package com.ssh.demo.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.ssh.demo.common.BaseAction;
import com.ssh.demo.entity.Blog;
import com.ssh.demo.service.BlogService;

public class BlogAction extends BaseAction {
	private static final long serialVersionUID = 1L;
	private BlogService blogService;
	private List<Blog> blogList = new ArrayList<Blog>();

	public String doList() {
		blogList = blogService.getList();
		return "doList";
	}

	public String doAdd() {
		HttpServletRequest request = getRequest();
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		blogService.add(title, description);
		return "doAdd";
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

	public BlogService getBlogService() {
		return blogService;
	}

	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}

	public List<Blog> getBlogList() {
		return blogList;
	}

	public void setBlogList(List<Blog> blogList) {
		this.blogList = blogList;
	}

}
