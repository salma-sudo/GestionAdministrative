package Bean;

public class EnseignantConge {
	private int id; 
	private String name;
	private String date_d;
	private String date_f;
	private String etat;
	private String raison;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate_d() {
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
	public EnseignantConge() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
