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

import br.com.faspinheiro.projetojavarest.negocio.Bebida;
import br.com.faspinheiro.projetojavarest.service.BebidaService;

@RestController
@RequestMapping("/api/bebida")
public class BebidaController {
	
	@Autowired
	private BebidaService servico;	
	
	@GetMapping
	public List<Bebida> obterLista(){		
		return (List<Bebida>) servico.obterTodos();
	}
	
	@GetMapping("{id}")
	public Bebida obterUm(@PathVariable Integer id) {
		return servico.obterBebida(id).get();		
	}
	
	@PostMapping
	public void incluir(@RequestBody Bebida bebida) {
		servico.incluir(bebida);		
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		servico.excluir(id);		
	}

	public BebidaService getServico() {
		return servico;
	}

	public void setServico(BebidaService servico) {
		this.servico = servico;
	}
	
}
