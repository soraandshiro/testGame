package main;
/**
 * <h1>The  Main Class</h1>
 * 
 * @author Max Keller
 * @version 1.0
 */
import controller.TronControl;
import controller.IController;
import model.MapCase;
import model.ITronModel;
import model.TronModel;
import view.Frame;
import view.IView;

public abstract class Main {

    public static void main(final String[] args) {
    	// on charge le model
    	final ITronModel model = new TronModel();
    	//on set la grid
    	model.setGrille(new MapCase());
    	//on charge la vue avec le model
    	final IView view = new Frame(model);	
    	//et on charge le controller
    	IController game = new TronControl(model, view);
    	//on lance le jeu
    	game.play();
    	
    }

}
