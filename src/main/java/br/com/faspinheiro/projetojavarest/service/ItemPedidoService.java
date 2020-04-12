package br.com.faspinheiro.projetojavarest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.faspinheiro.projetojavarest.negocio.ItemPedido;
import br.com.faspinheiro.projetojavarest.repository.IItemPedidoRepository;

@Service
public class ItemPedidoService {
	
	@Autowired
	private IItemPedidoRepository repositorio;
	
	public List<ItemPedido> obterTodos() {		
		return (List<ItemPedido>) repositorio.findAll();
	}
	
	public Optional<ItemPedido> obterItemPedido(Integer id){
		return repositorio.findById(id);
	}
	
	public void incluir(ItemPedido item) {
		repositorio.save(item);
	}
	
	public void excluir(Integer id) {
		repositorio.deleteById(id);
	}
	

	public IItemPedidoRepository getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(IItemPedidoRepository repositorio) {
		this.repositorio = repositorio;
	}	

}
