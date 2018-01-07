import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FenetreChercherPersonne extends JFrame implements ActionListener {

	JLabel nom1 = new JLabel("Nom :");
	JTextField texteNom1 = new JTextField();
	JButton bouton1 = new JButton("Chercher");

	public void searchPersonne() throws HeadlessException {
	

		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		nom1.setBounds(10, 35, 100, 30);
		texteNom1.setBounds(90, 40, 100, 20);
		bouton1.setBounds(100, 200, 110, 20);
		this.setLayout(null);
		this.add(nom1);
		this.add(texteNom1);
		this.add(bouton1);
		bouton1.addActionListener(this);
		this.setTitle("CHERCHER");

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == bouton1) {
			Personne p;

			
			if ((p=Personne.chercherPersonne(texteNom1.getText())) != null) {

				FenetreEditPersonne personnetrouve=new FenetreEditPersonne();
				personnetrouve.voirEditPersonne(p);

			}
			else {
				JOptionPane jop = new JOptionPane();
				jop.showMessageDialog(null,"Dommage, non trouve");
			}
			

			// TODO Auto-generated method stub

		}

	}
}
