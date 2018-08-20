package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ViewPanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private char[][] map = new char[20][30];
	
	private Image imagePerso;
	
	private String string = "";
	
	private String time = "";

	public ViewPanel() {
		
		
	}

	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for (int y = 0; y < 20; y++) {
			for (int x = 0; x < 30; x++) {
				switch (map[y][x]) {
				case 'o':
					g.setColor(Color.GRAY);
					g.fillRect( x * 30, y * 30, 29, 29);
					break;
				case 'h':
					g.setColor(Color.BLACK);
					g.fillRect( x * 30, y * 30, 29, 29);
					break;
				case 'p':
					try {
						imagePerso = ImageIO.read(new File("D:\\Installation\\Programme\\Eclipse\\eclipse-workspace\\Rattrapage2\\src\\pion.png"));
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					g.setColor(Color.YELLOW);
					g.fillRect( x * 30, y * 30, 29, 29);
					g.drawImage(imagePerso, x * 30 + 4, y * 30 + 5, 20, 20, null);
					break;
				case 'r':
					g.setColor(Color.RED);
					g.fillRect( x * 30, y * 30, 29, 29);
					break;
					
				default:
					break;
				}
			}
		}
		
		g.setFont(new Font("impact", Font.BOLD, 70));
		g.setColor(Color.BLUE);
		g.drawString(this.string, 350, 300);
		g.setFont(new Font("impact", Font.BOLD, 30));
		g.drawString(this.time, 170, 350);
	}
	
	public void update() {

		repaint();
	}
	
	public void event(int whichEvent) {
		switch(whichEvent) {
		case 1:
			this.string = "Défaite";
			break;
		case 2:
			this.string = "Victoire";
			break;
		}
	}
	
	public void setMap(char[][] map) {
		this.map = map;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
}
