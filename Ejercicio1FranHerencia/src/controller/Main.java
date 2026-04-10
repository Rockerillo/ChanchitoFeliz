package controller;

import java.util.ArrayList;

import model.Nave;
import model.Ovni;
import model.Sonda;
import model.VehiculoEspacial;

public class Main {

	public static void main(String[] args) {
		
		Nave nave = new Nave("Halcón Milenario", 50, 10);
		Sonda sonda = new Sonda("Apollo 11");
		Ovni ovni = new Ovni("Ovni");
		
		ArrayList<VehiculoEspacial> naves = new ArrayList<>();
		
		naves.add(nave);
		naves.add(ovni);
		naves.add(sonda);
		
		
		for(VehiculoEspacial N : naves) {
			N.moverse();
			N.mostrarInfo();
			
		}
		
		
		

	}

}
