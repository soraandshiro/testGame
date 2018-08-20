package controller;


import java.util.Date;

import model.Model;
import view.View;

public class Controller {
	
	private Timer timer;
	private Model model;
	private View view;
	private int stop = 0;
	private int victory = 0;
	private int test;
	
	public Controller(Model model, View view) {
		timer = new Timer();
		timer.start();
		this.model = model;
		this.view = view;
		this.view.getFrame().setController(this);
		this.view.getFrame().getViewPanel().setMap(this.model.getMap());
		}
	
	public void activationTouche(int deplacement) {
		if (stop == 0) {
			switch(deplacement) {
			case 1 :
				if(this.model.getPersonnage().getX() + 1 != 30) {
					this.model.getPersonnage().setX(this.model.getPersonnage().getX() + 1);
				}
				break;
			case 2:
				if(this.model.getPersonnage().getX() - 1 != -1) {
					this.model.getPersonnage().setX(this.model.getPersonnage().getX() - 1);
				}
				break;
			case 3:
				if(this.model.getPersonnage().getY() + 1 != 20) {
					this.model.getPersonnage().setY(this.model.getPersonnage().getY() + 1);
				}
				break;
			case 4:
				if(this.model.getPersonnage().getY() - 1 != -1) {
					this.model.getPersonnage().setY(this.model.getPersonnage().getY() - 1);
				}
				break;
			default:
				break;
			}
		}
		
		event();
		this.model.update();
		this.view.getFrame().getViewPanel().setMap(this.model.getMap());
		this.view.getFrame().getViewPanel().update();
	}
	
	public void event() {
		if(this.model.getMap()[this.model.getPersonnage().getY()][this.model.getPersonnage().getX()] == 'h') {
			timer.stop();
			this.view.getFrame().getViewPanel().setTime(timer.toString());
			this.view.getFrame().getViewPanel().event(1);
			this.view.getFrame().getViewPanel().update();
			stop = 1;
			
		}
		
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 30; x++) {
				if(this.model.getMap()[y][x] == 'o') {
					victory = 1;
				}
			}
		}
		
		if(victory == 0) {
			timer.stop();
			this.view.getFrame().getViewPanel().setTime(timer.toString());
			this.view.getFrame().getViewPanel().event(2);
			this.view.getFrame().getViewPanel().update();
			stop = 1;
		}
		else {
			victory = 0;
		}
	}
}
