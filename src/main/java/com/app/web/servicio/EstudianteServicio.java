package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Estudiante;


public interface EstudianteServicio {

	public List<Estudiante> Lista_Estudiantes();
	public void guardar_estudiante(Estudiante estud);
	//public Optional<Producto> get (Integer id);
	//public Autor buscarPorId(Integer id);
	//public void actualizar_autor (Autor autor);
	//public void eliminar_autor (Integer id);



}


