package model;
/**
 * <h1>The MapCase Class</h1>
 * 
 * @author Max Keller
 * @version 1.0
 */


import java.awt.Color;

import DAO.DataDAO;



public class MapCase implements IMapCase{
	
	
	private IRider rider1;
	private IRider rider2;
	private int width = 600;
	private int height = 400;
	private int nbCellulsHeight=40;
	private int nbCellulsWidth=60;
	private ITimer timer;
	private DataDAO db = new DataDAO();

	
	

	/**
	 * Constructor
	 * set 2 rider on the map
	 */
	public MapCase () {
		this.rider1= new Rider(2,2,Color.orange,Direction.RIGHT,this);
		this.rider2= new Rider(30,30,Color.cyan,Direction.LEFT,this);
		this.timer= new timer();
		timer.start();
	}
	
	/**
	 * Check collision for a rider
	 * check if rider is in collision
	 * @param rider
	 * @return boolean collision
	 * 
	 */
	public boolean checkColision(Rider rider) {
		if(rider.getX()>this.nbCellulsWidth || rider.getX()<=0 || rider.getY()<=0 || rider.getY()>this.nbCellulsHeight) {rider.setAlive(false); return true;} 
		
		for (IElements particle : rider1.getParticles()) {
			if(rider.getX() == particle.getX() && rider.getY() == particle.getY()) {rider.setAlive(false);return true;}
		}
		
		for (IElements particle : rider2.getParticles()) {
			if(rider.getX() == particle.getX() && rider.getY() == particle.getY()) {rider.setAlive(false);return true;}
	
	}
		return false;
	
}
	/**
	 * (non-Javadoc)
	 * @see model.IMapCase#getRider1()
	 */
	@Override
	public IRider getRider1() {
		return rider1;
	}

	/**
	 * Set rider 1
	 */
	public void setRider1(Rider rider1) {
		this.rider1 = rider1;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IMapCase#getRider2()
	 */
	@Override
	public IRider getRider2() {
		return rider2;
	}

	/**
	 * Set rider 2
	 */
	public void setRider2(Rider rider2) {
		this.rider2 = rider2;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IMapCase#getWidth()
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * Set the width
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IMapCase#getHeight()
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * set the height in pixels of the grid
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IMapCase#getNbCellulsHeight()
	 */
	@Override
	public int getNbCellulsHeight() {
		return nbCellulsHeight;
	}


	public void setNbCellulsHeight(int nbCellulsHeight) {
		this.nbCellulsHeight = nbCellulsHeight;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IMapCase#getNbCellulsWidth()
	 */
	@Override
	public int getNbCellulsWidth() {
		return nbCellulsWidth;
	}


	public void setNbCellulsWidth(int nbCellulsWidth) {
		this.nbCellulsWidth = nbCellulsWidth;
	}
	
	@Override
	public ITimer getTimer() {
		return timer;
	}
	
	@Override
	public void saveData() {
		
		if(rider1.isAlive()) {
			db.save(2, (int) timer.getTime());}
		else {
			db.save(1, (int) timer.getTime());}
		}
		

}

	
	
	
	
	
	
	
	
	
	
	

