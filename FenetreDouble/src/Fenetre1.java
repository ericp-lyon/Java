import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Fenetre1 extends JFrame implements ActionListener {
	
	JButton bouton = new JButton("OK");
	JTextField texte = new JTextField();

	public Fenetre1() throws HeadlessException {
		
		super();

		this.setVisible(true);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		bouton.setBounds(50, 50, 70, 70);
		texte.setBounds(50, 150, 150, 30);
		this.setLayout(null);
		this.add(bouton);
		this.add(texte);
		bouton.addActionListener(this);
		this.setTitle("Fenetre1");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		Fenetre2 f2 =new Fenetre2();
		
	}	
	
	
	

}
