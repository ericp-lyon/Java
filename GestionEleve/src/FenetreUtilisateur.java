import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class FenetreUtilisateur extends JFrame implements ActionListener, KeyListener {

	JLabel titreConnex = new JLabel("Connexion");
	JLabel titreFormulaire = new JLabel("Formulaire");
	JLabel nom = new JLabel("Nom :");
	JLabel prenom = new JLabel("Prénom :");
	JLabel mdp = new JLabel("Mot de passe :");
	JTextField textNom = new JTextField();
	JTextField textPrenom = new JTextField();
	JTextField textMdp = new JTextField();
	JButton boutonInsConnect = new JButton("S'inscrire");
	JButton boutonMdp = new JButton("Connexion");
	JButton boutonInsFormu = new JButton("Inscription");
	ButtonGroup group = new ButtonGroup();
	JRadioButton sexeF = new JRadioButton("F");
	JRadioButton sexeM = new JRadioButton("M");
	int i = 0;

	public FenetreUtilisateur() throws HeadlessException {
		super();
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

	public JTextField getTextMdp() {
		return textMdp;
	}

	public void setTextMdp(JTextField textMdp) {
		this.textMdp = textMdp;
	}

	public void afficherFormulaireInscription() {

		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		titreFormulaire.setBounds(60, 10, 200, 20);
		nom.setBounds(10, 40, 100, 30);
		prenom.setBounds(10, 80, 100, 30);
		mdp.setBounds(10, 120, 100, 30);

		textNom.setBounds(100, 40, 100, 30);
		textPrenom.setBounds(100, 80, 100, 30);
		textMdp.setBounds(100, 120, 100, 30);
		boutonInsFormu.setBounds(70, 200, 100, 30);

		this.setLayout(null);
		this.add(titreFormulaire);
		this.add(nom);
		this.add(prenom);
		this.add(mdp);
		this.add(textMdp);
		this.add(textNom);
		this.add(textPrenom);
		this.add(boutonInsFormu);

		group.add(sexeF);
		group.add(sexeM);
		group.isSelected(null);
		this.add(sexeF);
		this.add(sexeM);

		boutonInsFormu.addActionListener(this);
		textMdp.addKeyListener(this);
		textNom.addKeyListener(this);
		textPrenom.addKeyListener(this);
		boutonInsFormu.setEnabled(false);

		this.setTitle("Formulaire");

	}

	public void afficherConsoleConnexion() {

		this.setVisible(true);
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.setLayout(null);

		titreConnex.setBounds(60, 10, 200, 20);
		nom.setBounds(10, 40, 100, 30);
		mdp.setBounds(10, 120, 100, 30);

		textNom.setBounds(100, 40, 100, 30);
		textMdp.setBounds(100, 120, 100, 30);

		boutonInsConnect.setBounds(50, 200, 100, 30);
		boutonMdp.setBounds(160, 200, 100, 30);

		this.setLayout(null);
		this.add(titreConnex);
		this.add(nom);
		this.add(mdp);
		this.add(textMdp);
		this.add(textNom);
		this.add(boutonInsConnect);
		this.add(boutonMdp);

		// group.add(sexeF);
		// group.add(sexeM);
		// group.isSelected(null);
		// this.add(sexeF);
		// this.add(sexeM);

		boutonInsConnect.addActionListener(this);
		boutonMdp.addActionListener(this);

		this.setTitle("Connexion");

	}

	@Override
	public void actionPerformed(ActionEvent a) {
		// TODO Auto-generated method stub

		if (a.getSource() == boutonInsConnect) {

			dispose();
			FenetreUtilisateur fenetreFormulaire = new FenetreUtilisateur();
			fenetreFormulaire.afficherFormulaireInscription();

		}
		if (a.getSource() == boutonInsFormu) {

			FenetreUtilisateur fenetreVierge = new FenetreUtilisateur();
			dispose();
			Utilisateur nouvelUtilisateur = new Utilisateur(textNom.getText(), textPrenom.getText(), textMdp.getText());
			nouvelUtilisateur.InscriptionUtilisateur();
			dispose();
			afficherConsoleConnexion();
			dispose();
			fenetreVierge.afficherConsoleConnexion();

		}

		if (a.getSource() == boutonMdp) {

			Boolean verification = Utilisateur.ConnexionUtilisateur(this.textNom.getText(), this.textMdp.getText());
			if (verification == true) {
				FenetreEleve fenetreEleve = new FenetreEleve();
				dispose();
				fenetreEleve.affiherFenetreGestionEleve();

			}

			if (verification == false && i < 3) {
				i++;
				if (i == 1)
					JOptionPane.showMessageDialog(null, "il vous reste 2 essais");

				if(i==2)
					JOptionPane.showMessageDialog(null, "il vous reste 1 essai");

				if (i == 3){
					JOptionPane.showMessageDialog(null, "C'est la troisième erreur.A bientôt !!!");
				dispose();
				}
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent a) {

		if (textNom.getText().isEmpty() || textMdp.getText().isEmpty() || textPrenom.getText().isEmpty()) {
			boutonInsFormu.setEnabled(false);
		} else {
			boutonInsFormu.setEnabled(true);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent a) {

		if (textNom.getText().isEmpty() || textMdp.getText().isEmpty() || textPrenom.getText().isEmpty()) {
			boutonInsFormu.setEnabled(false);
		} else {
			boutonInsFormu.setEnabled(true);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent a) {

		if (textNom.getText().isEmpty() || textMdp.getText().isEmpty() || textPrenom.getText().isEmpty()) {

			boutonInsFormu.setEnabled(false);
		} else {
			boutonInsFormu.setEnabled(true);
		}
		// TODO Auto-generated method stub

	}

}
