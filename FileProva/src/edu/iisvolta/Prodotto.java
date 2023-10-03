package edu.iisvolta;


public class Prodotto {
	private double prezzo;
	private int quantità;
	private String nome;
	
	public Prodotto() {
		super();
	}
	
	public Prodotto(double prezzo, int quantità, String nome) {
		super();
		this.prezzo = prezzo;
		this.quantità = quantità;
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantità() {
		return quantità;
	}

	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
