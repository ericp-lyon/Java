import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Utilisateur extends Personne {

	private String mdp;

	public Utilisateur(String nom, String prenom, String mdp) {
		super(nom, prenom);
		this.mdp = mdp;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public void InscriptionUtilisateur() {

		try {

			BufferedWriter bw = null;
			bw = new BufferedWriter(new FileWriter(("utilisateur.txt"), true));
			bw.write(this.getNom() + " " + this.getPrenom() + " " + this.mdp + "\n");
			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean ConnexionUtilisateur(String nomVerif, String mdpVerif) {

		try {
			BufferedReader br1 = null;
			String ligne;
			StringTokenizer s;
			// String nom=null;
			// String prenom = null;
			// String mdp = null;

			br1 = new BufferedReader(new FileReader("utilisateur.txt"));

			while ((ligne = br1.readLine()) != null) {
				s = new StringTokenizer(ligne);
				String nom = s.nextToken();
				s.nextToken();
				String mdp = s.nextToken();

				if (nomVerif.equals(nom) && (mdpVerif.equals(mdp))) {// 2e
																							// mot
					br1.close();
					return true;
				}

			}

			// br1.close();
			return false;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}
}
