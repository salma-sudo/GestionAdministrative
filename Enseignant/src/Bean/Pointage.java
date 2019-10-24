package Bean;

public class Pointage {
	private int id_P;
	private String Date;
	private int fk_pr;
	public int getId_P() {
		return id_P;
	}
	public void setId_P(int id_P) {
		this.id_P = id_P;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public int getFk_pr() {
		return fk_pr;
	}
	public void setFk_pr(int fk_pr) {
		this.fk_pr = fk_pr;
	}
	public Pointage() {
		super();
	}
}
