package br.com.faspinheiro.projetojavarest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.faspinheiro.projetojavarest.negocio.Computador;

@Repository
public interface IComputadorRepository extends CrudRepository<Computador, Integer> {

}
