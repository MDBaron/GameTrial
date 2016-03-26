package arkanoid;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBuilder {
	
	private JFrame primaryFrame;
	static JMenuBar arkanoidMenuBar;
	static JMenu arkanoidMenu, helpMenu, aboutMenu;
	static JMenuItem menuArkOne, menuArkTwo, menuArkThree, menuArkFour;
	static JMenuItem menuHelpOne, menuHelpTwo, menuAboutOne, menuAboutTwo;
	
	
	public MenuBuilder(JFrame frame){
		/* Menu Setup */
		primaryFrame = frame;
	    arkanoidMenuBar = new JMenuBar();
	    arkanoidMenu = new JMenu("Arkanoid Menu");
	    helpMenu = new JMenu("Help");
	    aboutMenu = new JMenu("About");
	    menuArkOne = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
	    menuArkTwo = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
	    menuArkThree = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
	    menuArkFour = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
	    menuHelpOne = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
	    menuHelpTwo = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
	    menuAboutOne = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
	    menuAboutTwo = new JMenuItem("A text-only menu item", KeyEvent.VK_T);
	    this.populateMenus();
	}

    private void populateMenus(){
    	/* Arkanoid Menu */
    
		arkanoidMenu.setMnemonic(KeyEvent.VK_A);
		arkanoidMenu.getAccessibleContext().setAccessibleDescription(
            "The only menu in this program that has menu items");
		arkanoidMenuBar.add(arkanoidMenu);
		
		primaryFrame.setJMenuBar(arkanoidMenuBar);
    
		/* Help Menu */
		helpMenu.setMnemonic(KeyEvent.VK_A);
		helpMenu.getAccessibleContext().setAccessibleDescription(
            "The only menu in this program that has menu items");
		arkanoidMenuBar.add(helpMenu);
    
		/* About Menu*/
		aboutMenu.setMnemonic(KeyEvent.VK_A);
		aboutMenu.getAccessibleContext().setAccessibleDescription(
            "The only menu in this program that has menu items");
		arkanoidMenuBar.add(aboutMenu);
    
		/* Ark Menu Item One */
		menuArkOne.setAccelerator(KeyStroke.getKeyStroke(
    		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuArkOne.getAccessibleContext().setAccessibleDescription(
    		"This doesn't really do anything");
		arkanoidMenu.add(menuArkOne);
    
		/* Ark Menu Item Two */
		menuArkTwo.setAccelerator(KeyStroke.getKeyStroke(
    		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuArkTwo.getAccessibleContext().setAccessibleDescription(
    		"This doesn't really do anything");
		arkanoidMenu.add(menuArkTwo);
    
		/* Ark Menu Item Three */
		menuArkThree.setAccelerator(KeyStroke.getKeyStroke(
    		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuArkThree.getAccessibleContext().setAccessibleDescription(
    		"This doesn't really do anything");
		arkanoidMenu.add(menuArkThree);
    
		/* Ark Menu Item Four */
		menuArkFour.setAccelerator(KeyStroke.getKeyStroke(
    		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuArkFour.getAccessibleContext().setAccessibleDescription(
    		"This doesn't really do anything");
		arkanoidMenu.add(menuArkFour);
    
		/* Help Menu Item One */
		menuHelpOne.setAccelerator(KeyStroke.getKeyStroke(
    		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuHelpOne.getAccessibleContext().setAccessibleDescription(
    		"This doesn't really do anything");
		helpMenu.add(menuHelpOne);
    
		/* Help Menu Item Two */
		menuHelpTwo.setAccelerator(KeyStroke.getKeyStroke(
    		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuHelpTwo.getAccessibleContext().setAccessibleDescription(
    		"This doesn't really do anything");
		helpMenu.add(menuHelpTwo);
    
    
		/* About Menu Item One */
		menuAboutOne.setAccelerator(KeyStroke.getKeyStroke(
    		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuAboutOne.getAccessibleContext().setAccessibleDescription(
    		"This doesn't really do anything");
		aboutMenu.add(menuAboutOne);
    
		/* About Menu Item Two */
		menuAboutTwo.setAccelerator(KeyStroke.getKeyStroke(
    		KeyEvent.VK_1, ActionEvent.ALT_MASK));
		menuAboutTwo.getAccessibleContext().setAccessibleDescription(
    		"This doesn't really do anything");
		aboutMenu.add(menuAboutTwo);
		
    }//populateMenus
}
