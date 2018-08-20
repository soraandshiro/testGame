package controller;

import java.util.Date;

public class Timer {
	
	private int timeStart;
	private int timeStop;
	private int timeFinal;
	private int heure;
	private int minute;
	private int seconde;
	
	public void start() {
		timeStart = new Date().getSeconds() + new Date().getMinutes() * 60 + new Date().getHours() * 3600;
	}
	
	public void stop() {
		timeStop = new Date().getSeconds() + new Date().getMinutes() * 60 + new Date().getHours() * 3600;
		timeFinal = timeStop - timeStart;
		heure = timeFinal / 3600;
		timeFinal = timeFinal % 3600;
		minute = timeFinal / 60;
		timeFinal = timeFinal % 60;
		seconde = timeFinal;
	}
	
	public String toString() {
		return "Temps : " + heure + " heures " + minute + " minutes " + seconde + " secondes.";
	}
}
