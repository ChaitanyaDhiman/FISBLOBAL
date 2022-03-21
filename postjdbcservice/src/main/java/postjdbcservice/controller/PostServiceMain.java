package postjdbcservice.controller;

import java.sql.SQLException;
//import java.util.Iterator;
//import java.util.List;
import java.util.Scanner;

//import postjdbcservice.model.Posts;
import postjdbcservice.service.IPostService;
import postjdbcservice.service.PostServiceImpl;

public class PostServiceMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		IPostService service = new PostServiceImpl();
	
		/*
		 //SQL SELECT * FROM TABLE.
		List<Posts> posts = service.getAllPosts();
		//posts.forEach(System.out::println);
		
		Iterator<Posts> itr = posts.iterator();
		while(itr.hasNext()) {
			Posts p = itr.next();
			System.out.println(p.getPid()+" "+p.getAuthor()+" "+p.getTitle()+" "+p.getDescription());
		}
		//SQL Insertion.
		System.out.println("Enter pid ");
		int pid = sc.nextInt();
		System.out.println("Enter author");
		String author = sc.next();
		System.out.println("Enter title");
		String title = sc.next();
		System.out.println("Enter description");
		String desc = sc.next();
		
		Posts post = new Posts(pid,author,title,desc);
		String result = service.insertPosts(post);
		System.out.println(result);
		*/
		
		//SQL Deletion.
		System.out.println("Enter Pid for deletion : ");
		int pid = sc.nextInt();
		
		String result = service.deletePosts(pid);
		System.out.println(result);
		
		sc.close();
		

	}

}
