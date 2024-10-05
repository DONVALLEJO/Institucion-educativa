package com.app.web.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.web.entidad.Estudiante;
import com.app.web.entidad.Profesor;
import com.app.web.servicio.EstudianteServicio;
import com.app.web.servicio.ProfesorServicio;

@Controller
public class ProfesorControlador {
	
	private final   ProfesorServicio serv_profe;
	
	private final static Logger LOGGER = LoggerFactory.getLogger(ProfesorControlador.class);

	public ProfesorControlador(ProfesorServicio serv_profe) {
			this.serv_profe = serv_profe;
	}


	
	@RequestMapping({"/profesores/"})
	//@GetMapping({"/estudiantes","/"})
	public String listar_profesores(Model model) {
		System.out.println("ESTE ES EL OBJETO DEL Profesor {}  "+serv_profe.Lista_Profesores());
		LOGGER.info("ESTE ES EL OBJETO DEL Profesor {}",serv_profe.Lista_Profesores());
		model.addAttribute("var_list_profe",serv_profe.Lista_Profesores());
		model.addAttribute("titulo_lista_profesores", "Lista De Docentes");
		return  "carpeta_profesores/listar_profesores";
	}
	
	@RequestMapping({"/profesores/nuevo"})
	public String mostrarformulariocrearprofesor(Model model) {	
		model.addAttribute("titulo_crear_profesor", "Crear Docente");
		model.addAttribute("obj_docente", new Profesor()); // instanciamos la clase y mandamos el objeto a la vista
		return  "carpeta_profesores/crear_profesores";
	}
	
}
