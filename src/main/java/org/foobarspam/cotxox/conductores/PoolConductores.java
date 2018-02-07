package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {
	//Attributes
	private ArrayList<Conductor> poolConductores = new ArrayList<Conductor>();
	
	//Constructor
	public PoolConductores(ArrayList<Conductor> poolConductores) {
		this.poolConductores = poolConductores;
	}
	
	//Getters & Setters
	public ArrayList<Conductor> getPoolConductores(){
		return this.poolConductores;
	}
	//Methods
	public Conductor asignarConductor(){
		int pilotoNumero = ThreadLocalRandom.current().nextInt(0, this.poolConductores.size());
		Conductor pilotoAsignado = null;
		
		while(pilotoAsignado == null){
			if(this.poolConductores.get(pilotoNumero).getOcupado() == true){
				pilotoAsignado = this.poolConductores.get(pilotoNumero);
				pilotoAsignado.setOcupado(true);
				
			}
			else
				pilotoNumero = ThreadLocalRandom.current().nextInt(0, this.poolConductores.size());
					}
		return pilotoAsignado;
	}
}
