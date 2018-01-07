import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener {

	private JTextField textNom = new JTextField();
	private JTextField textPrenom = new JTextField();

	private JButton bouton1 = new JButton("Enregistrer");

	private JLabel labelNom = new JLabel("Nom");
	private JLabel labelPrenom = new JLabel("Prenom");

	private JLabel labelTextOk = new JLabel("Enregistré");

	public void Afficher() {

		/* Les positions */

		// textSexe.setPreferredSize(new Dimension(100, 20));
		bouton1.setBounds(50, 150, 100, 50);
		textNom.setBounds(100, 20, 100, 20);
		textPrenom.setBounds(100, 80, 100, 20);
		labelNom.setBounds(20, 20, 100, 20);
		labelPrenom.setBounds(20, 80, 100, 20);
		labelTextOk.setBounds(200, 250, 100, 50);

		this.setLayout(null);

		this.add(bouton1);
		this.add(textNom);
		this.add(textPrenom);
		this.add(labelNom);
		this.add(labelPrenom);

		bouton1.addActionListener(this); // espion sur le bouton
		bouton1.setEnabled(true);

		this.setVisible(true); // pour afficher la fenetre
		this.setSize(300, 300); // pour la taille de la fenetre
		this.setLocationRelativeTo(null); // pour centrer
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == bouton1) {

			GestionBdd enregistre = new GestionBdd();
			enregistre.Enregistrement(this.textNom.getText(), this.textPrenom.getText());
			this.textNom.setText("");
			this.textPrenom.setText("");
		}
	}

}