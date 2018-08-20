package model;

public class Model {
	
	private char map[][] = new char[20][30];
	
	private int randX;
	private int randY;
	
	private Personnage personnage;
	
	public Model() {
		
		
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 30; x++) {
				map[y][x] = 'o';
			}
		}
		
		for (int i = 0; i < 40; i++) {
			randX = (int)(Math.random() * ((29 - 0) + 1));
			randY = (int)(Math.random() * ((19 - 0) + 1));
			map[randY][randX] = 'h';
		}
		
		personnage = new Personnage();
		
		while(map[this.personnage.getY()][this.personnage.getX()] != 'o') {
			personnage = new Personnage();
		}
		
		map[this.personnage.getY()][this.personnage.getX()] = 'p';
	}

	
	public char[][] getMap() {
		return this.map;
	}
	
	public Personnage getPersonnage() {
		return this.personnage;
	}
	
	public void update() {
		map[this.personnage.getOldY()][this.personnage.getOldX()] = 'r';
		map[this.personnage.getY()][this.personnage.getX()] = 'p';
		this.personnage.setOldX(this.personnage.getX());
		this.personnage.setOldY(this.personnage.getY());
	}
	
}
