package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class CNX {
	private static Connection con ;
	public static Connection getCon() {
		return con;
	}
	static {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		}catch(Exception e){System.out.println(e);}
	}
}
