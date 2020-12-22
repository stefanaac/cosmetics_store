import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame {

	JButton back;
	JComboBox box;
	JButton loginButton;
	LoginFrame()
	{
		//setari pentru Frame
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
		
		
		//adaug labelul cu Logo
		LoginLabel label=new LoginLabel();
		this.add(label);
		
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(255,157,203));//new Color(255,157,203));
		panel.setBounds(550,390,800,295);
		
		//buton back
		back=new JButton("Back");
		back.setBackground(Color.WHITE);
		back.setBounds(1350,730,150,25);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==back)
				{
					//this.dispose();
					MyFrame myFrame=new MyFrame();
					
				}
				
			}
			
		});
		this.add(back);
		
		
		JLabel userLabel=new JLabel("username");
		userLabel.setFont(new Font("MV Boly",Font.BOLD,16));
		userLabel.setBounds(100,10,80,25);
		userLabel.setForeground(new Color(255,255,255));
		panel.add(userLabel);
		JTextField userText=new JTextField(10);
		userText.setBounds(180,10,165,25);
		panel.add(userText);
		
		
		
		//password
		JLabel passwordLabel=new JLabel("password");
		passwordLabel.setFont(new Font("MV Boly",Font.BOLD,16));
		passwordLabel.setBounds(100,70,80,25);
		passwordLabel.setForeground(new Color(255,255,255));
		panel.add(passwordLabel);
		JPasswordField passwordField=new JPasswordField();
		passwordField.setBounds(180,70,165,25);
		panel.add(passwordField);
		
		
		/*
		JLabel userCheckBoxLabel=new JLabel("client");
		userCheckBoxLabel.setForeground(Color.WHITE);
		userCheckBoxLabel.setBounds(100,130,80,25);
		panel.add(userCheckBoxLabel);
		JCheckBox  userCheckBox= new JCheckBox();
		userCheckBox.setBounds(150,130,20,25);
		userCheckBox.setBackground(new Color(255,157,203));
		panel.add(userCheckBox);
		
		
		JLabel adminCheckBoxLabel=new JLabel("administrator");
		adminCheckBoxLabel.setForeground(Color.WHITE);
		adminCheckBoxLabel.setBounds(200,130,80,25);
		panel.add(adminCheckBoxLabel);
		JCheckBox  adminCheckBox= new JCheckBox();
		adminCheckBox.setBounds(280,130,20,25);
		adminCheckBox.setBackground(new Color(255,157,203));
		panel.add(adminCheckBox);
		*/
		
		String[] useri= {"admin","client"};
		box=new JComboBox(useri);
		box.setBounds(160,130,100,25);
		box.setBackground(Color.WHITE);
		box.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==loginButton && box.getSelectedIndex()==0)
				{
					//this.dispose();
					AdminFrame adminFrame=new AdminFrame();
				}
				else
				{
					if(e.getSource()==loginButton && box.getSelectedIndex()==1)
					{
						//this.dispose();
						ClientFrame clientFrame=new ClientFrame();
					}
				}
				
			}
			
		});
		panel.add(box);
		
		
		
		loginButton=new JButton("Login");
		loginButton.setBounds(180,190,80,25);
		loginButton.setBackground(Color.WHITE);
		loginButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==loginButton && box.getSelectedIndex()==0)
				{
					//this.dispose();
					AdminFrame adminFrame=new AdminFrame();
				}
				else
				{
					if(e.getSource()==loginButton && box.getSelectedIndex()==1)
					{
						//this.dispose();
						ClientFrame clientFrame=new ClientFrame();
					}
				}
				
				
			}
			
		});
		panel.add(loginButton);
		
		
		
		this.add(panel);
		this.setVisible(true);
		
	}

	
}
