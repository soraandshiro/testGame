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
	private int nbCelsHeight=40;
	private int nbCelsWidth=60;
	private ITimer timer;
	private DataDAO db = new DataDAO();

	
	

	/**
	 * Costructor
	 * set 2 rider on the grid
	 */
	public MapCase () {
		this.rider1= new Rider(2,2,Color.red,Direction.EST,this);
		this.rider2= new Rider(30,30,Color.cyan,Direction.OUEST,this);
		this.timer= new timer();
		timer.start();
	}
	
	/**
	 * Check colision for a rider
	 * checkif rider is in colision
	 * @param rider
	 * @return boolean colision
	 * 
	 */
	public boolean checkColision(Rider rider) {
		if(rider.getX()>this.nbCelsWidth || rider.getX()<=0 || rider.getY()<=0 || rider.getY()>this.nbCelsHeight) {rider.setAlive(false); return true;} 
		
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
	 * @see model.IMapCase#getNbCelsHeight()
	 */
	@Override
	public int getNbCelsHeight() {
		return nbCelsHeight;
	}


	public void setNbCelsHeight(int nbCelsHeight) {
		this.nbCelsHeight = nbCelsHeight;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IMapCase#getNbCelsWidth()
	 */
	@Override
	public int getNbCelsWidth() {
		return nbCelsWidth;
	}


	public void setNbCelsWidth(int nbCelsWidth) {
		this.nbCelsWidth = nbCelsWidth;
	}
	@Override
	public ITimer getTimer() {
		return timer;
	}
	@Override
	public void save() {
		
		if(rider1.isAlive()) {
			db.save(2, (int) timer.getTime());}
		else {
			db.save(1, (int) timer.getTime());}
		}
		

}

	
	
	
	
	
	
	
	
	
	
	

