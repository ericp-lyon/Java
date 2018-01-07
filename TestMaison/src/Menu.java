import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedWriter;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 						///structurer le  déclarer l'objet à l'extérieur du bloc
		 * 
		 * BufferedWriter bis = null; // instancier le nouvel objet et lui
		 * affecter le fichier pour ecrire dans le fichier try {
		 * 
		 * bis = new BufferedWriter(new FileWriter("testmaison.txt", true));
		 * bis.write("test ok"); bis.close();
		 * 
		 * }catch (FileNotFoundException e){ e.printStackTrace(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 * 
		 * 
		 *						// instancier le nouvel objet et lui affecter le fichier pour lire
		 * 
		 * les lignes dans le fichier BufferedReader br=null; String ligne=null;
		 * try{
		 * 
		 * br=new BufferedReader(new FileReader("testmaison.txt"));
		 * ligne=br.readLine(); br.close(); System.out.println(ligne);
		 * 
		 * }catch (FileNotFoundException e){ e.printStackTrace(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */
		
		
									/// exo 2 retrouver la meme valeur numérique dans 2 fichiers différents

		/*
		 * BufferedReader br1=null; BufferedReader br2=null; String ligne1=null;
		 * String ligne2=null;
		 * 
		 * try{ br1=new BufferedReader(new FileReader("file1.txt"));
		 * 
		 * while( (ligne1=br1.readLine()) != null){
		 * 
		 * br2=new BufferedReader(new FileReader("file2.txt"));
		 * 
		 * while ((ligne2=br2.readLine()) != null){
		 * 
		 * if(ligne1.equals(ligne2)) System.out.println("Voici le chiffre : " +
		 * ligne1);
		 * 
		 * }
		 * 
		 * } br1.close(); br2.close();
		 * 
		 * 
		 * }catch (FileNotFoundException e){ e.printStackTrace(); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */

									// exo 3 retrouver le nombre de ligne dans un fichier et les espaces

		/*BufferedReader br = null;
		String ligne = null;
		int nbreMots=0;
		int nbreLignes=0;
		
		
		try {
			
			br=new BufferedReader (new FileReader("testphrase.txt"));
			
			while( (ligne=br.readLine()) != null){
				
				StringTokenizer t=new StringTokenizer(ligne);
				/*while(t.hasMoreTokens()){								///methode1
					nbreMots++;
					t.nextToken();
				}
				
				nbreMots+=t.countTokens();								//méthode2 cette ligne remplace le while précédent
				nbreLignes++;
			}
			
			
			System.out.println("Le nombre de lignes est : "+ nbreLignes);
			System.out.println("Le nombre de mots est : " + nbreMots );
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
*/
	
		Player player1 = new Player("eric", 40.2, 5.2);
		System.out.println("la vie"+ player1.getName());
		
		
		
		
	}




}
