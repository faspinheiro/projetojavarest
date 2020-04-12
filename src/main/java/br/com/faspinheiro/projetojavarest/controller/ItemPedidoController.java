package br.com.faspinheiro.projetojavarest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.faspinheiro.projetojavarest.negocio.ItemPedido;
import br.com.faspinheiro.projetojavarest.service.ItemPedidoService;

@RestController
@RequestMapping("/api/itempedido")
public class ItemPedidoController {
	
	@Autowired
	private ItemPedidoService servico;
	
	
	@GetMapping
	public List<ItemPedido> obterLista(){		
		return (List<ItemPedido>) servico.obterTodos();
	}
	
	@GetMapping("{id}")
	public ItemPedido obterUm(@PathVariable Integer id) {
		return servico.obterItemPedido(id).get();
	}
	
	@PostMapping
	public void incluir(@RequestBody ItemPedido item) {
		servico.incluir(item);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		servico.excluir(id);
	}

	public ItemPedidoService getServico() {
		return servico;
	}

	public void setServico(ItemPedidoService servico) {
		this.servico = servico;
	}

}
