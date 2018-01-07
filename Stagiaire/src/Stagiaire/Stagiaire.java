package Stagiaire;

public class Stagiaire {

	private String nom;
	private int notes[] = new int[3];

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int[] getNotes() {
		return notes;
	}

	public void setNotes(int[] notes) {
		this.notes = notes;
	}

	public Stagiaire(String nom, int[] notes) {
		super();
		this.nom = nom;
		this.notes = notes;
	}

	/// on aurait pu faire aussi en pensant bien au this.note
	/*
	 * public int calculerMoyenne(){ int
	 * moy=((this.notes[0]+this.notes[1]+this.notes[2])/3); return moy;
	 * 
	 */

	public int calculerMoyenne() {
		int somme = 0;
		for (int i = 0; i < 3; i++) {
			somme += this.notes[i];
		}
		return somme / 3;

	}

	public int trouverMax() {

		int max = notes[0];

		for (int i = 1; i < 3; i++) {

			if (this.notes[i] > max) {
				max = this.notes[i];
			}

		}
		return max;
	}

	public int trouverMin() {

		int min = this.notes[0];

		for (int i = 1; i < 3; i++) {

			if (this.notes[i] < min) {
				min = this.notes[i];
			}

		}
		return min;
	}

	public void setNote(int j, int x) {

		this.notes[j] = x;
	}
}
