package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Etudiant;
import Bean.Pointage;

public class PointageBD {
	public  static int save (int id) {
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("insert into pointage(fk_pr) values(?)");
			
			ps.setInt(1,id);
			
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}

	public static List<Pointage> PointageEnseignant(int fk_pr){
		List<Pointage> pointage = new ArrayList<Pointage>();
		
		try {
			Connection con = CNX.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT Date from pointage p ,enseignant e where e.id=p.fk_pr and fk_pr like ?");
			
			ps.setInt(1,fk_pr);
			
			ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					Pointage et = new Pointage();
					et.setDate(rs.getString("date"));
					
					pointage.add(et);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return pointage;
	}
}
