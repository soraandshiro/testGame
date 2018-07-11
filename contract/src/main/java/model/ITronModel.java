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
	public IMapCase getGrid();
	/**
	 * set the grid
	 */
	public void setGrid(IMapCase grid);
}
