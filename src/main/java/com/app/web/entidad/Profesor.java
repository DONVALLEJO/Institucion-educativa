package com.app.web.entidad;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity // la clase se convierte en una entidad
@Table(name = "profesores") // la tabla llevara este nombre y no el de la clase
public class Profesor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_profesor")
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
	private String especialidad;
	
	@Column(nullable = false)
	private int contacto;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_registro", updatable = false, nullable = false)
   @DateTimeFormat(iso = ISO.DATE)
	private Date fecha_ingreso;

    @Column(name = "estado", nullable = false)
	
	private String estado ="Activo";

	public Profesor() {
		
	}

	public Profesor(int id, String nombre, String apellido, String tipo_documento, String documento, String sangre,
			String correo, String sexo, String especialidad, int contacto, Date fecha_ingreso, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo_documento = tipo_documento;
		this.documento = documento;
		this.sangre = sangre;
		this.correo = correo;
		this.sexo = sexo;
		this.especialidad = especialidad;
		this.contacto = contacto;
		this.fecha_ingreso = fecha_ingreso;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Profesor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", tipo_documento="
				+ tipo_documento + ", documento=" + documento + ", sangre=" + sangre + ", correo=" + correo + ", sexo="
				+ sexo + ", especialidad=" + especialidad + ", contacto=" + contacto + ", fecha_ingreso="
				+ fecha_ingreso + ", estado=" + estado + "]";
	}
    
    
    

    
}
