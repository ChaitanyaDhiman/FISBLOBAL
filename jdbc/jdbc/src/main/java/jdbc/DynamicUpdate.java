package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicUpdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2. Get the connection
		String url = "jdbc:mysql://localhost:3306/Employee";
		String username = "root";
		String password = "rps@12345";// rps@12345

		Connection con = DriverManager.getConnection(url, username, password);
		
		String sql = "update employee set LastName=? where Eid=?";
		PreparedStatement pst = con.prepareStatement(sql);
		
		System.out.println("Enter emp id");
		int id = sc.nextInt();
		
		System.out.println("Enter Lastname");
		String lname= sc.next();
		
		pst.setInt(2, id);
		pst.setString(1,lname);
		
		int k = pst.executeUpdate();
		System.out.println(k+" Record updated...");
		
		pst.close();
		con.close();
		
		

	}


}
