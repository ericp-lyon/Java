
public class Enseignants extends Personne{
	
	private int salaire;

	public Enseignants(String nom, String prenom, int salaire) {
		super(nom, prenom);
		this.salaire = salaire;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}
	
	

}
