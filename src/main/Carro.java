package main;

import processing.core.PApplet;

public class Carro {
	
		int precio;
		int velocidad;
		int resistencia;
		PApplet app;
		
		public Carro(int precio, int velocidad, int resistencia,PApplet app) {
			//esto es para los datos de cada carro, para la gráfica
			this.precio = precio;
			this.velocidad = velocidad;
			this.resistencia = resistencia;
			this.app = app;
		}
		public void comparaVel(){
			app.rect(104,265,20,this.velocidad);
			this.velocidad -= 5;
			if(this.velocidad <= -100) {
				this.velocidad = -100;
			}
		}
		
		public void comparaResis(){
			app.rect(183,265,20,this.resistencia);
			this.resistencia -= 5;
			if(this.resistencia <= -90) {
				this.resistencia = -90;
			}
		}
		
		public int getPrecio() {
			return precio;
		}

		public void setPrecio(int precio) {
			this.precio = precio;
		}

		public int getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(int velocidad) {
			this.velocidad = velocidad;
		}

		public int getResistencia() {
			return resistencia;
		}

		public void setResistencia(int resistencia) {
			this.resistencia = resistencia;
		}

		public PApplet getApp() {
			return app;
		}

		public void setApp(PApplet app) {
			this.app = app;
		}
		
		
}
