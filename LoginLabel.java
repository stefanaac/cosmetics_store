import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class LoginLabel extends JLabel {
	
	LoginLabel(){
		ImageIcon image=new ImageIcon("images/pink.jpg");
		//Border border=BorderFactory.createLineBorder(Color.WHITE,0);
		this.setText("IS COSMETICS");//seteaza textul etichetei
		this.setIcon(image);//
		this.setVerticalAlignment(JLabel.CENTER);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setForeground(new Color(255,255,255));
		this.setFont(new Font("MV Boly",Font.BOLD,20));
		this.setIconTextGap(0);
		this.setBackground(new Color(255,157,203));
		this.setOpaque(true);
		//this.setBorder(border);
		this.setBounds(600,30,295,350);
	}
}
