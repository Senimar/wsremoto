package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {

	/*
	 * boolean : dado l�gico (true/false)
	 * char : 1 caracter
	 * ======Inteiros======
	 * byte : -127/+128
	 * short : -32.000/+32.000
	 * int : -2T/+2T
	 * long : 9....
	 * ======================
	 * float :
	 * double : maior exatid�o nas casas decimais	
	 */
		
	/*
	 * Capturem:
	 *      - qtde de computadores que existem no Itau
	 *      - Valor medio de cada computador
	 * Sa�da:
	 *      - Exibir o total
	 *      - Exibir o valor m�dio com 10% de desconto
	 */
	
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		float total = qtde*valor;
		float valorDesconto = valor * (float) 0.9;
		// Cast => reduz o tipo de dado na hierarquia
		
		System.out.println("Total....: " + total);
		System.out.println("Desconto.: " + valorDesconto);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
