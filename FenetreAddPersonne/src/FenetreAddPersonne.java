import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FenetreAddPersonne extends JFrame implements ActionListener {
	
	JLabel nom = new JLabel("Nom :");
	JLabel prenom = new JLabel("Prénom :");
	JLabel sexe = new JLabel("sexe :");
	JTextField texteNom = new JTextField();
	JTextField textePrenom = new JTextField();
	JTextField texteSexe = new JTextField();
	JButton bouton = new JButton("Enregistrer");
	JComboBox<String> combo = new JComboBox<String>();
	
	
	public void ajouterPersonne() throws HeadlessException {
		
		
		
		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		nom.setBounds(10, 35, 100, 30);
		prenom.setBounds(10, 75, 100, 30);
		sexe.setBounds(10, 115, 100, 30);
		texteNom.setBounds(90, 40, 100, 20);
		textePrenom.setBounds(90, 80, 100, 20);
		//texteSexe.setBounds(90, 120, 50, 20);
		bouton.setBounds(100, 200, 110, 20);
		combo.setBounds(100,120 ,70, 20);
		this.setLayout(null);
		this.add(nom);
		this.add(prenom);
		this.add(sexe);
		this.add(texteNom);
		this.add(textePrenom);
		//this.add(texteSexe);
		this.add(bouton);
		this.add(combo);
		bouton.addActionListener(this);
		combo.addActionListener(this);
		combo.addItem("M");
		combo.addItem("F");
		combo.setSelectedItem(this);
		this.setTitle("Formulaire");
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JOptionPane jop = new JOptionPane();
				
		
		if(e.getSource() == bouton){
			
			Personne perso = new Personne(this.texteNom.getText(), this.textePrenom.getText(), this.combo.getSelectedItem().toString());
			perso.enregistrerPerso();
			
		}
		
		
		
	}

	
	
	
	
	
	

}
