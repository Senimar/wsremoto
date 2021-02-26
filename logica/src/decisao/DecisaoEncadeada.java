package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		
		String produto = JOptionPane.showInputDialog("Produto").toUpperCase();
		String genero = JOptionPane.showInputDialog("Genero").toUpperCase();
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		float valorUnitario = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		float taxa=0;
		if (genero.equals("ALIMENTICIO")) {
			if (qtde>100) {
				taxa = (float) 0.04;
			}else if (qtde<50) {
				taxa = (float) 0.05;
			}else {
				taxa = (float) 0.045;
			}
		}else if (genero.equals("ELETRONICO")) {
			if (qtde>100) {
				taxa = (float) 0.06;
			}else if (qtde<50) {
				taxa = (float) 0.07;
			}else {
				taxa = (float) 0.065;
			}
		}else {
			System.out.println("Categoria inválida.");
		}
		
		System.out.println("Valor com imposto: " + (valorUnitario + valorUnitario * taxa));
		
	}

}
