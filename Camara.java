package com.grupo5.ipoo.vehiculoAutonomo.vehiculo;

public class Camara {
	
	private int id;
	private boolean activo;
	
	public Camara() {
		super();
	}

	public Camara(int id, boolean activo) {
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
	public obtCaputraCam(){
		return CapturaCamara;
	}
	
}
