import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		///ecriture
				try {
					BufferedWriter bw = null;
					bw = new BufferedWriter(new FileWriter("test.txt", true));
					System.out.println("entrer le nombre phrases à enregistrer");
					int nbr = sc.nextInt();
					String saut = sc.nextLine();

					for (int i = 0; i < nbr; i++) {

						System.out.println("Merci d'ecrire du texte: ");
						String texte = (sc.next() + "\n");

						bw.write(texte);
					}
					bw.close();

				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				/// permet de lire le fichier:

				BufferedReader br = null;
				String ligne = null;

				try {
					br = new BufferedReader(new FileReader("test.txt"));
					ligne = br.readLine();

					do {
						System.out.println(ligne);
					} while ((ligne = br.readLine()) != null);

					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		// TODO Auto-generated method stub

	}

