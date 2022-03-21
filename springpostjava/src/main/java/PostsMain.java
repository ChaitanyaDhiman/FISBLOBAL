import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springpostjava.config.PostsConfig;
import springpostjava.dao.PostDao;
import springpostjava.model.Posts;

@SuppressWarnings("unused")
public class PostsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext 	context = new AnnotationConfigApplicationContext(PostsConfig.class);
		PostDao dao = (PostDao) context.getBean("dao");
	/*	List<Posts> posts = dao.getAllPosts();
		for(Posts p : posts) {
			System.out.println(p.getPid()+" "+p.getTitle()+" "+p.getAuthor()+" "+p.getDescription());
		}
	*/	
		System.out.println("Enter pid");
		int pid=sc.nextInt();
		System.out.println("Enter author");
		String author=sc.next();
		System.out.println("Enter title");
		String title=sc.next();
		System.out.println("Enter description");
		String desc=sc.next();
		Posts post = new Posts(pid,author,title,desc);
		System.out.println(dao.insertPost(post));
		
		sc.close();
		
	}

}
