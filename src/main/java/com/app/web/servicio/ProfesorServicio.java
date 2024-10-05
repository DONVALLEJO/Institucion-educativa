package com.app.web.servicio;

import java.util.List;

import com.app.web.entidad.Estudiante;
import com.app.web.entidad.Profesor;

public interface ProfesorServicio {

	
	public List<Profesor> Lista_Profesores();
	public void guardar_profesor(Profesor profe);
	//public Optional<Producto> get (Integer id);
	//public Autor buscarPorId(Integer id);
	//public void actualizar_autor (Autor autor);
	//public void eliminar_autor (Integer id);

}
