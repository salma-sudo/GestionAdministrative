package Bean;

import java.sql.Date;

public class Conge {
private long num_c;
	private int id;
	private String date_d;
	private String date_f;
	private String etat;
	private String raison;
	
	public void setDate_d(String date_d) {
		this.date_d = date_d;
	}


	public void setDate_f(String date_f) {
		this.date_f = date_f;
	}

	public Conge() {
		super();
	}
	
	
	/*public String getDate_d() {
		return date_d;
	}
	public void setDate_d(String date_d) {
		this.date_d = date_d;
	}
	public String getDate_f() {
		return date_f;
	}
	public void setDate_f(String date_f) {
		this.date_f = date_f;
	}*/

 	
	public String getDate_d() {
		return date_d;
	}


	public String getDate_f() {
		return date_f;
	}

	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getRaison() {
		return raison;
	}
	public void setRaison(String raison) {
		this.raison = raison;
	}
	
	public long getNum_c() {
		return num_c;
	}
	public void setNum_c(long num_c) {
		this.num_c = num_c;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
}
