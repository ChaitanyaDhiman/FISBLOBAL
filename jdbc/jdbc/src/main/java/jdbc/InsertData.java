package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// 1. Load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				// DriverManager.registerDriver(new com.mysql.jdbc.Driver());

				// 2. Get the connection
				String url = "jdbc:mysql://localhost:3306/Employee";
				String username = "root";
				String password = "rps@12345";// rps@12345

				Connection con = DriverManager.getConnection(url, username, password);

				// 3. create a statment object
				Statement st = con.createStatement();

				//String sql="select * from employee";
				String sql = "insert into employee values(106,'Akash','Singh')";

				// 4. write the query and excuted, and results are stored
				// in resultset object
			// ResultSet rs = st.executeQuery(sql);
				int count = st.executeUpdate(sql);

				System.out.println(count+" Record inserted....");
				
				st.close();
				con.close();

	}

}
