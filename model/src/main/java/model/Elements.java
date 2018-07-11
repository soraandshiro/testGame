package model;
/**
 * <h1>The Element Class</h1>
 * 
 * @author Max Keller
 * @version 1.0
 */
import java.awt.Color;
import java.util.Observable;


@SuppressWarnings("deprecation")
public class Elements extends Observable implements IElements{
	
	public Elements(int x, int y, Color color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	
	protected int x;
	protected int y;
	protected Color color;
	
	
	/**
	 * (non-Javadoc)
	 * @see model.IElements#getX()
	 */
	@Override
	public int getX() {
		return x;
	}
	/**
	 * Set the x of the element
	 */
	public void setX(int x) {
		this.x = x;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IElements#getY()
	 */
	@Override
	public int getY() {
		return y;
	}
	/**
	 * set the element's y
	 */
	public void setY(int y) {
		this.y = y;
	}
	/**
	 * (non-Javadoc)
	 * @see model.IElements#getColor()
	 */
	@Override
	public Color getColor() {
		return color;
	}
	/**
	 * set the color of the element
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
}
