package edu.iisvolta;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Negozio {
		private ArrayList<Prodotto> elencoProdotti = new ArrayList <Prodotto>(); //Lista dinamica
		
		public void aggiungiProdotto(Prodotto p) {
			if (p.getPrezzo()>0 &&
					p.getQuantità()>0 &&
					p.getNome().length()>0)
			elencoProdotti.add(p);
		}
		//*****SCRITTURA DI UN FILE USA L'ARRAY LIST*****
		public void salva(String nomeFile) {
			try {
				FileWriter fw =new FileWriter("prodotti.csv");//il file viene creato nella stessa cartella del progetto
				for(Prodotto p:elencoProdotti)// scorre la lista e aggiorna i prodotti
					fw.write(p.getNome()+";"
							+p.getPrezzo()+";"
							+p.getQuantità()+"\n");
				fw.close(); 		// ricordarsi sempre di chiudere il file
				System.out.println("File correttamente creato"); 
			} catch (IOException e) { //subentra solo in caso di eccezione (errore)
				System.out.println("Si è verificato un errore in fase di creazione file!");
				e.printStackTrace();
			}
		}
		public void carica(String nomeFile) {
			//*****  LETTURA DA UN FILE *****
			File f=new File(nomeFile);
			String[] dati;
			try {
				Scanner sc=new Scanner(f);		//questo scanner non legge dalla tastiera, bensì dal file f
				String riga;
				while (sc.hasNextLine()) { //ripeti finché ci sono righe da leggere
					riga=sc.nextLine();		//leggi una riga dal file
					dati=riga.split(";");	//divide la stringa in più pezzi usando il carattere ";" come separatore
					Prodotto p=new Prodotto();
					p.setNome(dati[0]);
					p.setPrezzo(Double.parseDouble(dati[1]));
					p.setQuantità(Integer.parseInt(dati[2]));
					elencoProdotti.add(p);		//aggiungo il prodotto alla lista
				}
				sc.close();  //chiudi il file
				System.out.println("\n\nLettura terminata.");
			} catch (FileNotFoundException e) {
				System.out.println("Si è verificato un errore in fase di lettura!"); 
				e.printStackTrace();
			}
		}
		
		public Iterable<Prodotto> elencoProdotti(){//concede solo la lettura
			return this.elencoProdotti()
;		}
}
 