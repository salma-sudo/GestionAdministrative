package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



import bean.user;
import bean.user1;

//import com.mysql.jdbc.Connection;
public class userdao1 {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
	}catch(Exception e){System.out.println(e);}
	return con;
}
public static int save(user1 u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into register1(name,password,email,sex,tel,type) values(?,?,?,?,?,?)");
		ps.setString(1,u.getName());
		ps.setString(2,u.getPassword());
		ps.setString(3,u.getEmail());
		ps.setString(4,u.getSex());
		ps.setString(5,u.getTel());
		ps.setString(6,u.getType());

		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int update(user1 u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("update register1 set name=?,password=?,email=?,sex=?,tel=?,type=? where id=?");
		ps.setString(1,u.getName());
		ps.setString(2,u.getPassword());
		ps.setString(3,u.getEmail());
		ps.setString(4,u.getSex());
		ps.setString(5,u.getTel());
		ps.setString(6,u.getType());

		ps.setInt(7,u.getId());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int delete(user1 u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from register1 where id=?");
		ps.setInt(1,u.getId());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}

	return status;
}
public static List<user1> getAllRecords(){
	List<user1> list=new ArrayList<user1>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from register1");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			user1 u=new user1();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setSex(rs.getString("sex"));
			u.setTel(rs.getString("tel"));
			u.setType(rs.getString("type"));

			
			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static user1 getRecordById(int id){
	user1 u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from register1 where id=?");
		ps.setInt(1,id);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			u=new user1();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setSex(rs.getString("sex"));
			u.setTel(rs.getString("tel"));
			u.setType(rs.getString("type"));

		}
	}catch(Exception e){System.out.println(e);}
	return u;
}
}