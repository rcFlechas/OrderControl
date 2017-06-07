package com.ordercontrol.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class Perfil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_perfil")
	private Integer idPerfil;
	
	@Column(name = "nombre_perfil")
	private String nombrePerfil;
	
	@Column(name = "fecha_ingreso")
	private Timestamp fechaIngreso;
	
	@Column(name = "activo")
	private Integer activo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "perfil")
    private List<Usuario> usaurios;

	
	public Perfil() {		
	}

	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombrePerfil() {
		return nombrePerfil;
	}

	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

	public Timestamp getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Timestamp fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public List<Usuario> getUsaurios() {
		return usaurios;
	}

	public void setUsaurios(List<Usuario> usaurios) {
		this.usaurios = usaurios;
	}
}
