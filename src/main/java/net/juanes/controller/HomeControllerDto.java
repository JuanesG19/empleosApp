package net.juanes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerDto {

	@GetMapping("/")
	public String mostrarHome() {
		return "home";
	}
}
