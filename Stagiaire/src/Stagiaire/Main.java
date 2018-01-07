package Stagiaire;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("Rentre le nom du stagiaire:"); String
		 * nomstag1=sc.next();
		 * 
		 * int[] table1=new int[3];
		 * 
		 * 
		 * for (int i=0;i<3;i++) {
		 * System.out.print("rentre les notes du stagiaire");
		 * table1[i]=sc.nextInt();
		 * 
		 * 
		 * } Stagiaire stag1=new Stagiaire(nomstag1, table1);
		 * 
		 * for (int i=0; i<table1.length; i++){
		 * 
		 * System.out.println("voici la note "+ (i+1) + " : " +
		 * stag1.getNotes()[i]);
		 * 
		 * }
		 */

		// int[] table1={10,12,19};
		// Stagiaire stagiaire1=new Stagiaire("eri", table1); pour rentrer
		// tableau en dur

		System.out.println();

		Stagiaire stag[] = new Stagiaire[3];

		for (int i = 0; i < stag.length; i++) {

			System.out.println("entre le nom du stagiaire: ");
			String nom = sc.next();

			stag[i] = new Stagiaire(nom, new int[3]);

			for (int j = 0; j < stag[i].getNotes().length; j++) {
				System.out.println("entre la note: ");
				int x = sc.nextInt();
				stag[i].setNote(j, x);

			}
		}
		System.out.println("entre le nom de l'intitule: ");
		String intitule = sc.next();
		System.out.println("entre le nombre: ");
		int nbre = sc.nextInt();
		Formation form = new Formation(intitule, nbre, stag);

		System.out.println("la moyenne est de : " + stag[0].calculerMoyenne());
		System.out.println("la note max est de : " + stag[1].trouverMax());
		System.out.println("la note minimum est de : " + stag[1].trouverMin());

		System.out.println("la note moyenne de la formation est de : " + form.calculerMoyenneFormation());

		/*
		 * System.out.println("entrez nom;"); String nom=sc.next();
		 * 
		 * int[] tab1=new int[3]; for(int i=0; i< tab1.length;i++){
		 * 
		 * System.out.println("entrez notes;"); tab1[i]=sc.nextInt();
		 * 
		 * }
		 * 
		 * Stagiaire sta1=new Stagiaire(nom,tab1);
		 * 
		 * for (int i=0; i< tab1.length;i++){
		 * System.out.println(sta1.getNotes()[i]);
		 * 
		 * }
		 * 
		 * System.out.println(sta1.calculerMoyenne());
		 * System.out.println(sta1.trouverMax());
		 * System.out.println(sta1.trouverMin());
		 */

	}
}
