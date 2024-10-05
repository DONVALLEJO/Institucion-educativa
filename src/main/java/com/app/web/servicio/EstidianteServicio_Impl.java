package com.app.web.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entidad.Estudiante;
import com.app.web.repositorio.EstudianteRepositorio;

@Service
public class EstidianteServicio_Impl implements EstudianteServicio {

	@Autowired
	private EstudianteRepositorio repo_estudiante;

	@Override
	public List<Estudiante> Lista_Estudiantes() {

		return repo_estudiante.findAll();
	}

	@Override
	public void guardar_estudiante(Estudiante estud) {
		
		repo_estudiante.save(estud);
		
	}







}
