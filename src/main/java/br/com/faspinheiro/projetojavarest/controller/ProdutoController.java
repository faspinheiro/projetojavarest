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

import br.com.faspinheiro.projetojavarest.negocio.Produto;
import br.com.faspinheiro.projetojavarest.service.ProdutoService;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService servico;	
	
	@GetMapping
	public List<Produto> obterListaProduto(){		
		return (List<Produto>) servico.obterTodos();
	}
	
	@GetMapping("{id}")
	public Produto obterUm(@PathVariable Integer id) {		
		return servico.obterProduto(id).get();
	}
	
	@PostMapping
	public void incluirProduto(@RequestBody Produto produto) {
		servico.incluir(produto);		
	}
	
	@DeleteMapping("{id}")
	public void excluirProduto(@PathVariable Integer id) {
		servico.excluir(id);
	}

	public ProdutoService getServico() {
		return servico;
	}

	public void setServico(ProdutoService servico) {
		this.servico = servico;
	}
	
}
