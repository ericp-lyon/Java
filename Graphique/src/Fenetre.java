import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Fenetre extends JFrame implements ActionListener {

	JLabel label = new JLabel("message");
	JTextField text = new JTextField();
	JButton bouton = new JButton("afficher");

	public Fenetre() throws HeadlessException {
		super();

		this.setVisible(true);
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		label.setBounds(20, 20, 100, 20);
		text.setBounds(150, 20, 100, 20);
		bouton.setBounds(150, 60, 100, 20);
		this.setLayout(null); 							// tjs le mettre sur null
		this.add(label);
		this.add(text);
		this.add(bouton);
		bouton.addActionListener(this);					//action espioon tojours en lien avec le 'actionPerformed'

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JOptionPane jop = new JOptionPane();
		jop.showMessageDialog(null, text.getText());

	}

}
