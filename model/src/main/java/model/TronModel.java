package model;
/**
 * <h1>The TronModel class</h1>
 * 
 * @author Max Keller
 * @version 1.0
 */
public class TronModel implements ITronModel{
	
	private IMapCase grille;
	
	/** 
	 * (non-Javadoc)
	 * @see model.ITronModel#getGrille()
	 */
	public IMapCase getGrille() {
		return grille;
	}
	
	/**
	 * (non-Javadoc)
	 * @see model.ITronModel#setGrille(model.IMapCase)
	 */
	public void setGrille(IMapCase grille) {
		this.grille = grille;
	}

	
	
	
}
