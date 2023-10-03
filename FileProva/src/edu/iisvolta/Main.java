package edu.iisvolta;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String risp;
		Negozio n= new Negozio();
	do {
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println("Gestione Prodotti\n");
		System.out.println("1- Visualizza prodotto");
		System.out.println("2- Carica prodotti");
		System.out.println("3- Salva prodotto");
		System.out.println("4- Aggiungi prodotto");
		System.out.println("\n9- Esci");
		System.out.println("Inserisci la tua scelta: ");
		risp=sc.nextLine();
		switch(risp) {
		case"1":
			for(Prodotto p:n.elencoProdotti()) {
				System.out.println("Prodotto: "+p.getNome());
				System.out.println("Prezzo:   "+p.getPrezzo());
				System.out.println("Quantità: "+p.getQuantità());
			}
			break;
		case "2":
			n.carica("prodotti.csv");
			break;
		case "3":
			n.salva("prodotti.csv");
			break;
		case "4":
			Prodotto nuovoProd=new Prodotto();
			System.out.print("Inserisci la descrizione: ");
			nuovoProd.setNome(sc.nextLine());
			System.out.print("Inserisci il prezzo: ");
			nuovoProd.setPrezzo(Double.parseDouble(sc.nextLine()));
			System.out.print("Inserisci la quantità: ");
			nuovoProd.setQuantità(Integer.parseInt(sc.nextLine()));
			n.aggiungiProdotto(nuovoProd);
			break;
		case "9":
			System.out.println("Arrivederci...");
			break;
		default:
			System.out.println("Scelta non valida.");
		}
		
		
	}while(!risp.equals("9"));
   }
}
