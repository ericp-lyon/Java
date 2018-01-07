import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraphiqueTest extends JFrame {
	
	JLabel titre = new JLabel("Libellé");
	JTextField texte = new JTextField ("Zone de texte");
	JButton bouton = new JButton ("Bouton");
	JPanel conteneur = new JPanel();
	
	public void placementFenetre()  {
	
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setContentPane(conteneur);
		conteneur.add(titre);
		conteneur.add(texte);
		conteneur.add(bouton);
		//this.setLayout(null);
		titre.setPreferredSize(new Dimension(50,50));
		GridLayout gl=new GridLayout(15,1);
		this.setLayout(gl);
	}

	
	
	

}
