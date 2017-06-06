package com.grupo5.ipoo.vehiculoAutonomo.vehiculo;

public class Sensor {
	private int id;
	private boolean activo;
	
	
	public Sensor() {
		super();
	}


	public Sensor(int id, boolean activo) {
		super();
		this.id = id;
		this.activo = activo;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	//metodos 

	private obtCapturaSen(){
		return CapturaCamara;
		
	}
	
	
	
	
}
