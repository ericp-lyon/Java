package Stagiaire;

public class Formation {

	private String intitule;
	private int nbrJours;
	private Stagiaire stagiaires[] = new Stagiaire[3];

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getNbrJours() {
		return nbrJours;
	}

	public void setNbrJours(int nbrJours) {
		this.nbrJours = nbrJours;
	}

	public Stagiaire[] getStagiaires() {
		return stagiaires;
	}

	public void setStagiaires(Stagiaire[] stagiaires) {
		this.stagiaires = stagiaires;
	}

	public Formation(String intitule, int nbrJours, Stagiaire[] stagiaires) {
		super();
		this.intitule = intitule;
		this.nbrJours = nbrJours;
		this.stagiaires = stagiaires;
	}

	public int calculerMoyenneFormation() {
		int somme = 0;
		for (int i = 0; i < stagiaires.length; i++) {
			somme += (stagiaires[i].calculerMoyenne());

		}
		return (somme / stagiaires.length);
	}

	public String afficherNomMax() {

		int max = stagiaires[0].calculerMoyenne();
		String nom = stagiaires[0].getNom();

		for (int i = 1; i < stagiaires.length; i++) {

			if (stagiaires[i].calculerMoyenne() > max) {

				max = stagiaires[i].calculerMoyenne();
				nom = stagiaires[i].getNom();
			}

		}
		return nom;

	}

	public int afficherMinMax() {

		int min = stagiaires[0].trouverMin();
		int max = stagiaires[0].calculerMoyenne();

		for (int i = 1; i < stagiaires.length; i++) {

			int moy = stagiaires[i].calculerMoyenne();

			if (moy > max) {

				max = moy;
				min = stagiaires[i].trouverMin();
			}

		}
		return min;
	}

	public int trouverMoyenneParNom(String Nom) {
		int j = 0;
		for (int i = 0; i < this.stagiaires.length; i++) {
			if (Nom == this.stagiaires[i].getNom()) {

				j = this.stagiaires[i].calculerMoyenne();

			}

		}
		return j;
	}
	
	
	
	
}
