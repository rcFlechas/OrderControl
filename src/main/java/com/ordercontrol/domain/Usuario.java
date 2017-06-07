package com.ordercontrol.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;
	
	@JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil")
	@ManyToOne(optional = false)
	private Perfil perfil;
	
	@JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
	@ManyToOne(optional = false)
	private Empleado empleado;
	
	@Column(name = "fecha_ingreso")
	private Timestamp fechaIngreso;
	
	@Column(name = "activo")
	private Integer activo;	
	
	public Usuario() {
		
	}
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Perfil getPerfil() {
		return perfil;
	}
	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
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
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", userName=" + userName + ", password=" + password + ", perfil="
				+ perfil.getNombrePerfil() + ", empleado=" + empleado.getNombreEmpleado() + ", fechaIngreso=" + fechaIngreso + ", activo=" + activo + "]";
	}
	
	
}
