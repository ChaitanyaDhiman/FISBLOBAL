package springpostjava.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import springpostjava.model.Posts;
import springpostjava.model.PostsRowMapper;

public class PostDao {
	
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<Posts> getAllPosts(){
		String sql ="select * from posts";
		return template.query(sql, new PostsRowMapper());
		
	}
	
	public String insertPost(Posts post) {
		String sql = "insert into posts values(?,?,?,?)";
		template.update(sql, post.getPid(), post.getAuthor(), post.getTitle(), post.getDescription());
		return "Post inserted";
	}

}
