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
			FileWriter fw =new FileWriter("prodotti.txt");//il file viene creato nella stessa cartella del progetto
			fw.write("Pane\n"); // ogni isctruzione scrive una riga nel file
			fw.write("Pasta\n");
			fw.write("Biscotti\n");
			fw.write("Salame\n");
			fw.close(); 		// ricordarsi sempre di chiudere il file
			System.out.println("File correttamente creato"); 
		} catch (IOException e) { //subentra solo in caso di eccezione (errore)
			System.out.println("Si è verificato un errore in fase di creazione file!");
			e.printStackTrace();
		}

		//***** LEGGERE DA UN FILE *****
		File f= new File ("Prodotti.txt");
		try {
			Scanner sc = new Scanner (f); // questo tipo di scanner legge direttamente dal file una riga alla volta senza inserire manualmente gli input
			String riga;
			while (sc.hasNextLine()) { //hasNextLine = Funzione Booleana. Ripeti finché ci sono altre righe da leggere
				riga = sc.nextLine();  //Leggi una riga dal file
				System.out.println("Trovato prodotto: "+riga);
			}
			sc.close(); // Chiudi il file
			System.out.println("\n\nLettura terminata.");
		} catch (FileNotFoundException e) {
			System.out.println("Errore lettura.");
			e.printStackTrace();
		}
	}
		
}
