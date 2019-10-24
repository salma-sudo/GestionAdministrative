package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Absence;
import Bean.EnseignantConge;
import Bean.Etudiant;
import Bean.EtudiantAbs;
import Model.Imétier;


public class EtudiantBD implements Imétier {
	
	public List<Etudiant> getEtudiantMC(String fil,int asc,int grp){
		List<Etudiant> etudiant = new ArrayList<Etudiant>();
		
		try {
			Connection con = CNX.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT id, Nom ,Prenom  FROM etudiant where Filiere like ? and Groupe like ? and A_scolaire like ?");
			
			ps.setString(1,"%"+fil+"%");
			ps.setInt(2,grp);
			ps.setInt(3,asc);
			ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					Etudiant et = new Etudiant();
					et.setId(rs.getInt("id"));
					et.setNom(rs.getString("Nom"));
					et.setPrenom(rs.getString("Prenom"));
					
					etudiant.add(et);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return etudiant;
	}
	
	public  List<EtudiantAbs> getEtudiantABS(String fil,int asc,int grp){
		List<EtudiantAbs> etudiantAbs = new ArrayList<EtudiantAbs>();
		
		try {
			Connection con = CNX.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT id_a ,Nom ,Prenom , date from etudiant e , absence a where a.Id_et_FK=e.Id  and  Filiere like ? and Groupe like ? and A_scolaire like ?");
			
			ps.setString(1,"%"+fil+"%");
			ps.setInt(2,grp);
			ps.setInt(3,asc);
			ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					EtudiantAbs e = new EtudiantAbs();
					e.setId_a(rs.getInt("id_a"));
					e.setNom(rs.getString("Nom"));
					e.setPrenom(rs.getString("Prenom"));
					e.setDate(rs.getTimestamp("date"));
					
					etudiantAbs.add(e);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return etudiantAbs;
	}
	public static int save(Etudiant u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("insert into etudiant(nom,prenom,password,Filiere,email,tel,sex,A_scolaire,Groupe) values(?,?,?,?,?,?,?,?,?)");
			ps.setString(1,u.getNom());
			ps.setString(2,u.getPrenom());
			ps.setString(3,u.getPassword());
			ps.setString(4,u.getFiliere());
			ps.setString(5,u.getEmail());
			ps.setString(6,u.getTel());
			ps.setString(7,u.getSex());
			ps.setInt(8,u.getA_scolaire());
			ps.setInt(9,u.getGroupe());
			status=ps.executeUpdate();
			System.out.println(status);
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int update(Etudiant u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("update etudiant set nom=?,prenom=?,password=?,email=?,Filiere=?,sex=?,tel=?,Groupe=? ,A_scolaire=?  where id=?");
			ps.setString(1,u.getNom());
			ps.setString(2, u.getPrenom());
			ps.setString(3,u.getPassword());
			ps.setString(4,u.getEmail());
			ps.setString(5, u.getFiliere());
			ps.setString(6,u.getSex());
			ps.setString(7,u.getTel());
			ps.setInt(8,u.getGroupe());
			ps.setInt(9,u.getA_scolaire());
			ps.setInt(10,u.getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	public static int delete(Etudiant u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("delete from etudiant where id=?");
			ps.setInt(1,u.getId());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static int deleteAbs(Absence u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("delete from absence where Id_a=?");
			ps.setInt(1,u.getId_a());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List<Etudiant> getAllRecords(){
		List<Etudiant> list=new ArrayList<Etudiant>();
		
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("select id,nom,prenom,email,sex,tel,Groupe, Filiere from etudiant");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Etudiant u=new Etudiant();
				u.setId(rs.getInt("id"));
				u.setNom(rs.getString("nom"));
				u.setPrenom(rs.getString("prenom"));
				u.setEmail(rs.getString("email"));
				u.setSex(rs.getString("sex"));
				u.setTel(rs.getString("tel"));
				u.setGroupe(rs.getInt("Groupe"));
				u.setFiliere(rs.getString("Filiere"));
				
				list.add(u);
			}
		}catch(Exception e){System.out.println(e);}
		return list;
	}
	public static Etudiant getRecordById(int id){
		Etudiant u=null;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("select * from etudiant where id=?");
			ps.setInt(1,id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				u=new Etudiant();
				u.setId(rs.getInt("id"));
				u.setNom(rs.getString("nom"));
				u.setPrenom(rs.getString("prenom"));
				u.setPassword(rs.getString("password"));
				u.setFiliere(rs.getString("filiere"));
				u.setEmail(rs.getString("email"));
				u.setSex(rs.getString("sex"));
				u.setTel(rs.getString("tel"));
				u.setGroupe(rs.getInt("Groupe"));

			}
		}catch(Exception e){System.out.println(e);}
		return u;
	}

	
	
}
