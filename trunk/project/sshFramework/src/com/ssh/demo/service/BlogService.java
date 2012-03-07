package com.ssh.demo.service;

import java.util.Date;
import java.util.List;

import com.ssh.demo.dao.BlogDao;
import com.ssh.demo.entity.Blog;

public class BlogService {
	private BlogDao blogdao;

	public BlogDao getBlogdao() {
		return blogdao;
	}

	public void setBlogdao(BlogDao blogdao) {
		this.blogdao = blogdao;
	}

	public List<Blog> getList() {
		List<Blog> blogList = blogdao.find();
		return blogList;
	}

	public void add(String title, String description) {
		Blog blog = new Blog();
		blog.setTitle(title);
		blog.setAdTime(new Date());
		blog.setDescription(description);
		blogdao.persist(blog);
	}
}
