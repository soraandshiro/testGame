package model;
/**
 * <h1>The Rider Class</h1>
 * 
 * @author Max Keller
 * @version 1.0
 */
import java.awt.Color;
import java.util.ArrayList;

public class Rider extends Elements implements IRider , IElements{
	private Direction direction;
	public ArrayList<IElements> TabElem = new ArrayList<IElements>();
	boolean alive = true;
	public MapCase grid;

	
/**
 * Constructor
 * @param x,y,color,direction,grid
 * 
 * 	
 */
public Rider(int x, int y, Color color , Direction direction,MapCase grid) {
		super(x, y, color);
		this.direction=direction;
		this.grid=grid;
		// TODO Auto-generated constructor stub
	}



/**
 * (non-Javadoc)
 * @see model.IRider#move()
 */
public void move() {
	this.TabElem.add(0, new Line(this.x, this.y, this.color));
	switch(this.direction) {
	case RIGHT: this.x=x+1;
		break;
	case TOP: this.y=y-1;
		break;
	case LEFT: this.x=x-1;
		break;
	case BOT: this.y=y+1;
		break;
	default:
		break;
	}
	
	grid.checkColision(this);
	this.setChanged();
	this.notifyObservers();
	
	
}



/**
 * (non-Javadoc)
 * @see model.IRider#isAlive()
 */
public boolean isAlive() {
	return alive;
}


/**
 * set rider alive status
 */
public void setAlive(boolean alive) {
	this.alive = alive;
}


/**
 * (non-Javadoc)
 * @see model.IRider#getParticles()
 */

@Override
public ArrayList<IElements> getParticles() {
	// TODO Auto-generated method stub
	return TabElem;
}
/**
 * (non-Javadoc)
 * @see model.IRider#turnRight()
 */
@Override
public void turnRight() {
	switch(this.direction) {
	case TOP: direction = Direction.RIGHT;break;
	case RIGHT: direction = Direction.BOT;break;
	case BOT: direction = Direction.LEFT;break;
	case LEFT: direction = Direction.TOP;break;
	}
	
}
/**
 * (non-Javadoc)
 * @see model.IRider#turnLeft()
 */
@Override
public void turnLeft() {
		switch(this.direction) {
		case TOP: direction = Direction.LEFT;break;
		case RIGHT: direction = Direction.TOP;break;
		case BOT: direction = Direction.RIGHT;break;
		case LEFT: direction = Direction.BOT;break;
		}
	
}


	


	
	

	
}
