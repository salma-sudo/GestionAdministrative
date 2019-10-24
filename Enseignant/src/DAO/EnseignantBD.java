package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Enseignant;
import Bean.EnseignantConge;
import Bean.EtudiantAbs;


public class EnseignantBD {
	public static int save(Enseignant u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("insert into enseignant(name,password,email,sex,tel) values(?,?,?,?,?)");
			ps.setString(1,u.getName());
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getEmail());
			ps.setString(4,u.getSex());
			ps.setString(5,u.getTel());
			

			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(Enseignant u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("update enseignant set name=?,password=?,email=?,sex=?,tel=? where id=?");
			ps.setString(1,u.getName());
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getEmail());
			ps.setString(4,u.getSex());
			ps.setString(5,u.getTel());
			

			ps.setInt(7,u.getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(Enseignant u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("delete from enseignant where id=?");
			ps.setInt(1,u.getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List<Enseignant> getAllRecords(){
		List<Enseignant> list=new ArrayList<Enseignant>();
		
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("select * from enseignant");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Enseignant u=new Enseignant();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setEmail(rs.getString("email"));
				u.setSex(rs.getString("sex"));
				u.setTel(rs.getString("tel"));

				
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Enseignant getRecordById(int id){
		Enseignant u=null;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("select * from enseignant where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new Enseignant();
				u.setId(rs.getInt("id"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setEmail(rs.getString("email"));
				u.setSex(rs.getString("sex"));
				u.setTel(rs.getString("tel"));
				

			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}
	public static List<EnseignantConge> getEnseignantConge(){
		List<EnseignantConge> enseignantConge = new ArrayList<EnseignantConge>();
		
		try {
			Connection con = CNX.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT c.id ,Name,date_d,date_f,etat,raison from conge c ,enseignant e where e.id=c.id_ens  ");
			
			ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					EnseignantConge e = new EnseignantConge();
					e.setId(rs.getInt("id"));
					e.setName(rs.getString("name"));
					e.setDate_d(rs.getString("date_d"));
					e.setDate_f(rs.getString("date_f"));
					e.setEtat(rs.getString("etat"));
					e.setRaison(rs.getString("raison"));
					enseignantConge.add(e);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return enseignantConge;
	}
	public static List<EnseignantConge> getEnseignantConge(int id) {
		
		List<EnseignantConge> enseignantConge = new ArrayList<EnseignantConge>();
		
		try {
			Connection con = CNX.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT Name,date_d,date_f,etat,raison from conge c ,enseignant e where e.id like ? and e.id=c.id_ens  ");
			ps.setInt(1,id);
			ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					EnseignantConge e = new EnseignantConge();
					e.setName(rs.getString("name"));
					e.setDate_d(rs.getString("date_d"));
					e.setDate_f(rs.getString("date_f"));
					e.setEtat(rs.getString("etat"));
					e.setRaison(rs.getString("raison"));
					enseignantConge.add(e);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return enseignantConge;
	}
}
