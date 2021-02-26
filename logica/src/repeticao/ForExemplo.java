package repeticao;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
	/*
	 * For: proprio para situações onde não há interação com o usuário final
	 * Sintaxe:
	 * - definir o contador e o inicio
	 * - condição
	 * - como ele vai contar?
	 */
     int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
     // 7 x 1 = 7
	 // 7 x 2 = 14 (....)
	 for (int contador=1;contador<11;contador++) {
		 System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		 
	 	
		 
		 
		 
		 
	 }
	 
	}}