package ar.edu.unju.fi.tpf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	//============================ Metodo para ingresar al home Principal ============================
	@GetMapping("/index")
	public String getIndex() {
		return "index";
	}
	
}
