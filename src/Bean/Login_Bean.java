package Bean;

public class Login_Bean {
	private int id ,num_classe;
	private String name;
	private String user_name;
	 private String password;
	 private String type;
	 private String nom ,prenom;
	 private int fk_pr;
	 
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNum_classe() {
			return num_classe;
		}
		public void setNum_classe(int num_classe) {
			this.num_classe = num_classe;
		}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFk_pr() {
		return fk_pr;
	}
	public void setFk_pr(int fk_pr) {
		this.fk_pr = fk_pr;
	}
	 
	 
	 
}
