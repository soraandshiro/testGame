package model;
/**
 * <h1>The TronModel Interface</h1>
 * 
 * @author Max Keller
 * @version 1.0
 */
public interface ITronModel {
	/**
	 * get the grid
	 */
	public IMapCase getGrille();
	/**
	 * set the grid
	 */
	public void setGrille(IMapCase grid);
}
