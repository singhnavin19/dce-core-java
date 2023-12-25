package com.jdbcc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMysqlExamle {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.register driver or Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//2. Create connection:
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nav?characterEncoding=latin1&useConfigs=maxPerformance","root","root@123");
		
		//3. Create statement:
		Statement stmt=con.createStatement();
		
		//4. Execute statement:
		ResultSet rst=stmt.executeQuery("select * from navinTest");
//		stmt.executeUpdate("insert into navinTest values(?)");
		
		while(rst.next()){
			System.out.print(rst.getString("id"));
			System.out.println("");
		}
		//5. Close database connection:
		con.close();
	}
}
