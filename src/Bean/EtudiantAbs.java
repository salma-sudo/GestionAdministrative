package Bean;

import java.sql.Timestamp;

public class EtudiantAbs {
	private int id_a;
	private String nom;
	private String prenom;
	private int a_scolaire;
	private String filière;
	private int groupe ;
	private Timestamp date;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getA_scolaire() {
		return a_scolaire;
	}
	public void setA_scolaire(int a_scolaire) {
		this.a_scolaire = a_scolaire;
	}
	public String getFilière() {
		return filière;
	}
	public void setFilière(String filière) {
		this.filière = filière;
	}
	public int getGroupe() {
		return groupe;
	}
	public void setGroupe(int groupe) {
		this.groupe = groupe;
	}
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public EtudiantAbs() {
		super();
	}
	public int getId_a() {
		return id_a;
	}
	public void setId_a(int id_a) {
		this.id_a = id_a;
	}
}
