package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {
	
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
		int chute = 0;
		int contagem=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o valor"));
			
			contagem=contagem+1;
			//contagem++;
			//contagem+=1;
			
			if (chute>valor) {
				System.out.println("Voc� est� chutando alto");
			}else if(chute<valor) {
				System.out.println("Voc� est� chutando baixo");
			}
		}while(valor!=chute);
		
		System.out.println("Parab�ns voc� acertou com " + contagem + " tentativa(s)");
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
