package br.com.faspinheiro.projetojavarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.faspinheiro.projetojavarest.negocio.Pedido;

@Repository
public interface IPedidoRepository extends CrudRepository<Pedido, Integer> {

}
