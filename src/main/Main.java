package main;

import processing.core.PApplet;
import processing.core.PImage;
import controlP5.*;

public class Main extends PApplet {
	//Variabales para las opciones en pantalla
	private ControlP5 cp5;
	int pantalla;
	boolean desplegarMenu;
	PImage inicio;
	PImage ingresar;
	PImage ingresarClaro;
	PImage parteArriba;
	PImage recomendado;
	PImage accesorios;
	PImage modelosOpciones;
	PImage promocionesOpcion;
	PImage historialOpcion;
	PImage modelosOpcionesClaro;
	PImage promocionesOpcionClaro;
	PImage historialOpcionClaro;
	PImage accesoriosOpcion;
	PImage menuDesplegable;
	PImage modeloX_imagen;
	PImage modeloY_imagen;
	PImage modeloS_imagen;
	PImage menuAutos;
	PImage modeloYinfo;
	PImage modeloXinfo;
	PImage modeloSinfo;
	PImage modelo3info;
	PImage pantallaPago;
	PImage pantallaComparacion;
	Model3 modelo3;
	Otro otroModelo;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}
	
    public void settings() {
		size(340,600);
	}
    
	public void setup() {
		cp5 = new ControlP5(this);
		pantalla = 0;
		desplegarMenu = false;
		inicio = loadImage("img/INICIO.png");
		ingresar = loadImage("img/ingresar.png");
		ingresarClaro = loadImage("img/ingresarN.png");
		parteArriba = loadImage("img/parteArriba.png");
		recomendado = loadImage("img/recomendado.png");
		accesorios = loadImage("img/accesorios.png");
		modelosOpciones = loadImage("img/modelosOpcion.png");
		modelosOpcionesClaro = loadImage("img/modelosOpcionClaro.png");
		promocionesOpcion = loadImage ("img/promocionesOpcion.png");
		promocionesOpcionClaro = loadImage("img/promocionesOpcionClaro.png");
		historialOpcion = loadImage("img/historialOpcion.png");
		historialOpcionClaro = loadImage("img/historialOpcionClaro.png");
		accesoriosOpcion = loadImage("img/accesorios.png");
		menuDesplegable = loadImage("img/menuDesplegable.png");
		modeloX_imagen = loadImage("img/ModeloX.png");
		modeloY_imagen = loadImage("img/ModeloY.png");
		modeloS_imagen = loadImage("img/ModeloS.png");
		menuAutos = loadImage("img/menuAutos.png");
		modeloYinfo = loadImage("img/modeloYinfo.png");
		modeloXinfo = loadImage("img/modeloXinfo.png");
		modelo3info = loadImage("img/modelo3info.png");
		modeloSinfo = loadImage("img/modeloSinfo.png");
		pantallaPago = loadImage("img/pantallaPago.png");
		pantallaComparacion = loadImage("img/paginaComparacion.png");
		modelo3 = new Model3(38500,0,0,this);
		otroModelo = new Otro(0,0,0,this);
	}
	
    public void draw() {

    	switch (pantalla) {
    	case 0:
    		image(inicio,0,0,340,600);
    		image(ingresar,122,380,90,30);
    		if(mouseX < 122 + 90 && mouseX > 122 && mouseY < 380 +30 && mouseY > 380) {
    			image(ingresarClaro,122,380,90,30);
    		}
    		/*image(pantallaComparacion,0,0,340,600);
    		rect(104,265,20,-100);*/
    		break;
    	
    	case 1:
    		background(250);
    		//parte del menu que mantiene arriba
    		image(parteArriba,0,0,340,35);
    		image(recomendado,30,31,280,220);
    		image(modelosOpciones,40,270,50,55);
    		if(mouseX < 40 + 50 && mouseX > 40 && mouseY < 270 + 55 && mouseY > 270) {
    			image(modelosOpcionesClaro,40,270,50,55);
    		}
    		image(promocionesOpcion,135,270,72,55);
    		if(mouseX < 135 + 72 && mouseX > 135 && mouseY < 270 + 55 && mouseY > 270) {
    			image(promocionesOpcionClaro,135,270,72,55);
    		}
    		image(historialOpcion,252,270,48,55);
    		if(mouseX < 250 + 48 && mouseX > 250 && mouseY < 270 + 55 && mouseY > 270) {
    			image(historialOpcionClaro,252,270,48,55);
    		}
    		image(accesoriosOpcion,30,360,280,200);
    		if (desplegarMenu == true) {
    			image(menuDesplegable,0,35,190,250);
        	}
    		break;
    	case 2:
    		background(250);
    		image(parteArriba,0,0,340,35);
    		image(menuAutos,0,-10,340,600);
    		//desplegar el menu de opciones
    		if (desplegarMenu == true) {
    			image(menuDesplegable,0,35,190,250);
        	}
    		break;
    	case 3:
    		background(250);
    		image(modeloYinfo,0,0,340,600);
    		image(parteArriba,0,0,340,35);
    		if (desplegarMenu == true) {
    			image(menuDesplegable,0,35,190,250);
        	}
    		break;
    	case 4:
    		background(250);
    		image(modeloXinfo,0,0,340,600);
    		image(parteArriba,0,0,340,35);
    		if (desplegarMenu == true) {
    			image(menuDesplegable,0,35,190,250);
        	}
    		break;
    	case 5:
    		background(250);
    		image(modeloSinfo,0,0,340,600);
    		image(parteArriba,0,0,340,35);
    		if (desplegarMenu == true) {
    			image(menuDesplegable,0,35,190,250);
        	}
    		break;
    	case 6:
    		background(250);
    		image(modelo3info,0,0,340,600);
    		image(parteArriba,0,0,340,35);
    		if (desplegarMenu == true) {
    			image(menuDesplegable,0,35,190,250);
        	}
    		break;
    	case 7:
    		background(250);
    		image(pantallaComparacion,0,0,340,600);
    		image(parteArriba,0,0,340,35);
    		noStroke();
    		fill(250,0,0);
    		modelo3.comparaVel();
    		modelo3.comparaResis();
    		fill(100);
    		otroModelo.comparaVel();
    		otroModelo.comparaResis();
    		if (desplegarMenu == true) {
    			image(menuDesplegable,0,35,190,250);
        	}
    		break;
    	case 8:
    		background(250);
    		image(pantallaPago,0,0,340,600);
    		image(parteArriba,0,0,340,35);
    		if (desplegarMenu == true) {
    			image(menuDesplegable,0,35,190,250);
        	}
    		break;
    	}
    	
    	fill(0);
    	textSize(29);
    	text("x="+mouseX+"y="+mouseY,mouseX,mouseY);
    	
    }
    public void mousePressed() {
    	if(mouseX < 30 + 280 && mouseX > 30 && mouseY < 31 + 220 && mouseY > 31 && pantalla == 1 && desplegarMenu == false) {
			pantalla = 3;
		}
    	if(mouseX < 122 + 90 && mouseX > 122 && mouseY < 380 +30 && mouseY > 380) {
			pantalla = 1;
		}
    	if(mouseX < 40 + 50 && mouseX > 40 && mouseY < 270 + 55 && mouseY > 270) {
			pantalla = 2;
		}
    	//para que aparezcan las opciones
    	if(mouseX < 50 && mouseX > 0 && mouseY < 35 && mouseY > 0) {
			desplegarMenu = true;
		}
    	if(mouseX < 190 && mouseX > 0 && mouseY < 40 + 35 && mouseY > 40 && desplegarMenu == true) {
			pantalla = 1;
			//para que el menu vuelva a su estado inicial y se pueda ver la interfaz
			desplegarMenu=false;
		}
    	if(mouseX < 190 && mouseX > 0 && mouseY < 190 + 35 && mouseY > 190 && desplegarMenu == true) {
			pantalla = 2;
			desplegarMenu=false;
			// se hace enfansis en el pantalla == 2 para que solo se pueda realizar la accion en esa pantalla
		}
    	if(mouseX < 340 && mouseX > 0 && mouseY < 124 + 50 && mouseY > 50 && pantalla == 2) {
			pantalla = 3;
			desplegarMenu=false;
		}
    	/*if(mouseX < 340 && mouseX > 0 && mouseY < 124 + 188 && mouseY > 188 && pantalla == 2) {
			pantalla = 4;
			desplegarMenu=false;
		}*/
    	if(mouseX < 340 && mouseX > 0 && mouseY < 124 + 323 && mouseY > 323 && pantalla == 2) {
			pantalla = 5;
			desplegarMenu=false;
		}
    	if(mouseX < 340 && mouseX > 0 && mouseY < 124 + 458 && mouseY > 458 && pantalla == 2) {
			pantalla = 6;
			desplegarMenu=false;
		}
    	//para realizar la opcion de comparar el modelo Tesla
    	if(mouseX > 35 && mouseX < 35 + 122 && mouseY <30 + 546 && mouseY > 546 && (pantalla == 3 || pantalla == 4 || pantalla == 5 || pantalla == 6)) {
    		pantalla = 7;
    		modelo3.setVelocidad(0);
    		modelo3.setResistencia(0);
    		otroModelo.setVelocidad(0);
    		otroModelo.setResistencia(0);
    		desplegarMenu=false;
    	}
    	if(mouseX > 179 && mouseX < 179 + 122 && mouseY <30 + 546 && mouseY > 546 && (pantalla == 3 || pantalla == 4 || pantalla == 5 || pantalla == 6)) {
    		pantalla = 8;
    		desplegarMenu=false;
    	}
    }
}
