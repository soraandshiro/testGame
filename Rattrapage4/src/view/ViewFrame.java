package view;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.Controller;

public class ViewFrame extends JFrame implements KeyListener{
	
	
	private static final long serialVersionUID = 1L;

	private static int 		width = 916;
	
	private static int 		height = 640;
	
	private ViewPanel viewpanel;
	
	private Point playerMoves = new Point(0,0);
	
	private Controller controller;
	
	
	public ViewFrame() {
		
    	this.setTitle("Rattrapage");
    	this.setSize(width, height);
    	this.setResizable(false);
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    	this.addKeyListener(this);
    	this.viewpanel = new ViewPanel();
    	this.viewpanel.setBackground(Color.WHITE);
    	this.add(viewpanel);
    	this.setVisible(true);
    	
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		 if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
	    	  playerMoves.x = 1;
	    	  controller.activationTouche(1);
	      }
	      else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
	    	  playerMoves.x = -1;
	    	  controller.activationTouche(2);
	      }
	      else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	    	  playerMoves.y = 1;
	    	  controller.activationTouche(3);
	      }
	      else if (e.getKeyCode() == KeyEvent.VK_UP) {
	    	  playerMoves.y = -1;
	    	  controller.activationTouche(4);
	      }
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public ViewPanel getViewPanel() {
		return this.viewpanel;
	}
	
	public void setController(Controller controller) {
		this.controller = controller;
	}
	
}