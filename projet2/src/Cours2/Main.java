package Cours2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Cours2 c=new Cours2(10,20);
		//  c.setNote1(10);
		//	c.setNote2(20);
		//	int moy=c.calculMoyenne();
		//	System.out.println("la moyenne est : " + moy);
			
		//	System.out.println(c);
		
		Personne[] tab=new Personne[2];
		Scanner sc=new Scanner(System.in);
		
		for (int i=0 ; i<tab.length ; i++){
			System.out.println("rentre le nom: ");
			String nom=sc.nextLine();
			System.out.println("rentre le prenom: ");
			String prenom=sc.nextLine();
			
			tab[i]=new Personne(nom , prenom);
						
		}
		
		System.out.println("rentre le nom à chercher: ");
		String nomcherche=sc.nextLine();
		String element;
		boolean j =false;
		for(int i=0; i<tab.length; i++){
			 
			element=tab[i].getNom();
			if (nomcherche.equals(element)){
				System.out.println("Bravo,le nom " + nomcherche +" a été trouvé");
				j=true;
			} 
		}
			if(!j)
				System.out.println("Dommage,le nom " + nomcherche +" n'est pas dans la liste");
			
			
				
		
			
		//public String toString(){
		//	return tab[i];
				
		}
	}


	

	
