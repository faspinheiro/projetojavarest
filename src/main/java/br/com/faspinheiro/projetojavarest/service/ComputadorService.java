package br.com.faspinheiro.projetojavarest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavarest.negocio.Computador;
import br.com.faspinheiro.projetojavarest.repository.IComputadorRepository;

@Service
public class ComputadorService {
	
	@Autowired
	private IComputadorRepository repositorio;
	
	public List<Computador> obterTodos(){		
		return (List<Computador>) repositorio.findAll();
	}
	
	public Optional<Computador> obterComputador(Integer id) {		
		return repositorio.findById(id);
	}
	
	public void incluir(Computador computador) {
		repositorio.save(computador);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public IComputadorRepository getRepository() {
		return repositorio;
	}
	public void setRepository(IComputadorRepository repository) {
		this.repositorio = repository;
	}

}
