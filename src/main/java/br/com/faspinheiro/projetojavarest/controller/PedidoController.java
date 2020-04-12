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

import br.com.faspinheiro.projetojavarest.negocio.Pedido;
import br.com.faspinheiro.projetojavarest.service.PedidoService;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
	
	@Autowired
	private PedidoService servico;
	
	@GetMapping
	public List<Pedido> obterLista(){		
		return (List<Pedido>) servico.obterTodos();
	}
	
	@GetMapping("{id}")
	public Pedido obterUm(@PathVariable Integer id){		
		return servico.obterPedido(id).get();
	}
	
	@PostMapping
	public void incluir(@RequestBody Pedido pedido) {
		servico.incluir(pedido);		
	}
	
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id){		
		servico.excluir(id);
	}

	public PedidoService getServico() {
		return servico;
	}

	public void setServico(PedidoService servico) {
		this.servico = servico;
	}

}
