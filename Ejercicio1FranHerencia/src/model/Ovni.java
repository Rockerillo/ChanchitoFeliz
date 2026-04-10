package model;

import java.util.Random;

public class Ovni extends VehiculoEspacial{

	Random rd = new Random();
	
	private int velocidad;
	
	
	
	public Ovni (String nombre) {
		super();
		this.velocidad = rd.nextInt(100,500);
	}
	
	
	
	public int getVelocidad(int velocidad) {
		return velocidad;
	}

	
	public void setVelocidad() {
		this.velocidad = velocidad;
	}
	
	
	
	public void moverse(){
	
		velocidad = rd.nextInt(100,500);
	
		System.out.println("El Ovni se mueve a una velocidad de " + velocidad + " Km / h");
			
		}
	
	
	
	public String mostrarInfo() {
		return "vehiculo Espacial [nombre " + getNombre() + " velocidad: " + velocidad + "]";
	
	}




	
}
