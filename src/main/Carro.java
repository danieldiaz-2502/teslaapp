package main;

import processing.core.PApplet;

public class Carro {
	
		int precio;
		int velocidad;
		int resistencia;
		int vel;
		PApplet app;
		
		public Carro(int posX, int posY, PApplet app) {
			this.posX = posX;
			this.posY = posY;
			this.tam = 10;
			this.vel = 5;
			this.app = app;
		}
		
		public void pintar() {
			disparar();
		}
		
		public void disparar () {
			app.fill(250,0,0);
			app.ellipse(this.posX - 24, this.posY, this.tam, this.tam);
			this.posY -= this.vel;
		}

}
