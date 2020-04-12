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

import br.com.faspinheiro.projetojavarest.negocio.Computador;
import br.com.faspinheiro.projetojavarest.service.ComputadorService;

@RestController
@RequestMapping("/api/computador")
public class ComputadorController {
	
	@Autowired
	private ComputadorService servico;	
	
	@GetMapping
	public List<Computador> obterLista(){		
		return (List<Computador>) servico.obterTodos();
	}
	
	@GetMapping("{id}")
	public Computador obterUm(@PathVariable Integer id) {
		return servico.obterComputador(id).get();		
	}
	
	@PostMapping
	public void incluir(@RequestBody Computador computador) {
		servico.incluir(computador);		
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		servico.excluir(id);		
	}

	public ComputadorService getServico() {
		return servico;
	}

	public void setServico(ComputadorService servico) {
		this.servico = servico;
	}
}
