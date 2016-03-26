package arkanoid;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Driver {
	
	public final static String m_TITLE = "Arkanoid"; 
	
	static JFrame frame;
	JLabel x, y, name, status;
	
	/* Screen Dimensions*/
	static int windowWidth = GetScreenWorkingWidth()/4;
	static int windowHeight = GetScreenWorkingHeight()/2;
	
	public static void main(String[] args) {
		/* JFrame Initialization */
		frame = new JFrame();
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setResizable(false);
		frame.setMinimumSize(new Dimension(windowWidth, windowHeight));
		
		/* JFrame Orientation*/
		Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
		frame.setBounds(center.x - windowWidth/2, center.y - windowHeight/2, windowWidth, windowHeight);
		frame.setTitle("Arkanoid");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	    /* Arkanoid Primary Initialization*/
		Arkanoid game = new Arkanoid(frame);
		frame.add(game);
	    
	    MenuBuilder MBuild = new MenuBuilder(frame);
	    
	    /* Finalize Window Setup*/
		frame.pack();
		frame.setVisible(true);
		
		game.start();
		
	}
	
	public static int GetScreenWorkingWidth(){
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().width;
	}//GetScreenWorkingWidth
	
	public static int GetScreenWorkingHeight(){
		return java.awt.GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().height;
	}//GetScreenWorkingHeight
	
	
}
