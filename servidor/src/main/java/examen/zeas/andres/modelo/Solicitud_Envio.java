package examen.zeas.andres.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Solicitud_Envio implements Serializable{
	
	@Id
	private int id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "paquete_id")
	private Paquete paquete;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "remitente_id")
	private Remitente remitente;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "receptor_id")
	private Receptor receptor;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Paquete getPaquete() {
		return paquete;
	}
	public void setPaquete(Paquete paquete) {
		this.paquete = paquete;
	}
	public Remitente getRemitente() {
		return remitente;
	}
	public void setRemitente(Remitente remitente) {
		this.remitente = remitente;
	}
	public Receptor getReceptor() {
		return receptor;
	}
	public void setReceptor(Receptor receptor) {
		this.receptor = receptor;
	}
	
	
	@Override
	public String toString() {
		return "Solicitud_Envio [id=" + id + ", paquete=" + paquete + ", remitente=" + remitente + ", receptor="
				+ receptor + "]";
	}

}
