package Model;


import java.util.List;

import Bean.EnseignantConge;
import Bean.Etudiant;
import Bean.EtudiantAbs;

public interface Im�tier {
	public List<Etudiant> getEtudiantMC(String fil,int asc,int grp);
	public  List<EtudiantAbs> getEtudiantABS(String fil,int asc,int grp);


	
}
