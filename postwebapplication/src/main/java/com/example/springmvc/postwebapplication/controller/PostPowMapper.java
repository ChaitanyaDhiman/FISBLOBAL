package com.example.springmvc.postwebapplication.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PostPowMapper implements RowMapper<Posts>{
	
	@Override
	public Posts mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Posts post = new Posts();
		post.setPid(rs.getInt(1));
		post.setAuthor(rs.getString(2));
		post.setAuthor(rs.getString(3));
		post.setDescription(rs.getString(4));
		return post;
	}

}
