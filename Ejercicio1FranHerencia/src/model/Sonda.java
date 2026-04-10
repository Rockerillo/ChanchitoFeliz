package model;

public class Sonda extends VehiculoEspacial{
	
	
	
	public Sonda (String nombre) {
		super();
		
	}
	
	
	
	
	
public void moverse(){
		
		System.out.println("El vehículo se mueve lentamente");
}

public String mostrarInfo() {
	return "vehiculo Espacial [nombre " + getNombre() + " velocidad: Lentamente]";
	
}
	
	
	
	
}
