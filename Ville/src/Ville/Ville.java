package Ville;

public class Ville {

	private String nomVille;
	private String nomPays;
	private int nbreHabitants;
	private char categorie;

	public Ville() {
		System.out.println("Cr�ation d'une ville");
		nomVille = "Inconnu";
		nomPays = "Inconnu";
		nbreHabitants = 0;

	}

	public Ville(String pNom, int pNbre, String pPays) {
		System.out.println("Cr�ation d'un ville avec des param�tres");
		nomVille = pNom;
		nomPays = pPays;
		nbreHabitants = pNbre;

	}

	public String getNomVille() {
		return nomVille;
	}

	public String getNomPays() {
		return nomPays;
	}

	public int getNbreHabitants() {
		return nbreHabitants;
	}

	public void setNomPays(String pPays) {
		nomPays = pPays;

	}

	public void setNomVille(String pNom) {
		nomVille = pNom;

	}

	public void setNbreHabitants(int pNbre) {
		nbreHabitants = pNbre;
	}

	private void setCategorie() {

		int bornesSuperieures[] = { 0, 1000, 10000, 50000, 100000, 500000, 1000000 };

		char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];

	}

	// D�finit la cat�gorie de la ville
	private void setCategorie1() {

		int bornesSuperieures[] = { 0, 1000, 10000, 100000, 500000, 1000000, 5000000, 10000000 };
		char categories[] = { '?', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };

		int i = 0;
		while (i < bornesSuperieures.length && this.nbreHabitants > bornesSuperieures[i])
			i++;

		this.categorie = categories[i];
	}

	// Retourne la description de la ville
	public String decrisToi() {
		return "\t" + this.nomVille + " est une ville de " + this.nomPays + ", elle comporte : " + this.nbreHabitants
				+ " habitant(s) => elle est donc de cat�gorie : " + this.categorie;
	}

	// Retourne une cha�ne de caract�res selon le r�sultat de la comparaison
	public String comparer(Ville v1) {
		String str = new String();

		if (v1.getNbreHabitants() > this.nbreHabitants)
			str = v1.getNomVille() + " est une ville plus peupl�e que " + this.nomVille;

		else
			str = this.nomVille + " est une ville plus peupl�e que " + v1.getNomVille();

		return str;
	}
}
