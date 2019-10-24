package Bean;

public class Absence {

	private int id_a;
	private String Date;
	private int id_et_fk;
	private String matiere;

	public Absence() {
		super();
	}
	public int getId_a() {
		return id_a;
	}
	public void setId_a(int id_a) {
		this.id_a = id_a;
	}
	
	public int getId_et_fk() {
		return id_et_fk;
	}
	public void setId_et_fk(int id_et_fk) {
		this.id_et_fk = id_et_fk;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
	
}
