package Cours2;


public class Cours2 {

	//attributs
	private int note1;
	private int note2;
	
	
	//méthodes
	public int calculMoyenne(){
		return(this.note1 + this.note2)/2;
		
		
	}
	
	public void afficheNotes(){
		
		System.out.println(note1);
		System.out.println(note2);
	}
	
	public int getNote1() {
		return note1;
	}
	
	public void setNote1(int note1) {
		this.note1 = note1;
	}
	public int getNote2() {
		return note2;
	}
	
	public void setNote2(int note2) {
		this.note2 = note2;
	}
	
	
	
	//nouveau constructeur créé qui écrase le premier : le constructeur n'attend pas de retour
	public Cours2(int n1,int n2){
		
		this.note1=n1;
		this.note2=n2;
	}
	
	//methode tostrin permet d'afficher le contenu d'un objet, pas possible depuis le s.o.p(c)
	public String toString(){
		return " note1: "+note1+" note2: "+note2;
		
	
}
}

