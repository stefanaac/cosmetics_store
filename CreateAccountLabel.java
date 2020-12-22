import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class CreateAccountLabel extends JLabel {
	CreateAccountLabel(){
		ImageIcon image=new ImageIcon("images/pink.jpg");
		Border border=BorderFactory.createLineBorder(Color.WHITE,30);
		this.setText("IS COSMETICS");//seteaza textul etichetei
		this.setIcon(image);//
		this.setVerticalAlignment(JLabel.CENTER);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.TOP);
		this.setForeground(new Color(255,255,255));
		this.setFont(new Font("MV Boly",Font.BOLD,20));
		this.setIconTextGap(20);
		this.setBackground(new Color(255,157,203));
		this.setOpaque(true);
		this.setBorder(border);
		this.setBounds(900,80,495,550);
	}

}
