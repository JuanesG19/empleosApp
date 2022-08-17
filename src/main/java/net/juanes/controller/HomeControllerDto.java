package net.juanes.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerDto {

	@GetMapping("/")
	public String mostrarHome(Model model) {
		/**
		model.addAttribute("mensaje", "Pagina Para Buscar Empleos");
		model.addAttribute("fecha", new Date());
		*/
		
		String nombre = "Auxiliar de Contabilidad";
		Date fechaPub = new Date();
		double salario = 90000;
		boolean vigente = true;
		
		model.addAttribute("nombre", nombre);
		model.addAttribute("fechaPub", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		
		return "home";
	}
}
