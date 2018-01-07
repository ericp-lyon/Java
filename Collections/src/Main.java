
import java.util.ArrayList;

public class Main {


	


		
		
		public static void main (String[] args) {
			
			ArrayList liste=new ArrayList();
			
			liste.add(5);
			liste.add(45);
			liste.add("comment ça va");
			liste.add("bien,merci");
			liste.add(75);
			
			for (int i=1; i<liste.size() ;i=+2 ){
				
				System.out.println("element d’indice " + i + " = " + liste.get(i));
						}
						
							
				
			}
			
			
		}


