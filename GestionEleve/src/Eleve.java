import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Eleve extends Personne {

	private String sexe;
	private String numero;

	public Eleve(String numero, String nom, String prenom, String sexe) {
		super(nom, prenom);
		this.sexe = sexe;
		this.numero = numero;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public static boolean enregitrerEleve(String numEleve, String nomEleve, String prenomEleve, String sexEleve) {

		try {

			BufferedWriter bw = null;

			bw = new BufferedWriter(new FileWriter(("eleve.txt"), true));
			bw.write(numEleve + " " + nomEleve + " " + prenomEleve + " " + sexEleve + "\r");
			bw.close();
			return true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean chercherEleve(String numEleve) {

		try {
			BufferedReader br1 = null;
			String ligne;
			StringTokenizer s;

			br1 = new BufferedReader(new FileReader("eleve.txt"));
			while ((ligne = br1.readLine()) != null) {
				s = new StringTokenizer(ligne);

				if (numEleve.equals(s.nextToken())) {
					return false;
				}

			}
			br1.close();
			return true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean EffacerEleve(String numEleve) {

		try {
			BufferedReader br1 = null;
			BufferedWriter bw = null;
			String ligne, remplace;
			remplace = "";
			StringTokenizer s;

			// String prenom = null, sexe = null;

			br1 = new BufferedReader(new FileReader("eleve.txt"));

			while ((ligne = br1.readLine()) != null) {
				s = new StringTokenizer(ligne);

				if (numEleve.equals((s.nextToken()))) {

					ligne = br1.readLine();
					remplace += ligne + "\n";

				} else {
					remplace += ligne + "\n";

				}

			}
			br1.close();

			bw = new BufferedWriter(new FileWriter(("eleve.txt"), false));
			bw.write(remplace);

			bw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

	public static boolean ModifierEleve(String modifNum, String modifNom, String modifPrenom, String modifSexe) {

		try {
			BufferedReader br1 = null;
			BufferedWriter bw = null;
			String ligne, remplace;
			remplace = "";
			StringTokenizer s;

			String prenom = null, sexe = null;

			br1 = new BufferedReader(new FileReader("eleve.txt"));

			while ((ligne = br1.readLine()) != null) {
				s = new StringTokenizer(ligne);

				if (modifNum.equals((s.nextToken()))) {

					prenom = s.nextToken(); // 2e mot
					sexe = s.nextToken(); // 3e mot
					remplace += remplace = (modifNum + " " + modifNom + " " + modifPrenom + " " + modifSexe + "\n");
					System.out.println("ce qu'il remplace " + remplace);

				} else {
					remplace += ligne + "\n";

				}

			}
			br1.close();

			bw = new BufferedWriter(new FileWriter(("eleve.txt"), false));
			bw.write(remplace);
			bw.close();
			return true;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

}
