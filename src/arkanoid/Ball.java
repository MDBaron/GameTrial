package arkanoid;

public class Ball extends Entity {

	int xVector, yVector;

	public Ball(int x, int y) {
		super(x, y);
		xVector = 1;
		yVector = -1;
	}

	/**
	 * @return the xVector
	 */
	public int getxVector() {
		return xVector;
	}

	/**
	 * @param xVector the xVector to set
	 */
	public void setxVector(int xVector) {
		this.xVector = xVector;
	}

	/**
	 * @return the yVector
	 */
	public int getyVector() {
		return yVector;
	}

	/**
	 * @param yVector the yVector to set
	 */
	public void setyVector(int yVector) {
		this.yVector = yVector;
	}
	
}
