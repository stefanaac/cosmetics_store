import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyPanel extends JPanel implements ActionListener{

	
	final int PANEL_WIDTH=500;
	final int PANEL_HEIGHT=500;
	
	Image lipstick;
	Image palette;
	Image brush;
	Image heart;
	Timer timer;
	int xVelocity=2;
	int yVelocity=1;
	int x=0;
	int y=0;
	int x1Velocity=1;
	int y1Velocity=1;
	int x1=100;
	int y1=0;
	int x2Velocity=1;
	int y2Velocity=1;
	int x2=200;
	int y2=0;
	
	int x3Velocity=1;
	int y3Velocity=1;
	int x3=300;
	int y3=0;

	MyPanel()
	{
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.WHITE);
		lipstick=new ImageIcon("images/lip.png").getImage();
		palette=new ImageIcon("images/blush.png").getImage();
		brush=new ImageIcon("images/brush.png").getImage();
		heart=new ImageIcon("images/heart.png").getImage();
		timer=new Timer(15, this);
		timer.start();
		
		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		Graphics2D g2d=(Graphics2D) g;
		g2d.drawImage(lipstick,x,y,null);
		g2d.drawImage(palette,x1,y1,null);
		g2d.drawImage(brush,x2,y2,null);
		g2d.drawImage(heart,x3,y3,null);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		x=x+xVelocity;
		if(x>= PANEL_WIDTH-lipstick.getWidth(null) || x<0)
		{
			xVelocity=xVelocity*-1;
		}
		
		
		y=y+yVelocity;
		if(y>= PANEL_HEIGHT-lipstick.getHeight(null) || y<0)
		{
			yVelocity=yVelocity*-1;
		}
		
		
		
		x1=x1-x1Velocity;
		if(x1>= PANEL_WIDTH-palette.getWidth(null) || x1<0)
		{
			x1Velocity=x1Velocity*-1;
		}
		
		
		
		y1=y1+y1Velocity;
		if(y1>= PANEL_HEIGHT-palette.getHeight(null) || x<0)
		{
			y1Velocity=y1Velocity*-1;
		}
		
		
		x2=x2+x2Velocity;
		if(x2>= PANEL_WIDTH-brush.getWidth(null) || x2<0)
		{
			x2Velocity=x2Velocity*-1;
		}
		
		
		
		y2=y2+y2Velocity;
		if(y2>= PANEL_HEIGHT-brush.getHeight(null) || y2<0)
		{
			y2Velocity=y2Velocity*-1;
		}
		
		
		
		x3=x3+x3Velocity;
		if(x3>= PANEL_WIDTH-heart.getWidth(null) || x3<0)
		{
			x3Velocity=x3Velocity*-1;
		}
		
		
		
		y3=y3+y3Velocity;
		if(y3>= PANEL_HEIGHT-heart.getHeight(null) || y3<0)
		{
			y3Velocity=y3Velocity*-1;
		}
		
		
		
		
		
		repaint();
		
	}

}
