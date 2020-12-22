import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class CreateAccountFrame extends JFrame {
	JButton back;
	JButton createAccountButton;
	CreateAccountFrame()
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
		CreateAccountLabel label=new CreateAccountLabel();
		this.add(label);
		
		
		JLabel title=new JLabel("Create Account");
		title.setFont(new Font("MV Boly",Font.BOLD,66));
		title.setForeground(new Color(255,255,255));
		title.setBounds(10,10,500,85);
		this.add(title);

		JLabel numeLabel=new JLabel("nume");
		numeLabel.setFont(new Font("MV Boly",Font.BOLD,25));
		numeLabel.setBounds(10,180,100,25);
		numeLabel.setForeground(new Color(255,255,255));
		this.add(numeLabel);
		JTextField numeText=new JTextField(10);
		numeText.setBounds(110,180,200,25);
		this.add(numeText);
		
		JLabel prenumeLabel=new JLabel("prenume");
		prenumeLabel.setFont(new Font("MV Boly",Font.BOLD,20));
		prenumeLabel.setBounds(10,250,100,25);
		prenumeLabel.setForeground(new Color(255,255,255));
		this.add(prenumeLabel);
		JTextField prenumeText=new JTextField(10);
		prenumeText.setBounds(110,250,200,25);
		this.add(prenumeText);
		
		
		JLabel adresaLabel=new JLabel("adresa");
		adresaLabel.setFont(new Font("MV Boly",Font.BOLD,25));
		adresaLabel.setBounds(10,320,100,25);
		adresaLabel.setForeground(new Color(255,255,255));
		this.add(adresaLabel);
		JTextField adresaText=new JTextField(10);
		adresaText.setBounds(110,320,200,25);
		this.add(adresaText);
		
		
		JLabel emailLabel=new JLabel("email");
		emailLabel.setFont(new Font("MV Boly",Font.BOLD,25));
		emailLabel.setBounds(10,390,100,25);
		emailLabel.setForeground(new Color(255,255,255));
		this.add(emailLabel);
		JTextField emailText=new JTextField(10);
		emailText.setBounds(110,390,200,25);
		this.add(emailText);
		
		JLabel userLabel=new JLabel("username");
		userLabel.setFont(new Font("MV Boly",Font.BOLD,20));
		userLabel.setBounds(10,460,100,25);
		userLabel.setForeground(new Color(255,255,255));
		this.add(userLabel);
		JTextField userText=new JTextField(10);
		userText.setBounds(110,460,200,25);
		this.add(userText);
		
		
		
		//password
		JLabel passwordLabel=new JLabel("password");
		passwordLabel.setFont(new Font("MV Boly",Font.BOLD,20));
		passwordLabel.setBounds(10,530,100,25);
		passwordLabel.setForeground(new Color(255,255,255));
		this.add(passwordLabel);
		JPasswordField passwordField=new JPasswordField();
		passwordField.setBounds(110,530,200,25);
		this.add(passwordField);
		
		
		
		//buton creare cont
		createAccountButton=new JButton("Create Account");
		createAccountButton.setBounds(320,650,150,25);
		 createAccountButton.setBackground(Color.WHITE);
		 createAccountButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==createAccountButton)
				{
					//this.dispose();
					LoginFrame frame=new LoginFrame();
					
				}
				
			}
		 });
		this.add(createAccountButton);
		
		
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
				
			}});
		this.add(back);
		
		JLabel promoCheckBoxLabel=new JLabel("I want to receive an email with the best offers.");
		promoCheckBoxLabel.setForeground(Color.WHITE);
		promoCheckBoxLabel.setFont(new Font("MV Boly",Font.BOLD,10));
		promoCheckBoxLabel.setBounds(10,655,300,50);
		this.add(promoCheckBoxLabel);
		JCheckBox  promoCheckBox= new JCheckBox();
		promoCheckBox.setBounds(10,650,20,25);
		promoCheckBox.setBackground(new Color(255,157,203));
		this.add(promoCheckBox);
		
		
		
		
		
		
		this.setVisible(true);
	}

	

}
