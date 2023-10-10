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
		Portfolio a= new Portfolio();
	do {
		System.out.println("\n\n\n\n\n\n\n\n\n");
		System.out.println("Gestione Prodotti\n");
		System.out.println("1- Visualizza prodotto");
		System.out.println("2- Carica prodotti");
		System.out.println("3- Salva prodotto");
		System.out.println("4- Aggiungi prodotto");
		System.out.println("5- Visualizza Clienti");
		System.out.println("6- Carica Clienti");
		System.out.println("7- Salva Clienti");
		System.out.println("8- Aggiungi Clienti");
		System.out.println("\n9- Esci");
		System.out.println("Inserisci la tua scelta: ");
		risp=sc.nextLine();
		
		switch(risp) {
		case"1":
			for(Prodotto p:n.elencoProdotti()) {
				System.out.println("Prodotto: "+p.getNome());
				System.out.println("Prezzo:   "+p.getPrezzo());
				System.out.println("Quantit�: "+p.getQuantit�());
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
			System.out.print("Inserisci la quantit�: ");
			nuovoProd.setQuantit�(Integer.parseInt(sc.nextLine()));
			n.aggiungiProdotto(nuovoProd);
			break;
		case "5":
			for(Cliente c:a.elencoClienti()) {
				System.out.println("Cognome Cliente: "+c.getCognome());
				System.out.println("Nome Cliente:    "+c.getNome());
				System.out.println("Numero Cliente:  "+c.getNumero());
			}
			break;
		case "6":
			a.carica("clienti.csv");
			break;
		case "7":
			a.salva("clienti.csv");
			break;
		case "8":
			Cliente nuovoCliente=new Cliente();
			System.out.println("Inserisci il Cognome del Cliente: ");
			nuovoCliente.setCognome(sc.nextLine());
			System.out.println("Inserisci il Nome del Cliente: ");
			nuovoCliente.setNome(sc.nextLine());
			System.out.println("Inserisci il Numero del Cliente: ");
			nuovoCliente.setNumero(Integer.parseInt(sc.nextLine()));
			a.aggiungiCliente(nuovoCliente);
			break;
		case "9":
			System.out.println("Arrivederci...");
			break;
		default:
			System.out.println("Scelta non valida.");
		}		
		System.out.println("Premi Enter per continuare...");
		sc.nextLine();
	}while(!risp.equals("9"));
   }
}
