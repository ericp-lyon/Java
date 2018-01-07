package MaDate;

public class MaDate {
	
	private int jour;
	private int mois;
	private int annee;
	public int getJour() {
		return jour;
	}
	public void setJour(int jour) {
		this.jour = jour;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String toString(){
	return (jour + "/" + mois + "/" + annee);
	
	}
	public MaDate(int jour, int mois, int annee) {
		super();
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}
	public void ajouterUnJour(){
		
	if(this.mois==1 || this.mois==3 || this.mois==5 || this.mois==7 || this.mois==8 || this.mois==10){
		
		
		
		
		if (this.jour<31){
						
			 this.setJour(this.getJour()+1);
			}
		else{
			this.setJour(1) ;
			this.setMois(this.getMois()+1);
			}
		
	}
	if(this.mois==2 || this.mois==4 || this.mois==6 || this.mois==9 || this.mois==11){
		
		
		
		
		if (this.jour<30){
						
			 this.setJour(this.getJour()+1);
			}
		else {
			this.setJour(1) ;
			this.setMois(this.getMois()+1);
		}
		
	}
	else if(this.mois==12 && this.jour==31){
		
		this.setJour(1) ;
		this.setMois(1);
		this.setAnnee(this.getAnnee()+1);
	}
	else{
		this.setJour(this.getJour()+1);
	}
	}
}
