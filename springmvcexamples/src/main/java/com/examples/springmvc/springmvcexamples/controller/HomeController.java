package com.examples.springmvc.springmvcexamples.controller;

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
public class HomeController {
	
	@Autowired
	JdbcTemplate template;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/login")
	public ModelAndView login(HttpServletResponse response) throws IOException{
		return new ModelAndView("login");
	}
		
	@RequestMapping(value = "/validate")
	public ModelAndView validate(HttpServletResponse response, HttpServletRequest request) throws IOException {
		boolean isFound = false;

		String uname = request.getParameter("user");
		String passwd = request.getParameter("pwd");
		List<Users> users = template.query("select * from users", new UserRowMapper());
		for (Users u : users) {
			if (uname.equals(u.getUsername()) && passwd.equals(u.getPassword())) {
				isFound = true;
				break;
			}
		}
		if (isFound)
			return new ModelAndView("success");
		else
			return new ModelAndView("fail");
	}
	
}
