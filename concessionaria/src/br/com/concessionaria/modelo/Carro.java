package br.com.concessionaria.modelo;

public class Carro {

	private float valor;
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;
	
	public String retornarResumo() {
		String strstatus = "LIGADO";
		if (status==false) {
			strstatus="DESLIGADO";
			
		}
		return "Modelo: " + modelo +
				"\nStatus: " + strstatus +
				"\nVelocidade: " + velocidadeAtual;
	
	}
	
	public void brecar(short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual-velocidade);
		}
	}
	
	public void acelerar(short velocidade) {
		if (status==true) {
			velocidadeAtual = (short) (velocidadeAtual + velocidade);
		}
	}
	public void desligar() {
		status=false;
		
	}
	
	public void ligar() {
		status=true;
		
	}
	
	public float retornarValor() {
		return valor;
	
	}
	
	public void preencherValor(float param) {
		if (param>0) {
			valor=param;
		}
	}
	
	public String retornarCor() {
		return cor;
		
	}
	//Sintaxe para os métodos
	// <modificador> <tipo do retorno>
	// 	  <nome do metodo> (<tipo do param> <nome do param>) {
	
	public void preencherCor(String param) {
		cor = param;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
