package cl.twk.proyectos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MainController {
	
	@GetMapping (value = "/historia")
	 public String historia () {
		return "historia";
	}
	
	@GetMapping (value = "/reserva")
	public String reserva () {
		return "reserva";
	}
	
	@GetMapping (value = "/cancelar")
	public String cancelar () {
		return "cancelar";
	}
	
	@GetMapping (value = "/volver")
	public String index () {
		return "index";
	};
}

