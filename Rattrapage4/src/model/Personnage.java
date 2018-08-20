package model;



public class Personnage {
	
	private int x;
	private int y;
	private int oldX;
	private int oldY;
	
	public Personnage(){
		x = (int)(Math.random() * ((29 - 0) + 1));
		y = (int)(Math.random() * ((19 - 0) + 1));
		oldX = x;
		oldY = y;
	}
	

	
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getOldX() {
		return this.oldX;
	}
	
	public void setOldX(int oldX) {
		this.oldX = oldX;
	}
	
	public int getOldY() {
		return this.oldY;
	}
	
	public void setOldY(int oldY) {
		this.oldY = oldY;
	}
}
