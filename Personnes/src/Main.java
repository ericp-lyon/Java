import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner( System.in);
		
		
		Personnes tableau1[]=new Personnes[3];
	
		
		
		for (int i=0; i<tableau1.length; i++){
			String nom,prenom, niveau;
			int salaire,choix;
			System.out.println("Entrer le nom :");
			nom=sc.next();
			System.out.println("Entrer le prénom :");
			prenom=sc.next();
			System.out.println("Si c'est un étudiant tapez 0, si c'est une Enseignant tapez 1: ");
			choix=sc.nextInt();
			
			if (choix==0){
				System.out.println("Entrer le niveau d'étude de l'etudiant :");
				niveau=sc.next();
				tableau1[i]=new Etudiants(nom,prenom,niveau);
			}
			else{
			System.out.println("entrer le salaire de l'enseignant :");
			salaire=sc.nextInt();
			tableau1[i]=new Enseignants(nom,prenom,salaire);
			}
		}
		
		
		
		
	}

}
