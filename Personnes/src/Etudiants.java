
public class Etudiants extends Personnes {

	private String niveau;

	public Etudiants(String nom, String prenom, String niveau) {
		super(nom, prenom);
		this.niveau = niveau;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	
	
	
}
