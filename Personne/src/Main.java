import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Personne personnes[]=new Personne[5];
		Scanner sc=new Scanner(System.in);
		
		
		for (int i=0; i<personnes.length; i++){
			System.out.println("Entre votre choix; 0 pour etudiant ou 1 pour enseignant: ");
			int choix=sc.nextInt();
			
			if(choix==0){
				System.out.println("entrez le nom : ");
				String no=sc.next();
				System.out.println("entrez le prenom : ");
				String pre=sc.next();
				System.out.println("entrez le niveau : ");
				String niv=sc.next();
				
				//Etudiants etud=new Etudiants(no,pre,niv);    autre méthode pour comprendre
				//personnes[i]=etud;
				
				personnes[i]=new Etudiants(no,pre,niv);
				
			}
			else{
				System.out.println("entrez le nom : ");
				String no=sc.next();
				System.out.println("entrez le prenom : ");
				String pre=sc.next();
				System.out.println("entrez le salaire : ");
				int sal=sc.nextInt();
				
				personnes[i]=new Enseignants(no,pre,sal);
				
				
				
			}
		}
	
		
	}

}
