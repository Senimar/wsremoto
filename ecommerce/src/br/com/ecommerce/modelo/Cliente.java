package br.com.ecommerce.modelo;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String fone;
	
	
	public String getUsuario() {
		if (email.contains("@")) {
			return email.substring(0,email.indexOf("0"));
		}
		return email;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", fone=" + fone + "]";
	}


	public Cliente(int id, String nome, String email, String fone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		
		
	}


	public Cliente() {
		super();
	}
	
}
	




