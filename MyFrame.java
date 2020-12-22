import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.Border;
import javax.swing.*;

public class MyFrame extends JFrame  {
	
	JButton createAccountButton;
	JButton loginButton;
	
	MyFrame ()
	{
	
		this.setSize(1530,830);
		this.setTitle("IS COSMETICS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(null);
		
		//adaug logo-ul in bara de sus
		ImageIcon image=new ImageIcon("images/pink.jpg");
		this.setIconImage(image.getImage());
		//setez backgoundul frame-ului
		this.getContentPane().setBackground(new Color(255,157,203));
		//creez un label cu logo si numele magazinului
		MyLabel labelName=new MyLabel();
		this.add(labelName);
		
	
		loginButton=new JButton("Login");
		loginButton.setBounds(600,490,80,25);
		loginButton.setBackground(Color.WHITE);
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if( e.getSource()==loginButton)
				{
					//this.dispose();
					LoginFrame loginFrame=new LoginFrame();
					
					
				}
			}});
		this.add(loginButton);
		
		//create account
		createAccountButton=new JButton("Create Account");
		createAccountButton.setBounds(750,490,140,25);
		createAccountButton.setBackground(Color.WHITE);
		createAccountButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if( e.getSource()==createAccountButton)
				{
					//this.dispose();
					CreateAccountFrame createAccountFrame=new CreateAccountFrame();
					
					
				}
			}
			
		});
		this.add(createAccountButton);
		
		
		this.setVisible(true);
	}


	
		
	

}
