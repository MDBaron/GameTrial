package arkanoid;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Arkanoid extends JComponent implements Runnable {
	
	public static final long serialVersionUID = 1L;
	boolean GameOn = false;
	static boolean change = true;
	private Thread thread;
	
	//Get localized screen dimensions
	int scrWidth = Driver.GetScreenWorkingWidth();
	int scrHeight = Driver.GetScreenWorkingHeight();
	
	//Buffered Image Init
    BufferedImage image = new BufferedImage(scrWidth,scrHeight,BufferedImage.TYPE_INT_RGB);
	private BufferedImage spriteSheet1 = null;
	
	//Temp
	private BufferedImage block1, block2, block3, block4, block5;
	private BufferedImage player;
	private BufferedImage ball;
    
	Block[][] blocks;
	Player paddle;
	int blockFactor = 10;
	
	/*
	int paddleX, paddleY = 0;
	int paddleW, paddleH = 0;
	int ballX, ballY = 0;
	int xVector, yVector = 0;
	*/
	
	public Arkanoid(JFrame frame){
		
		/*
		//Set paddle size dynamically
		paddleW = (int)(scrWidth * 0.06);
		paddleH = (int)(scrHeight * 0.01);
		*/
		
		//Set block grid dynamically
		blocks = new Block[scrWidth/blockFactor][scrHeight/blockFactor];
		
		
		
		
	}//Constructor
	
	public void paintBoard(){
		
	}//paintBoard
	
	public static void boundsCheck(){
		
	}//boundsCheck
	
	private void tick(){
		
	}//tick
	
	private void cleanUp(){
		
	
	}//cleanUp
	
	public synchronized void start(){
		if(GameOn){
			return;
		}
		GameOn = true;
		thread = new Thread(this);
		thread.start();
	}//start
	
	private void stop(){
		if(!GameOn){
			return;
		}//
		
		try {
			GameOn = false;
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(1);
	}//stop
	
	public void init(){
		BufferedImageLoader loader = new BufferedImageLoader();
		try {
			
			spriteSheet1 = loader.loadImage("res/Arkanoid2_Sprite_Sheet.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		SpriteSheet ss1 = new SpriteSheet(spriteSheet1);
		
		player = ss1.grabImage(7,5,32,8);
		block1 = ss1.grabImage(1,9,16,8);
		block2 = ss1.grabImage(2,9,16,8);
		block3 = ss1.grabImage(3,9,16,8);
		block4 = ss1.grabImage(4,9,16,8);
		block5 = ss1.grabImage(1,10,16,8);
		ball = ss1.grabImage(1,1,16,8);
	}
	
	public void run(){
		init();
		long initTime = System.nanoTime();
		final double sizeTicks = 60.0;
		double ns = 1000000000 / sizeTicks;
		double delta = 0;
		int updates = 0;
		int frames = 0;
		long timer = System.currentTimeMillis();
		
		while(GameOn){
			//System.out.println("IT'S WORKING");
			long current = System.nanoTime();
			delta += (current - initTime) / ns;
			initTime = current;
			if(delta >= 1){
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				System.out.println(updates + " Ticks, Fps " + frames);
				updates = 0;
				frames = 0;
			}
			//boundsCheck();
			//cleanUp();
		}//game while
		stop();
	}//gameLoop

	
	private void render() {

		Graphics g = this.getGraphics();//Graphics context/Draw for Buffers
		//Begin Draw phase

		//if(change){
			g.drawImage(player, (getWidth() / 2) - 16,  getHeight() - 50, this);
			for(int i = 0; i < (scrWidth/32); i++){
				
							g.drawImage(block1, i * 16, 1 * 8, this);
							g.drawImage(block2, i * 16, 2 * 8, this);
							g.drawImage(block3, i * 16, 3 * 8, this);
							g.drawImage(block4, i * 16, 4 * 8, this);
							g.drawImage(block5, i * 16, 5 * 8, this);
					
				change = false;
			//}//if changed
		}
		
		//Cleanup
		g.dispose();
		
	}
}


