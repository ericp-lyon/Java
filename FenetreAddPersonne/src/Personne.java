import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Personne {

	private String nom;
	private static String prenom;
	private static String sexe;

	public Personne(String nom, String prenom, String sexe) {
		super();
		this.nom = nom;
		Personne.prenom = prenom;
		Personne.sexe = sexe;
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
		Personne.prenom = prenom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		Personne.sexe = sexe;
	}

	public void enregistrerPerso() {

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(("formulaire.txt"), true));

			bw.write(this.nom + " " + Personne.prenom + " " + Personne.sexe + "\r\n");

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Personne chercherPersonne(String nom) {

		BufferedReader br = null;
		String ligne = null;
		

		try {
			br = new BufferedReader(new FileReader("formulaire.txt"));

			while ((ligne = br.readLine()) != null) {
				StringTokenizer t = new StringTokenizer(ligne);

				if (nom.equals(t.nextToken())) {

					String prenom = t.nextToken();
					String sexe = t.nextToken();
					br.close();
					return new Personne(nom, prenom, sexe);
				}

			}
			br.close();
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		}
		return null;

	}
}
