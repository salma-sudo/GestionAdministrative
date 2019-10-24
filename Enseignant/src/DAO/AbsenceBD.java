package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.Absence;
import Bean.Enseignant;


public class AbsenceBD {

	public  static int save (Absence a) {
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("insert into Absence(id_et_fk,matiere) values(?,?)");
			
			ps.setInt(1,a.getId_et_fk());
			ps.setString(2,a.getMatiere());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
	
	public static int delete(Absence u){
		int status=0;
		try{
			Connection con=CNX.getCon();
			PreparedStatement ps=con.prepareStatement("delete from enseignant where id_a like ?");
			ps.setInt(1,u.getId_a());
			status=ps.executeUpdate();
		}catch(Exception e){System.out.println(e);}

		return status;
	}
	public static List<Absence> absenceEnseignant(int fk_pr){
		List<Absence> absence = new ArrayList<Absence>();
		
		try {
			Connection con = CNX.getCon();
			PreparedStatement ps=con.prepareStatement("SELECT date,matiere from absence p ,etudiant e where e.id=p.Id_et_FK and Id_et_FK like ?");
			
			ps.setInt(1,fk_pr);
			
			ResultSet rs =ps.executeQuery();
				while(rs.next()) {
					Absence et = new Absence();
					et.setDate(rs.getString("date"));
					et.setMatiere(rs.getString("matiere"));
					absence.add(et);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return absence;
	}
}
