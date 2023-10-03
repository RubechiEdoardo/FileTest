package edu.iisvolta;

public class Cliente {
	private int numero;
	private String nome;
	private String cognome;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int numero, String nome, String cognome) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.cognome = cognome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}
