package Biblioteca;


import java.util.ArrayList;

import java.util.List;




import Persona.Persona;

public class Utente extends Persona{
	//attributo in più
	
	private List<Prestito> libriInPrestito=new ArrayList<>();
	
	
	
	
	//costruttore1
public Utente () {
		
	}
//costruttore2

public Utente (String nome,String cognome) {
	super(nome,cognome);
	
}

public List<Prestito> getLibriInPrestito() {
	return libriInPrestito;
}

public void setLibriInPrestito(List<Prestito> libriInPrestito) {
	this.libriInPrestito = libriInPrestito;
}
public void InserisciPrestito(Prestito p){
	libriInPrestito.add(p);
	
}




}
