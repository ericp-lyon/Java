
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
import java.util.Scanner;
import java.util.StringTokenizer;

public class Utilisateur extends Personne {

	private String mdpUser;

	public Utilisateur(String nom, String prenom, String mdpUser) {
		super(nom, prenom);
		this.mdpUser = mdpUser;
	}

	public String getMdpUser() {
		return mdpUser;
	}

	public void setMdpUser(String mdpUser) {
		this.mdpUser = mdpUser;
	}

	public void InscriptionUser() {

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
			chaineEnvoi = "INSERT INTO personne (nom,prenom) VALUES (\"" + this.getNom() + "\", \"" + this.getPrenom() + "\");";
			int nbr = statement.executeUpdate(chaineEnvoi);

			if (0 != nbr) {
				System.out.println("insertion reussie");
			}

			// execution de la requete
			ResultSet result = statement.executeQuery("SELECT *FROM Utilisateur;");
			// parcour de la table mis dans "result"
			while (result.next()) {
				System.out.println(result.getString("nom") + " " + result.getString("prenom"));
			}

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
		}

	}

	public static boolean AuthentificationUser(String nomRecu, String mdpRecu) {

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

			// creation de la requete (statement)
			statement = connexion.createStatement();

			// execution de la requete
			ResultSet result = statement.executeQuery("SELECT *FROM Utilisateur;");
			// parcour de la table mis dans "result"
			while (result.next()) {

				if (result.getString("nom").equals(result.getString("motDePasseUtilisateur"))) {
					return true;
				}
			}

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

		}
		return false;

	}

}