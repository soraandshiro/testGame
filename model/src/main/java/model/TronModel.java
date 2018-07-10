package model;
/**
 * <h1>The TronModel class</h1>
 * 
 * @author Max Keller
 * @version 1.0
 */
public class TronModel implements ITronModel{
	private IMapCase grid;
	/**
	 * 
	 * (non-Javadoc)
	 * @see model.ITronModel#getGrid()
	 */
	public IMapCase getGrid() {
		return grid;
	}
	/**
	 * (non-Javadoc)
	 * @see model.ITronModel#setGrid(model.IMapCase)
	 */
	public void setGrid(IMapCase grid) {
		this.grid = grid;
	}

	
	
	
}
