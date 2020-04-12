package br.com.faspinheiro.projetojavarest.negocio;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "TItem")
public class ItemPedido{	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	private Integer quantidade;
	@OneToOne(
			fetch = FetchType.EAGER,
			cascade = CascadeType.DETACH
			)
	@JoinColumn(name = "idProduto")
	private Produto produto;
	@ManyToOne
	@JoinColumn(name = "idPedido")
	@JsonBackReference
	private Pedido pedido;
	
	public ItemPedido() {
		
	}

	public ItemPedido(Integer quantidade, Produto produto, Pedido pedido) {
		super();
		this.quantidade = quantidade;
		this.produto = produto;
		this.pedido = pedido;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void incluiProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void associaPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	public double getValor() {		
		return produto.getPreco() * this.quantidade;
	}
	
	@Override
	public String toString() {
		return String.format("%s\nQuantidade: %d\nValor do item: R$ %.2f", 
				this.getProduto(),
				this.getQuantidade(),
				this.getValor());
	}
	
}
	
