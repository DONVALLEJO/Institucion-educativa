package com.app.web.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.web.entidad.Estudiante;
import com.app.web.servicio.EstudianteServicio;


@Controller

public class EstudianteControlador {

	private final   EstudianteServicio serv_estud;

	private final static Logger LOGGER = LoggerFactory.getLogger(EstudianteControlador.class);
	
	
	
	public EstudianteControlador(EstudianteServicio serv_estud) {	
		this.serv_estud = serv_estud;
	}



	@RequestMapping({"/estudiantes/","/"})
	//@GetMapping({"/estudiantes","/"})
	public String listar_estudiantes(Model model) {
		System.out.println("ESTE ES EL OBJETO DEL ESTUDIANTE {}  "+serv_estud.Lista_Estudiantes());
		LOGGER.info("ESTE ES EL OBJETO DEL ESTUDIANTE {}",serv_estud.Lista_Estudiantes());
		model.addAttribute("var_list_estud",serv_estud.Lista_Estudiantes());
		model.addAttribute("titulo_lista_estudiantes", "Lista De Estudiantes");
		return  "carpeta_estudiantes/listar_estudiantes";
	}
	
	
	
	@RequestMapping({"/estudiantes/nuevo"})
	public String mostrarformulariocrearestudiante(Model model) {	
		model.addAttribute("titulo_crear_estudiante", "Crear Estudiante");
		model.addAttribute("obj_estudiante", new Estudiante()); // instanciamos la clase y mandamos el objeto a la vista
		return  "carpeta_estudiantes/crear_estudiante";
	}
		
	@PostMapping("/estudiantes/guardar")                            
	public String guardarEstudiante(Estudiante obj_estudiante ) {		
		System.out.println("este es el objeto "+obj_estudiante);
		LOGGER.info("DATOS OBJETO DEL ESTUDIANTES DEL FORMULARIO {}",obj_estudiante);
		serv_estud.guardar_estudiante(obj_estudiante);		
		
		return "redirect:/";
		
		
	}
	
	
	@GetMapping({"/plantilla"})
	public String plantilla(Model model) {
		
		//model.addAttribute("titulo_crear_estudiante", "Crear Estudiante");
		//model.addAttribute("obj_estudiante",new Estudiante()); // instanciamos la clase y mandamos el objeto a la vista
		return  "plantilla";
	}
	
}
