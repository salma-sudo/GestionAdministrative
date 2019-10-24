package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Bean.Login_Bean;

import DAO.DB_Connection;
//import DAO.DB_Connection;


public class Login_model {
public boolean check_user_name(Login_Bean obj_Login_Bean){
		
		boolean flag=false;
		
		
		DB_Connection obj_DB_Connection=new DB_Connection();
		Connection connection=obj_DB_Connection.getConnection();
		/*CNX obj_DB_Connection=new CNX();
		Connection connection=obj_DB_Connection.getCon();*/
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			System.out.println(obj_Login_Bean.getType());
			if (obj_Login_Bean.getType().equals("Admin")) {

			String query="select * from admin where user_name=? and password=?";
			ps=connection.prepareStatement(query);
			ps.setString(1, obj_Login_Bean.getUser_name());
			ps.setString(2, obj_Login_Bean.getPassword());
			System.out.println(ps);
			rs=ps.executeQuery();
			
			if(rs.next()){
				flag=true;
				System.out.println(rs.getInt("id"));
				
				obj_Login_Bean.setId(rs.getInt("id"));
				obj_Login_Bean.setNom(rs.getString("nom"));
			}
			}else if (obj_Login_Bean.getType().equals("Employer")) {
				String query="select * from enseignant where user_name=? and password=?";
				ps=connection.prepareStatement(query);
				ps.setString(1, obj_Login_Bean.getUser_name());
				ps.setString(2, obj_Login_Bean.getPassword());
				System.out.println(ps);
				rs=ps.executeQuery();
				if(rs.next()){
					flag=true;
					System.out.println(rs.getInt("id"));
					obj_Login_Bean.setId(rs.getInt("id"));
					
				}

			}else {
				String query="select * from etudiant where user_name=? and password=?";
				ps=connection.prepareStatement(query);
				ps.setString(1, obj_Login_Bean.getUser_name());
				ps.setString(2, obj_Login_Bean.getPassword());
				System.out.println(ps);
				rs=ps.executeQuery();
				
				if(rs.next()){
					flag=true;
					System.out.println(rs.getInt("id"));
					obj_Login_Bean.setId(rs.getInt("id"));
					obj_Login_Bean.setNum_classe(rs.getInt("Groupe"));
					
				}

			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(connection!=null){
					connection.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
		
		
		return flag;
		
	}
}
