package org.foobarspam.cotxox.carrera;

import org.foobarspam.cotxox.conductores.*;
import org.foobarspam.cotxox.tarifa.Tarifa;

public class Carrera {
	//Attributes
	Conductor conductor = null;
	
	private double tiempoCarrera = 0;
	private double tiempoEsperado = 0.0;
	
	private double costeTotal = 0.0;
	private double distancia = 0.0;
	
	private String tarjetaCredito = "";
	private String origen = "";
	private String destino = "";
	
	
	//Constructor
	public Carrera(String tarjetaCredito) {
		this.tarjetaCredito = tarjetaCredito;
	}
	
	
	//Getters and setters
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	
	
	public double getTiempoEsperado() {
		return this.tiempoEsperado;
	}
	public String getTarjetaCredito() {
		return this.tarjetaCredito;
	}
	public String getOrigen() {
		return this.origen;
	}
	public String getDestino() {
		return this.destino;
	}
	public double getDistancia() {
		return this.distancia;
	}
	public double getCosteEsperado() {
		return Tarifa.getCosteTotalEsperado(getDistancia(), getCosteEsperado());
	}
}
