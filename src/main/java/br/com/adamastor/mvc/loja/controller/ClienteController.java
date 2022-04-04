package br.com.adamastor.mvc.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/cadastro")
	public String cadastro() {
		return "cliente/cadastroForm";
	}

}
