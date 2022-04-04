package br.com.adamastor.mvc.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.adamastor.mvc.loja.model.Produto;
import br.com.adamastor.mvc.loja.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public String listarTodos(Model model) {		
		List<Produto> produtos = produtoService.listarTodos();
		model.addAttribute("produtos", produtos);
		
		return "produto/produtos";
	}
	
	@GetMapping("/categoria/{nome}")
	public String listarPorCategoria(@PathVariable String nome, Model model) {		
		List<Produto> produtos = produtoService.listarPorCategoria(nome);
		model.addAttribute("produtos", produtos);
		
		return "produto/produtos";
	}
	
}
