package br.com.faspinheiro.projetojavarest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavarest.negocio.Bebida;
import br.com.faspinheiro.projetojavarest.repository.IBebidaRepository;

@Service
public class BebidaService {
	
	@Autowired
	private IBebidaRepository repositorio;
	
	public List<Bebida> obterTodos(){		
		return (List<Bebida>) repositorio.findAll();
	}
	
	public Optional<Bebida> obterBebida(Integer id) {		
		return repositorio.findById(id);
	}
	
	public void incluir(Bebida bebida) {
		repositorio.save(bebida);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public IBebidaRepository getRepository() {
		return repositorio;
	}
	public void setRepository(IBebidaRepository repository) {
		this.repositorio = repository;
	}

}
