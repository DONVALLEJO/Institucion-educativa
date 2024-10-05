package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Profesor;
import com.app.web.repositorio.EstudianteRepositorio;
import com.app.web.repositorio.ProfesorRepositorio;

@Service
public class ProfesorServicio_Impl implements ProfesorServicio {

	@Autowired
	private ProfesorRepositorio repo_profesor;
	
	
	@Override
	public List<Profesor> Lista_Profesores() {
		// TODO Auto-generated method stub
		return repo_profesor.findAll();
	}

	@Override
	public void guardar_profesor(Profesor profe) {
		repo_profesor.save(profe);
		
	}

}
