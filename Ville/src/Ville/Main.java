package Ville;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ville ville=new Ville();
		// System.out.println(ville.nomVille);
		// System.out.println(ville.nomPays);
		// System.out.println(ville.nbreHabitants);

		// Ville ville1=new Ville("Lyon" , 69888 , "France");

		Ville v = new Ville();
		Ville v1 = new Ville("Marseille", 654, "France");
		Ville v2 = new Ville("Paris", 123, "France");

		System.out.println("la ville de v " + v.getNomVille() + " ville de " + v.getNbreHabitants()
				+ " habitants se situant en " + v.getNomPays());
		;
		System.out.println("la ville de v1 " + v1.getNomVille() + " ville de " + v1.getNbreHabitants()
				+ " habitants se situant en " + v1.getNomPays());
		;
		System.out.println("la ville de v2 " + v2.getNomVille() + " ville de " + v2.getNbreHabitants()
				+ " habitants se situant en " + v2.getNomPays());
		;

		/*
		 * Nous allons interchanger les Villes v1 et v2 tout ça par
		 * l'intermédiaire d'un autre objet Ville.
		 */
		Ville temp = new Ville();

		temp = v1;
		v1 = v2;
		v2 = temp;

		System.out.println("la ville de v1 " + v1.getNomVille() + " ville de " + v1.getNbreHabitants()
				+ " habitants se situant en " + v1.getNomPays());
		;
		System.out.println("la ville de v2 " + v2.getNomVille() + " ville de " + v2.getNbreHabitants()
				+ " habitants se situant en " + v2.getNomPays());
		;

		/*
		 * Nous allons maintenant interchanger leurs noms cette fois par le
		 * biais de leurs mutateurs.
		 */

		v1.setNomVille("Madrid");
		v2.setNomVille("Barcelone");

		System.out.println("la ville de v1 " + v1.getNomVille() + " ville de " + v1.getNbreHabitants()
				+ " habitants se situant en " + v1.getNomPays());
		;
		System.out.println("la ville de v2 " + v2.getNomVille() + " ville de " + v2.getNbreHabitants()
				+ " habitants se situant en " + v2.getNomPays());
		;

		System.out.println("affiche" + v1.decrisToi());
		System.out.println(v.decrisToi());

		System.out.println("\n\n" + v1.decrisToi());
		System.out.println(v.decrisToi());
		System.out.println(v2.decrisToi() + "\n\n");
		System.out.println(v1.comparer(v2));

	}

}
