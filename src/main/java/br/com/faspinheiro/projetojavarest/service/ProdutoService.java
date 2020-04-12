package br.com.faspinheiro.projetojavarest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavarest.negocio.Produto;
import br.com.faspinheiro.projetojavarest.repository.IProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private IProdutoRepository repositorio;
	
	public List<Produto> obterTodos() {		
		return (List<Produto>) repositorio.findAll();
	}
	
	public Optional<Produto> obterProduto(Integer id){
		return repositorio.findById(id);
	}
	
	public void incluir(Produto produto) {
		repositorio.save(produto);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}
	

	public IProdutoRepository getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IProdutoRepository repositorio) {
		this.repositorio = repositorio;
	}	

}
