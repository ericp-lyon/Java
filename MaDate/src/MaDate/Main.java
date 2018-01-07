package MaDate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		MaDate d=new MaDate(31,12,2018);
		
		System.out.println(d.toString());
		
		d.ajouterUnJour();
		System.out.println(d.toString());
	}

}
