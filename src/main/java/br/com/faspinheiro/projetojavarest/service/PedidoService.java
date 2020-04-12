package br.com.faspinheiro.projetojavarest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavarest.negocio.Pedido;
import br.com.faspinheiro.projetojavarest.repository.IPedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private IPedidoRepository repositorio;
	
	public List<Pedido> obterTodos() {		
		return (List<Pedido>) repositorio.findAll();
	}
	
	public Optional<Pedido> obterPedido(Integer id){
		return repositorio.findById(id);
	}
	
	public void incluir(Pedido pedido) {
		repositorio.save(pedido);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}
	

	public IPedidoRepository getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IPedidoRepository repositorio) {
		this.repositorio = repositorio;
	}	

}
