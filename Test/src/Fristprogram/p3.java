package Fristprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class p3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String s="jdbc:mysql://localhost:3306/Selenium";
		Connection con=DriverManager.getConnection(s,"root","");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from login");
		while(rs.next())
		{
			String username=rs.getString(1);
			String pass=rs.getString("pass");
			System.out.print(username);
			System.out.print(" "+pass);
			System.out.println();
			
		}

	}

}
