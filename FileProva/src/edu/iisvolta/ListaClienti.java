package edu.iisvolta;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaClienti {
		private ArrayList<Cliente> elencoClienti= new ArrayList <Cliente>();
		
		public void aggiungiCliente (Cliente c) {
			if(c.getNome().length()>0 &&
			   c.getCognome().length()>0 &&
			   c.getNumero()>0)
				elencoClienti.add(c);
		}
		public void salva (String nomeFile) {
			try {
				FileWriter fw=new FileWriter("Clienti.csv");
				for(Cliente c:elencoClienti) {
					fw.write(c.setCognome()+";"
							 c.setNome()+";"
							 c.setNumero()"\n");
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
			
			public void carica (String nomeFile) {
				File f=new File(nomeFile);
				String[]dati;
		      try {
				Scanner sc=new Scanner(f);
		      	String riga;
		      	while(sc.hasNextLine()) {
		      		riga=sc.nextLine();
		      		dati=riga.split(";");
		      		Cliente c=new Cliente();
		      		c.setNome(dati[0]);
		      		c.setCognome(dati[1]);
		      		c.setNumero(Integer.parseInt(dati[2]));
		      		elencoClienti.add(c);
				}
		      	sc.close();
		      	System.out.println("\n\nLettura terminata");
				} catch (Exception e) {
					System.out.println("Si è verificato un errore in fase di lettura!"); 
					e.printStackTrace();
				}
			
		      public Iterable<Cliente> elencoClienti(){//concede solo la lettura
					return this.elencoClienti();
				}
			}
}
