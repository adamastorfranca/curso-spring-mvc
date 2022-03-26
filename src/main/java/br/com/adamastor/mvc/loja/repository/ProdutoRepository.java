package br.com.adamastor.mvc.loja.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.adamastor.mvc.loja.model.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long>{
	
	List<Produto> findAll();
	List<Produto> findByCategoriaNome(String nome);

}
