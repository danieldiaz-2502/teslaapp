package main;

import processing.core.PApplet;

public class Carro {
	
		int precio;
		int velocidad;
		int resistencia;
		int vel;
		PApplet app;
		
		public Carro(int posX, int posY, PApplet app) {
			this.precio = posX;
			this.velocidad = posY;
			this.resistencia = 10;
			this.vel = 5;
			this.app = app;
		}
		
		public void pintar() {
			
		}
}
