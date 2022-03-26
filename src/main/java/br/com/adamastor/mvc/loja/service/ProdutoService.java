package br.com.adamastor.mvc.loja.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.adamastor.mvc.loja.model.Produto;
import br.com.adamastor.mvc.loja.repository.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> listarTodos(){
		return produtoRepository.findAll();
	}
	
	public List<Produto> listarPorCategoria(String nome){
		return produtoRepository.findByCategoriaNome(nome);
	}
	

}
