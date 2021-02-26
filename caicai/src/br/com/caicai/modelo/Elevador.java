package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private short andarAtual;
	private byte capacidadeMaxima;
	private byte qtdePessoas;
	
	public String exibirResumo() {
		return 
				"Nome: " + nome + "\n" +
				"Andar Atual: " + andarAtual + "\n" + 
				"Qtde Pessoas: " + qtdePessoas; 
	}
	
	public void subir(byte andar) {
		if ((andarAtual+andar)<=andarMaximo) {
			andarAtual+=andar;
		}
	}
	
	public void subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
		}
	}
	public String entrar(byte qtde) {
		byte total = (byte) (qtdePessoas+qtde);
		if (total<=capacidadeMaxima) {
			qtdePessoas+=qtde;
			return "Entrada realizada";
		}
		return "Entrada não realizada";
	}
	
	public String sair(byte qtde) {
		//if ((qtdePessoas-qtde)>=0) {
		//	
		//}
		if (qtdePessoas>=qtde) {
			qtdePessoas-=qtde;
			//qtdePessoas = qtdePessoas - qtde;
			return "Saida realizada";
		}
		return "Saída não realizada";	
	}
	
	public void descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			// andarAtual = andarAtual-1;
			// andarAtual-=1;
		}
	}
	

	
	public String retornarNome() {
		return nome;
	}
	
	public void preencherNome(String param) {
		nome=param.toUpperCase();
	}
	
	
	public void configurar(short maximo, short minimo, byte capacidade) {
		andarMaximo=maximo;
		andarMinimo=minimo;
		capacidadeMaxima=capacidade;
	}

	
	
}
