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
@Table(name = "empleado")
public class Empleado implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_empleado")
	private Integer idEmpleado;
	
	@Column(name = "documento_empleado")
	private String documentoEmpleado;
	
	@Column(name = "nombre_empleado")
	private String nombreEmpleado;
	
	@Column(name = "apellido_empleado")
	private String apellidoEmpleado;
	
	@Column(name = "telefono_empleado")
	private String telefonoEmpleado;
	
	@Column(name = "direccion_empleado")
	private String direccionEmpleado;
	
	@Column(name = "fecha_ingreso")
	private Timestamp fechaIngreso;
	
	@Column(name = "activo")
	private Integer activo;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "perfil")
    private List<Usuario> empleado;
	
	public Empleado() {	
	}

	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getDocumentoEmpleado() {
		return documentoEmpleado;
	}

	public void setDocumentoEmpleado(String documentoEmpleado) {
		this.documentoEmpleado = documentoEmpleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellidoEmpleado() {
		return apellidoEmpleado;
	}

	public void setApellidoEmpleado(String apellidoEmpleado) {
		this.apellidoEmpleado = apellidoEmpleado;
	}

	public String getTelefonoEmpleado() {
		return telefonoEmpleado;
	}

	public void setTelefonoEmpleado(String telefonoEmpleado) {
		this.telefonoEmpleado = telefonoEmpleado;
	}

	public String getDireccionEmpleado() {
		return direccionEmpleado;
	}

	public void setDireccionEmpleado(String direccionEmpleado) {
		this.direccionEmpleado = direccionEmpleado;
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

	public List<Usuario> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Usuario> empleado) {
		this.empleado = empleado;
	}
}
