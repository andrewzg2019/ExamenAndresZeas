package examen.zeas.andres.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Paquete implements Serializable{
	
	@Id
	private int id;
	private String descripcion;
	private double peso;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "GestionSolicitudEnvioON [id=" + id + ", descripcion=" + descripcion + ", peso=" + peso + "]";
	}

}
