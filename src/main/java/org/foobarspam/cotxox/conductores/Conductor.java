package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {

	//Attributes
	private String nombre = "";
	private String modelo = "";
	private String matricula = "";
	private double valoracionMedia = 0.0;
	private ArrayList<Double> valoraciones = new ArrayList<Double>();
	private Boolean ocupado = false;
	
	
	//Constructor 
	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	
	//Getters & Setters
	public ArrayList<Double> getValoraciones() {
		return this.valoraciones;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setOcupado(Boolean ocupado) {
		this.ocupado = ocupado;
	}
	public Boolean getOcupado() {
		return this.ocupado;
	}
	public double getValoracionMedia() {
		return this.valoracionMedia;
	}
	
	public void setValoracion(double valoracion) {
		double sumaValoraciones = 0;
		getValoraciones().add(valoracion);
		
		for (Double valor : getValoraciones())
			sumaValoraciones = sumaValoraciones + valor;
		
		valoracionMedia = sumaValoraciones / getValoraciones().size();
		
	}
}
