import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.jdbc.Statement;

import java.sql.Connection;



public class Main {

	public static void main(String[] args) {
		// Chargement du driver
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false";	
		String user= "eric";
		String password = "eric";
		Connection connexion = null;
		Statement statement;
				
		try {
			connexion = DriverManager.getConnection(url,user,password);
			
			// connaitre nom de la base
			System.out.println("nom de la base est :" + connexion.getCatalog());
			
			//creation de la requete (statement)
			statement = connexion.createStatement();  
			
		
			
			//insertion des valeurs dans la table
			Scanner sc=new Scanner(System.in);
			System.out.println("id");
			System.out.println("nom");
			System.out.println("prenom");
			String chaine;
						
			chaine= "INSERT INTO Personne (numero,nom,prenom) VALUES (id+,'+ nom +''+ prenom');";
			
			System.out.println(chaine);
			int nbr=statement.executeUpdate(chaine);
			
			//enregistrement en dur
			//int nbr= statement.executeUpdate("INSERT INTO Personne (id,nom,prenom) VALUES (50,'John','eric');");
			
			if (0 != nbr);
				System.out.println("tout est ok ");
			
			
			//execution de la requete
			ResultSet result = statement.executeQuery("SELECT * FROM Personne;");
			
			//affichage de la lite des personnes dans la table
			while(result.next()){
				
				int idPersonne = result.getInt("id");
				String nom=result.getString("nom");
				String prenom = result.getString("prenom");
				
				System.out.println(idPersonne + "  "+ nom + "  "+ prenom);
				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally {
				if (connexion != null)
					try {
						connexion.close();
					} catch (SQLException ignore) {
						ignore.printStackTrace();
					}
			}
		
		
		
		
	}

}
