package arkanoid;

import java.awt.image.BufferedImage;

public class Entity {

	BufferedImage img;
	boolean destructable;
	
	public Entity(int x, int y){
		xVal = x;
		yVal = y;
		
	}
	
	int xVal, yVal;
	/**
	 * @return the xVal
	 */
	public int getxVal() {
		return xVal;
	}

	/**
	 * @param xVal the xVal to set
	 */
	public void setxVal(int xVal) {
		this.xVal = xVal;
	}

	/**
	 * @return the yVal
	 */
	public int getyVal() {
		return yVal;
	}

	/**
	 * @param yVal the yVal to set
	 */
	public void setyVal(int yVal) {
		this.yVal = yVal;
	}

	/**
	 * @return the img
	 */
	public BufferedImage getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(BufferedImage img) {
		this.img = img;
	}

	/**
	 * @return the destructable
	 */
	public boolean isDestructable() {
		return destructable;
	}

	/**
	 * @param destructable the destructable to set
	 */
	public void setDestructable(boolean destructable) {
		this.destructable = destructable;
	}
	
}
