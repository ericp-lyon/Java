
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.StringTokenizer;

public class Eleve extends Personne {

	String numEleve;
	String sexe;

	public Eleve(String nom, String prenom, String numEleve, String sexe) {
		super(nom, prenom);
		this.numEleve = numEleve;
		this.sexe = sexe;
	}

	public String getNumEleve() {
		return numEleve;
	}

	public void setNumEleve(String numEleve) {
		this.numEleve = numEleve;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public boolean SaveEleve() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		}

		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		String url = "jdbc:mysql://localhost:3306/test"; // url de ma base de donnée
		String user = "eric";
		String password = "eric";
		Connection connexion = null;
		Statement statement;
		try {
			connexion = DriverManager.getConnection(url, user, password);
			// connaitre nom de la BDD
			System.out.println("Nom de ma BDD: " + connexion.getCatalog());

			// creation de la requete (statement)
			statement = connexion.createStatement();

			// insertion de données dans la table
			String chaineEnvoi;
			chaineEnvoi = "INSERT INTO personne (num,nom,prenom,sexe) VALUES (\"" + this.numEleve + "\", \"" + this.getNom()
					+ "\",\"" + this.getPrenom() + "\",\"" + this.sexe + "\");";
			int nbr = statement.executeUpdate(chaineEnvoi);

			if (0 != nbr) {
				System.out.println("insertion reussie");
			}return true;

		} catch (

		SQLException e) {
			e.printStackTrace();
		} finally {
			if (connexion != null)
				try {
					connexion.close();
				} catch (SQLException ignore) {
					ignore.printStackTrace();
				}
		}return false;
	}

	public boolean EffEleve(String EffElv) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		}

		catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		String url = "jdbc:mysql://localhost:3306/tp2"; // url de ma base de donnée
		String user = "root";
		String password = "admin";
		Connection connexion = null;
		Statement statement;
		try {
			connexion = DriverManager.getConnection(url, user, password);
			// connaitre nom de la BDD
			System.out.println("Nom de ma BDD: " + connexion.getCatalog());

			// creation de la requete (statement)
			statement = connexion.createStatement();

			// insertion de données dans la table
			String chaineEnvoi;
			chaineEnvoi = "INSERT INTO personne (num,nom,prenom,sexe) VALUES (\"" + EffElv + "\", \"" + this.getNom()
			+ "\",\"" + this.getPrenom() + "\",\"" + this.sexe + "\");";
			int nbr = statement.executeUpdate(chaineEnvoi);

			if (0 != nbr) {
				System.out.println("Supprésion reussie");
			}return true;

		} catch (

		SQLException e) {
			e.printStackTrace();
		} finally {
			if (connexion != null)
				try {
					connexion.close();
				} catch (SQLException ignore) {
					ignore.printStackTrace();
				}
		}return false;

	}

	public static boolean Modifier(String modifNum, String modifNom, String modifPrenom, String modifSexe) {

			try {
				Class.forName("com.mysql.jdbc.Driver");
			}

			catch (ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}

			String url = "jdbc:mysql://localhost:3306/tp2"; // url de ma base de donnée
			String user = "root";
			String password = "admin";
			Connection connexion = null;
			Statement statement;
			try {
				connexion = DriverManager.getConnection(url, user, password);
				// connaitre nom de la BDD
				System.out.println("Nom de ma BDD: " + connexion.getCatalog());

				// creation de la requete (statement)
				statement = connexion.createStatement();

				// insertion de données dans la table
				String chaineEnvoi;
				chaineEnvoi = "DELETE TP2 FROM personne WHERE (\"" + modifNum + "\");";
				int nbr = statement.executeUpdate(chaineEnvoi);

				chaineEnvoi = "INSERT INTO personne (num,nom,prenom,sexe) VALUES (\"" + modifNum + "\", \"" + modifNom
						+ "\",\"" + modifPrenom + "\",\"" + modifSexe + "\");";
				nbr = statement.executeUpdate(chaineEnvoi);
				
				if (0 != nbr) {
					System.out.println("Modification reussie");
				}return true;

			} catch (

			SQLException e) {
				e.printStackTrace();
			} finally {
				if (connexion != null)
					try {
						connexion.close();
					} catch (SQLException ignore) {
						ignore.printStackTrace();
					}
			}return false;

	}

}

