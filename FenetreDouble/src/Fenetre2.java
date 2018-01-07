import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JFrame;
import javax.swing.JTextField;

public class Fenetre2 extends JFrame implements ActionListener {
	
	JTextField texte = new JTextField();

	public Fenetre2() throws HeadlessException {

		super();
		
		this.setVisible(true);
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		texte.setBounds(50, 150, 150, 30);
		this.setLayout(null);
		this.setTitle("Fenetre2");
		this.add(texte);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
