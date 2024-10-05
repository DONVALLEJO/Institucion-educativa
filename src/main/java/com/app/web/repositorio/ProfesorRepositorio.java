package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Estudiante;
import com.app.web.entidad.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Integer> {

}
