package br.com.adamastor.mvc.loja.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate data = LocalDate.now();
	private BigDecimal valorTotal = BigDecimal.ZERO;
	@ManyToOne
	private Cliente cliente;
	@OneToMany(cascade = CascadeType.ALL)
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();

}
