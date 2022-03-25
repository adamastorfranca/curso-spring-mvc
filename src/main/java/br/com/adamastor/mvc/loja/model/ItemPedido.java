package br.com.adamastor.mvc.loja.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private BigDecimal precoUnitario;
	private int quantidade;	
	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private Produto produto;


}
