package br.com.faspinheiro.projetojavarest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavarest.negocio.Livro;
import br.com.faspinheiro.projetojavarest.repository.ILivroRepository;

@Service
public class LivroService {
	
	@Autowired
	private ILivroRepository repositorio;
	
	public List<Livro> obterTodos(){		
		return (List<Livro>) repositorio.findAll();
	}
	
	public Optional<Livro> obterLivro(Integer id) {		
		return repositorio.findById(id);
	}
	
	public void incluir(Livro livro) {
		repositorio.save(livro);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public ILivroRepository getRepository() {
		return repositorio;
	}
	public void setRepository(ILivroRepository repository) {
		this.repositorio = repository;
	}

}
