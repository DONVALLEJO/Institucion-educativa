package com.app.web.entidad;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity // la clase se convierte en una entidad
@Table(name = "estudiantes") // la tabla llevara este nombre y no el de la clase
public class Estudiante {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estudiante")
	private int id;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private String apellido;

	
	@Column(nullable = false)
	private String tipo_documento;
	
	@Column(nullable = false, unique = true)
	private String documento;
	
	@Column(nullable = false)
	private String sangre;
	
	@Column(nullable = false, unique = true)
	private String correo;
	
	@Column(nullable = false)
	private String sexo;
	
	@Column(nullable = false)
	private int contacto;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro", updatable = false, nullable = false)
   @DateTimeFormat(iso = ISO.DATE)
	private Date fecha_ingreso;
	
	
	
    @Column(name = "estado", nullable = false)
	
	private String estado ="Activo";

	

	public Estudiante() {

	}


	public Estudiante(int id, String nombre, String apellido, String tipo_documento, String documento, int contacto,
			String sangre, String correo, String sexo, String estado, Date fecha_ingreso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo_documento = tipo_documento;
		this.documento = documento;
		this.contacto = contacto;
		this.sangre = sangre;
		this.correo = correo;
		this.sexo = sexo;
		this.estado = estado;
		this.fecha_ingreso = fecha_ingreso;
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getTipo_documento() {
		return tipo_documento;
	}


	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getSangre() {
		return sangre;
	}


	public void setSangre(String sangre) {
		this.sangre = sangre;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getContacto() {
		return contacto;
	}


	public void setContacto(int contacto) {
		this.contacto = contacto;
	}


	public Date getFecha_ingreso() {
		return fecha_ingreso;
	}


	public void setFecha_ingreso(Date fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tipo_documento="
				+ tipo_documento + ", documento=" + documento + ", contacto=" + contacto + ", sangre=" + sangre
				+ ", correo=" + correo + ", sexo=" + sexo + ", estado=" + estado + ", fecha_ingreso=" + fecha_ingreso
				+ "]";
	}




}
