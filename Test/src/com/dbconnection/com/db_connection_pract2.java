package com.dbconnection.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class db_connection_pract2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Data from DATABSE");
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Selenium","root","");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from login");
		while(rs.next())
		{
			String id=rs.getString(1);
			String pass=rs.getString("pass");
			System.out.print(id);
			System.out.print(" "+pass);
			System.out.println();			
		}
		
		System.out.println("Data from Excel");
		FileInputStream in=new FileInputStream("C:\\Users\\Vicky\\Desktop\\Rupesh\\login.xls");
		HSSFWorkbook work=new HSSFWorkbook(in);
		HSSFSheet sheet=work.getSheetAt(0);
		HSSFCell id,pass;
		for(int i=1;i<sheet.getLastRowNum();i++)
		{
			for(int j=1;j<sheet.getRow(i).getLastCellNum();j++)
			{
				id=sheet.getRow(i).getCell(j);
				pass=sheet.getRow(i).getCell(j);
				System.out.print(id);;
				System.out.print(" "+pass);
				System.out.println();				
			}
			
		}
	}

}
