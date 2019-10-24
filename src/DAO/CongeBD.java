package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import Bean.Conge;


public class CongeBD {
	private ArrayList<Conge> conge =new ArrayList<Conge>();

	public ArrayList<Conge> getConge() {
		return conge;
	}

	public void setConge(ArrayList<Conge> conge) {
		this.conge = conge;
	}
	
	public void add(Conge c) {
		conge.add(c);
	}
	
	public ArrayList<Conge> getAll() {
		return conge;
	}
	
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
	
	public static int save(Conge u){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into conge(date_d,date_f,etat,raison) values(?,?,?,?)");
		
			ps.setString(1,u.getDate_d());
			ps.setString(2,u.getDate_f());
			ps.setString(3,u.getEtat());
			ps.setString(4,u.getRaison());
			
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(Conge u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("delete from conge where id=?");
			ps.setInt(1,u.getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
}
