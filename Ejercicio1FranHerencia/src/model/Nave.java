package model;

public class Nave extends VehiculoEspacial{
	
	
	private int consumo;
	private int combustible = 100;
	private int combustibleSobrante = combustible - consumo;
	
	
	public Nave (String nombre, int velocidad, int consumo) {
		super();
		this.consumo = consumo;
	}
	
	
	public int getConsumo() {
		return consumo;
		
	}
	
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}
	
	public int getCombustible() {
		return combustible;
		
	}
	
	public void setCombustible(int combustible) {
		this.combustible = combustible;
		
	}
	
	public int getCombustibleSobrante() {
		return combustibleSobrante;
		
	}
	
	public void setCombustibleSobrante(int combustibleSobrante) {
		this.combustibleSobrante = combustibleSobrante;
		
	}
	
	
	
	
	
	
	
	

	public void moverse(){
		
		comprobarCombustible();
		
			System.out.println("El vehículo se mueve y consume " + consumo +" de combustible");
			
			
			
			
	}
	
	public void comprobarCombustible() {
		
		if (combustibleSobrante <= 0) {
			System.out.println("El vehículo no se puede mover");
		}
		
	}
	
	


	public String mostrarInfo() {
		return "vehiculo Espacial [nombre " + getNombre() + "velocidad " + getVelocidad() + "]";
		
	}

}
