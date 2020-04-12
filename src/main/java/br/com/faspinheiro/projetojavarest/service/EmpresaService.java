package br.com.faspinheiro.projetojavarest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavarest.negocio.Empresa;
import br.com.faspinheiro.projetojavarest.repository.IEmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private IEmpresaRepository repositorio;
	
	public List<Empresa> obterTodos(){		
		return (List<Empresa>) repositorio.findAll();
	}
	
	public Optional<Empresa> obterEmpresa(Integer id) {		
		return repositorio.findById(id);
	}
	
	public void incluir(Empresa empresa) {
		repositorio.save(empresa);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}

	public IEmpresaRepository getRepository() {
		return repositorio;
	}
	public void setRepository(IEmpresaRepository repository) {
		this.repositorio = repository;
	}

}
