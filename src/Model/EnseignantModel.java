package Model;

import java.util.ArrayList;
import java.util.List;

import Bean.EnseignantConge;


public class EnseignantModel {
	
	private List<EnseignantConge> enseignantConge =new ArrayList<EnseignantConge>();
	private String name;
	public List<EnseignantConge> getEnseignantConge() {
		return enseignantConge;
	}

	public void setEnseignantConge(List<EnseignantConge> enseignantConge) {
		this.enseignantConge = enseignantConge;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
