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

import br.com.faspinheiro.projetojavarest.negocio.Empresa;
import br.com.faspinheiro.projetojavarest.service.EmpresaService;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
	
	@Autowired
	private EmpresaService servico;	
	
	@GetMapping
	public List<Empresa> obterLista(){		
		return (List<Empresa>) servico.obterTodos();
	}
	
	@GetMapping("{id}")
	public Empresa obterUm(@PathVariable Integer id) {
		return servico.obterEmpresa(id).get();
	}
	
	@PostMapping
	public void incluir(@RequestBody Empresa empresa) {
		servico.incluir(empresa);
	}
	
	@DeleteMapping("{id}")
	public void excluir(@PathVariable Integer id) {
		servico.excluir(id);
	}

	public EmpresaService getServico() {
		return servico;
	}

	public void setServico(EmpresaService servico) {
		this.servico = servico;
	}

}
