import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClientFrame extends JFrame {
	
	MyPanel panel;
	JLabel label;
	
	
	ClientFrame()
	{
		panel=new MyPanel();
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		//this.setSize(1530,830);
		//this.setTitle("IS COSMETICS");
		this.setLocationRelativeTo(null);
		

		
		//this.setLayout(null);
		
	
		//label=new JLabel("PAGINA PENTRU CLIENTI");
		//label.setFont(new Font("Comic Sans MS",Font.BOLD,34));
		//label.setForeground(new Color(255,255,255));
		//label.setBounds(10,10,500,85);
		//this.add(label);
		
		this.setVisible(true);
	}

}
