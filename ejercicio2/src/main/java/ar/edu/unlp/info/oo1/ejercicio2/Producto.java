package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private String descripcion;
	private double peso;
	private double precioPorKilo;
	
	
	public Producto(String descripcion, double peso, double precioPorKilo) {
		this.descripcion= descripcion;
		this.peso=peso;
		this.precioPorKilo=precioPorKilo;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
	
	public double getPrecioPorKilo() {
		return this.precioPorKilo;
	}
	
	public void setPrecioPorKilo(double precioPorKilo) {
		if(precioPorKilo >0) {
			this.precioPorKilo =precioPorKilo;
		}
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public double getPrecio() {
	    return this.peso * this.precioPorKilo;
	}
	
}
