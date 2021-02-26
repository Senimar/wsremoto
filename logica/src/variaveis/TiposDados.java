package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
	/*
	 * Classes Wrappers: apoiam os tipos primitivos
	 * int => Integer
	 * double => Double
	 * float => Float	
	 */
	String nome = JOptionPane.showInputDialog("Digite o seu nome");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
	double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
	double imc = peso / (altura * altura);
	
	System.out.println("Nome..: " + nome);
	System.out.println("Idade.: " + idade +  " anos.");
	System.out.println("Altura: " + altura);
	System.out.println("IMC...: " + imc);
	System.out.println("Nome:" + nome + "\nIdade: " + idade);
	
	/*
	 * Alfanumérico: é um dado que você não utiiza em operações
	 * aritméticas.
	 * CEP: ?0010-009 => 00010-009
	 * (em um contexto em que ele não esteja entre os dados mais críticos)
	 * String representa um dado alfanumérico no Java
	 * 
	 * Numérico: é o dado que pode ser utilizado em operações
	 * aritméticas e/ou for um dado critico para pesquisa.
	 * CEP: ?0010-009 => 1
	 * (em um contexto dos Correios, onde ele é um dado crítico)
	 * Dois tipos:
	 * - Inteiro que em Java é int
	 * - Real que em Java é double
	 */
		
		
		
		
		
		
		
	}}
		

		
		
		
		
	
		


