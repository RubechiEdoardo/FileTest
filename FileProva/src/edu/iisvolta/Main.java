package edu.iisvolta;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//***** SCFRITTURA SU UN FILE *****
		try {
			FileWriter fw =new FileWriter("prodotti.csv");//il file viene creato nella stessa cartella del progetto
			fw.write("Pane;3.50;20\n"); // ogni isctruzione scrive una riga nel file
			fw.write("Pasta;1.60;45\n");
			fw.write("Biscotti;4.70;80\n");
			fw.write("Salame;35;37\n");
			fw.close(); 		// ricordarsi sempre di chiudere il file
			System.out.println("File correttamente creato"); 
		} catch (IOException e) { //subentra solo in caso di eccezione (errore)
			System.out.println("Si è verificato un errore in fase di creazione file!");
			e.printStackTrace();
		}

		//***** LEGGERE DA UN FILE *****
		File f= new File ("Prodotti.csv");
		String[] dati;  //si crea un vettore
		try {
			Scanner sc = new Scanner (f); // questo tipo di scanner legge direttamente dal file una riga alla volta senza inserire manualmente gli input
			String riga;
			while (sc.hasNextLine()) { //hasNextLine = Funzione Booleana. Ripeti finché ci sono altre righe da leggere
				riga = sc.nextLine();  //Leggi una riga dal file
				dati=riga.split(";"); //divide la riga usando il carattere nelle parentesi come separatore
				System.out.println("Trovato prodotto: ");
				System.out.println("        Nome:     "+dati[0]);
				System.out.println("        Prezzo:   "+dati[1]);
				System.out.println("        Quantità: "+dati[2]);
				System.out.println();
			}
			sc.close(); // Chiudi il file
			System.out.println("\n\nLettura terminata.");
		} catch (FileNotFoundException e) {
			System.out.println("Errore lettura.");
			e.printStackTrace();
		}
	}
		
}
