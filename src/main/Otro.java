package main;

import processing.core.PApplet;

public class Otro extends Carro{

	public Otro(int precio, int velocidad, int resistencia, PApplet app) {
		super(precio, velocidad, resistencia, app);
	}
	public void comparaVel(){
		app.rect(130,265,20,this.velocidad);
		this.velocidad -= 5;
		if(this.velocidad <= -50) {
			this.velocidad = -50;
		}
	}
	
	public void comparaResis(){
		app.rect(209,265,20,this.resistencia);
		this.resistencia -= 5;
		if(this.resistencia <= -40) {
			this.resistencia = -40;
		}
	}

}
