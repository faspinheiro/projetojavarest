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

import br.com.faspinheiro.projetojavarest.negocio.Livro;
import br.com.faspinheiro.projetojavarest.service.LivroService;

@RestController
@RequestMapping("/api/livro")
public class LivroController {
	
	@Autowired
	private LivroService servico;	
	
	@GetMapping
	public List<Livro> obterLista(){		
		return (List<Livro>) servico.obterTodos();
	}
	
	@GetMapping("{id}")
	public Livro obterUm(@PathVariable Integer id){		
		return servico.obterLivro(id).get();
	}
	
	@PostMapping
	public void incluirLivro(@RequestBody Livro livro) {
		servico.incluir(livro);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id){		
		servico.excluir(id);
	}

	public LivroService getServico() {
		return servico;
	}

	public void setServico(LivroService servico) {
		this.servico = servico;
	}
	
}
