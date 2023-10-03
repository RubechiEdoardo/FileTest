package edu.iisvolta;


public class Prodotto {
	private double prezzo;
	private int quantit�;
	private String nome;
	
	public Prodotto() {
		super();
	}
	
	public Prodotto(double prezzo, int quantit�, String nome) {
		super();
		this.prezzo = prezzo;
		this.quantit� = quantit�;
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
