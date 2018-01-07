
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Scanner;

public class GestionBdd {

	public void Enregistrement(String nomRecu, String prenomRecu) {
		// chargement du driver//
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
			Scanner sc = new Scanner(System.in);
			System.out.println(nomRecu);
			System.out.println(prenomRecu);
			String chaineEnvoi;
			chaineEnvoi = "INSERT INTO personne (nom,prenom) VALUES (\"" + nomRecu + "\", \"" + prenomRecu + "\");";
			System.out.println(chaineEnvoi);
			int nbr = statement.executeUpdate(chaineEnvoi);

			if (0 != nbr) {
				System.out.println("insertion reussie");
			}

			// execution de la requete
			ResultSet result = statement.executeQuery("SELECT *FROM Personne;");
			// parcour de la table mis dans "result"
			while (result.next()) {
				System.out.println(
						result.getInt("id") + " " + result.getString("nom") + " " + result.getString("prenom"));
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
}