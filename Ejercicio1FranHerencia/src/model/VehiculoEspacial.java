package model;

public abstract class VehiculoEspacial {

	private String nombre;
	private int velocidad;
	
	
	public String getNombre() {
		return nombre;
		
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}
	
	public void setVelocidad(int velocidad) {
		
		this.velocidad = velocidad;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public abstract void moverse();
	
	
	public String mostrarInfo() {
		return "vehiculo Espacial [nombre: " + nombre + "velocidad: " + velocidad + "]";
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
