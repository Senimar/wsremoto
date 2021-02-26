package br.com.ecommerce.principal;

import br.com.ecommerce.modelo.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
	
		Cliente cliente = new Cliente(
				5,
				"REGINA",
				"cleberson@gama",
				"1234-5678"
				);
		
		System.out.println(cliente.getAll());
		System.out.println("Usuario: " + cliente.getUsuario());
		

	}

}
