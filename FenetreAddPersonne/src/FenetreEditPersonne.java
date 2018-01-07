import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class FenetreEditPersonne extends JFrame implements ActionListener{
	
	
	
	
	JLabel nom2 = new JLabel("Nom :");
	JLabel prenom2 = new JLabel("Prénom :");
	JLabel sexe2 = new JLabel("sexe :");
	JTextField texteNom2 = new JTextField();
	JTextField textePrenom2 = new JTextField();

	JButton bouton2 = new JButton("Modifier");
	JButton bouton3 = new JButton("Supprimer");
	JComboBox<Object> combo2 = new JComboBox<Object>();
	
	
	public void voirEditPersonne (Personne p) throws HeadlessException {
		
		
		
		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		nom2.setBounds(10, 35, 100, 30);
		prenom2.setBounds(10, 75, 100, 30);
		sexe2.setBounds(10, 115, 100, 30);
		texteNom2.setBounds(90, 40, 100, 20);
		textePrenom2.setBounds(90, 80, 100, 20);
		bouton2.setBounds(20, 200, 110, 20);
		bouton3.setBounds(140, 200, 110, 20);
		combo2.setBounds(100,120 ,70, 20);
		this.setLayout(null);
		this.add(nom2);
		this.add(prenom2);
		this.add(sexe2);
		this.add(texteNom2);
		this.add(textePrenom2);
		this.add(bouton2);
		this.add(bouton3);
		this.add(combo2);
		texteNom2.setText(p.getNom());
		textePrenom2.setText(p.getPrenom());
		combo2.setSelectedItem(p
				);
		bouton2.addActionListener(this);
		bouton3.addActionListener(this);
		combo2.addActionListener(this);
		combo2.addItem("M");
		combo2.addItem("F");
		combo2.setSelectedItem(this);
		this.setTitle("EDITION");
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JOptionPane jop = new JOptionPane();
				
		
		if(e.getSource() == bouton2){
			
			//Personne perso = new Personne(this.texteNom.getText(), this.textePrenom.getText(), this.combo.getSelectedItem().toString());
			//perso.enregistrerPerso();
			
		}
		
		
		
	}

	
	
	

}
