import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthSeparatorUI;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class FenetreEleve extends JFrame implements ActionListener  {
	
	JLabel titreAjout=new JLabel("Ajouter Eleve");
	JLabel numero=new JLabel("Numero :");
	JLabel nom=new JLabel("Nom :");
	JLabel prenom=new JLabel("Prénom :");
	JTextField textNumero=new JTextField();
	JTextField textNom=new JTextField();
	JTextField textPrenom=new JTextField();
	JButton boutonChercherGestion=new JButton("chercher");
	JButton boutonChercherEleve=new JButton("Chercher");
	JButton boutonAjouterGestion=new JButton("Ajouter");
	JButton boutonAjouterEleve=new JButton("Ajouter");
	JButton boutonModifier=new JButton("Modifier");
	JButton boutonSupprimer=new JButton("Supprimer");
	JButton boutonEffacer=new JButton("Effacer");
	JButton boutonQuitter=new JButton("Quitter");
	ButtonGroup group=new ButtonGroup();
	JRadioButton sexeF=new JRadioButton("F");
	JRadioButton sexeM=new JRadioButton("M");
	
	public FenetreEleve()  {
		super();
	}

	public JTextField getTextNumero() {
		return textNumero;
	}

	public void setTextNumero(JTextField textNumero) {
		this.textNumero = textNumero;
	}

	public JTextField getTextNom() {
		return textNom;
	}

	public void setTextNom(JTextField textNom) {
		this.textNom = textNom;
	}

	public JTextField getTextPrenom() {
		return textPrenom;
	}

	public void setTextPrenom(JTextField textPrenom) {
		this.textPrenom = textPrenom;
	}
	
	public void affiherFenetreGestionEleve(){
		
		this.setVisible(true);;
		this.setSize(250, 100);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		boutonAjouterGestion.setBounds(10, 10, 90, 30);
		boutonChercherGestion.setBounds(130, 10, 90, 30);
		
		this.add(boutonAjouterGestion);
		this.add(boutonChercherGestion);
		
		boutonAjouterGestion.addActionListener(this);
		boutonChercherGestion.addActionListener(this);
		
			
	}

public void affiherChercherEleve(){
		
		this.setVisible(true);;
		this.setSize(350, 150);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		numero.setBounds(10, 10, 60, 30);
		textNumero.setBounds(80, 10, 90, 30);
		boutonChercherEleve.setBounds(30, 50, 90, 30);
		
		this.add(numero);
		this.add(textNumero);
		this.add(boutonChercherEleve);
		
		
		boutonChercherEleve.addActionListener(this);
		
			
	}

public void affiherEditionEleve(){
	
	this.setVisible(true);;
	this.setSize(350, 150);
	this.setLocationRelativeTo(null);
	this.setLayout(null);
	
	
	boutonModifier.setBounds(30, 50, 90, 30);
	boutonSupprimer.setBounds(200, 50, 120, 30);
	
	this.add(boutonModifier);
	this.add(boutonSupprimer);
	
	
	boutonModifier.addActionListener(this);
	boutonSupprimer.addActionListener(this);
	
		
}


public void afficherAjouterEleve(){
	
	this.setVisible(true);
	this.setSize(300, 450);
	this.setLocationRelativeTo(null);
	this.setLayout(null);

	titreAjout.setBounds(60, 10, 200, 20);
	numero.setBounds(10, 40, 100, 30);
	nom.setBounds(10, 70, 100, 30);
	prenom.setBounds(10, 100, 100, 30);

	textNumero.setBounds(100, 40, 100, 30);
	textNom.setBounds(100, 70, 100, 30);
	textPrenom.setBounds(100,100,100,30);
	
	boutonAjouterEleve.setBounds(50, 250, 100, 30);
	boutonEffacer.setBounds(160, 250, 100, 30);
	boutonQuitter.setBounds(100,300,100,30);
	sexeM.setBounds(140, 150,80 , 80);
	sexeF.setBounds(50, 150,80 , 80);
	this.setLayout(null);
	this.add(titreAjout);
	this.add(nom);
	this.add(numero);
	this.add(prenom);
	
	this.add(textNumero);
	this.add(textNom);
	this.add(textPrenom);
	
	this.add(boutonAjouterEleve);
	this.add(boutonEffacer);
	this.add(boutonQuitter);

	 group.add(sexeF);
	 group.add(sexeM);
	 this.add(sexeF);
	 this.add(sexeM);
	 sexeF.setSelected(true);

	boutonAjouterEleve.addActionListener(this);
	boutonQuitter.addActionListener(this);
	boutonEffacer.addActionListener(this);


	this.setTitle("AJOUT ELEVE");
	
	

}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String sexeSelect=null;
		FenetreEleve fenetreGestion=new FenetreEleve();
		FenetreEleve fenetreChercher = new FenetreEleve();
		FenetreEleve fenetreEdition = new FenetreEleve();		
		
		if (e.getSource() == boutonAjouterGestion) {

			fenetreGestion=new FenetreEleve();
			fenetreGestion.afficherAjouterEleve();
			dispose();
		}
		
		if(e.getSource() == boutonAjouterEleve){
			
			if (this.sexeF.isSelected() == true) {
				sexeSelect = "F";
			}
			if (this.sexeM.isSelected() == true) {
				sexeSelect = "M";
			}

			if (Eleve.chercherEleve(this.textNumero.getText()) == true) {
				Eleve.enregitrerEleve(this.textNumero.getText(),this.textNom.getText(), this.textPrenom.getText(),sexeSelect);
				JOptionPane.showMessageDialog(null, "Ajout Ok !");
				///permet d 'effacer les champs de saisie
				this.textNumero.setText("");
				this.textNom.setText("");
				this.textPrenom.setText("");
				this.sexeF.setSelected(true);
			} else {
				JOptionPane.showMessageDialog(null, "l'élève existe déja");
				this.textNumero.setText("");
				this.textNom.setText("");
				this.textPrenom.setText("");
				this.sexeF.setSelected(true);
			}
		}
			
		if (e.getSource() == boutonEffacer){
		this.textNumero.setText("");
		this.textNom.setText("");
		this.textPrenom.setText("");
		this.sexeF.setSelected(true);
		
			
		}
		
		if (e.getSource() == boutonQuitter) {
			System.exit(0);
		}
		
		
		
		if (e.getSource() == boutonChercherGestion) {
			fenetreChercher.affiherChercherEleve();
		}
		
		if (e.getSource() == boutonChercherEleve) {
			if (Eleve.chercherEleve(this.textNumero.getText()) == true) {

				fenetreEdition.affiherEditionEleve();
				dispose();

			}
		}
		
		if (e.getSource() == boutonSupprimer) {
			Eleve.EffacerEleve(this.textNumero.getText());
		}
		
		if (e.getSource() == boutonModifier) {

			if (this.sexeF.isSelected() == true) {
				sexeSelect = "F";
			}
			if (this.sexeM.isSelected() == true) {
				sexeSelect = "M";
			}

			Eleve modifierNom = new Eleve(this.textNumero.getText(), this.textNom.getText(),
					this.textPrenom.getText(), sexeSelect);
			Eleve.ModifierEleve(this.textNumero.getText(), this.textNom.getText(),this.textPrenom.getText(),sexeSelect);

		}
		
		
	}
	
	
	
	
}	
	

