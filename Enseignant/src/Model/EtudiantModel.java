package Model;

import java.util.ArrayList;
import java.util.List;

import Bean.Etudiant;
import Bean.EtudiantAbs;

public class EtudiantModel  {
	
	private String filière;
	private String asc;
	private String grp;
	private List<Etudiant> etudiant= new ArrayList<Etudiant>();
	private List<EtudiantAbs> etudiantAbs =new ArrayList<EtudiantAbs>();
	private String valueCheckBox;
	private int id;
	

	public List<Etudiant> getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(List<Etudiant> etudiant) {
		this.etudiant = etudiant;
	}

	public String getFilière() {
		return filière;
	}

	public void setFilière(String filière) {
		this.filière = filière;
	}

	

	public String getGrp() {
		return grp;
	}

	public void setGrp(String grp) {
		this.grp = grp;
	}

	public String getAsc() {
		return asc;
	}

	public void setAsc(String asc) {
		this.asc = asc;
	}

	public String getValueCheckBox() {
		return valueCheckBox;
	}

	public void setValueCheckBox(String valueCheckBox) {
		this.valueCheckBox = valueCheckBox;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<EtudiantAbs> getEtudiantAbs() {
		return etudiantAbs;
	}

	public void setEtudiantAbs(List<EtudiantAbs> etudiantAbs) {
		this.etudiantAbs = etudiantAbs;
	}

	

}
