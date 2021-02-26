package br.com.ecommerce.modelo;
/*
 * Design Pattern - Compilado com as melhores práticas para OO
 * DTO (Data Transfer Object)
 * Recomendações:
 * 1º TODOS os atributos dever ser privados
 * 2º CADA atributo deve possuir um método para input e outro método para output
 * 3º ??????
 */
public class Produto {

	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	
	
	public void ajustarValores(float porc) {
		valorCompra = valorCompra + valorCompra * (porc/100);
		valorVenda = valorVenda + valorVenda * (porc/100);		
	}
	
	
	
	public String verificarEstoque() {
		if (qtde<5) {
			return "Estoque Baixo";
		}else if(qtde>10) {
		return "Estoque Alto";
		}else {
		return "Estoque Médio";
		
		
	}		
}
	
	public void setAll(int i, String d, float vc, float vv, int q) {
		id=i;
		descricao=d;
		valorCompra=vc;
		valorVenda=vv;
		qtde=q;
	}
		
	
	public String getResumo() {
		return 
				"Descrição...: " + descricao + "\n" +
				"Valor Venda.: " + valorVenda + "\n" +
				"Qtde........: " + qtde;
	}
	
	
	
	public float getDesconto() {
		return valorVenda * (float) 0.9;
		
	}
	
	
	
	public float getTotalCompra() {
	
		return valorCompra*qtde;
	}
	
	public float getTotalCompra(float frete) {
		return valorCompra * qtde + frete;
		
	
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
		
	
	
	
	
	
	
}
