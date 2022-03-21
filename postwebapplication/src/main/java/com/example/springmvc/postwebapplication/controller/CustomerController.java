package com.example.springmvc.postwebapplication.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	@Autowired
	JdbcTemplate template;
	
	@RequestMapping(value="/insert")
	public ModelAndView insert(HttpServletResponse response) throws IOException{
		return new ModelAndView("insertpost");
	}
	@RequestMapping(value="/search")
	public ModelAndView search(HttpServletResponse response) throws IOException{
		return new ModelAndView("searchpost");
	}
	@RequestMapping(value="/insertpost")
	public ModelAndView insertpoast(HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		int pid = Integer.parseInt(request.getParameter("pid"));
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		String desc = request.getParameter("desc");
		
		String sql = "insert into posts value(?,?,?,?)";
		template.update(sql,pid,author,title,desc);
		
		return new ModelAndView("customerpage");
	}
	@RequestMapping(value="/searchpost")
	public ModelAndView searchpost(HttpServletResponse response, HttpServletRequest request) throws IOException{
		
		String title = request.getParameter("title");
		List<Posts> posts = template.query("select * from posts where author=?",new PostPowMapper(),title);

		return new ModelAndView("displayposts","tposts",posts);
		
		
	}
	
}
