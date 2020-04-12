package br.com.faspinheiro.projetojavarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.faspinheiro.projetojavarest.negocio.ItemPedido;

@Repository
public interface IItemPedidoRepository extends CrudRepository<ItemPedido, Integer> {

}
