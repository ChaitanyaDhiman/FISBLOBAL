package springpostjava.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import springpostjava.dao.PostDao;

@Configuration
public class PostsConfig {
	
	@Bean
	public DriverManagerDataSource getDriverManager() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/fisglobal");
		ds.setUsername("root");
		ds.setPassword("rps@12345");
		return ds;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(getDriverManager());
		return template;
	}
	
	@Bean("dao")
	public PostDao getPostDao() {
		PostDao dao = new PostDao();
		dao.setTemplate(getJdbcTemplate());
		return dao;
	}

}
