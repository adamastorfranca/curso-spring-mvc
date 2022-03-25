package br.com.adamastor.mvc.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.adamastor.mvc.loja.model.Produto;
import br.com.adamastor.mvc.loja.service.ProdutoService;

@Controller
public class HomeController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		List<Produto> produtos = produtoService.listarTodos();
		model.addAttribute("produtos", produtos);
		
		return "home";
	}
	
}
