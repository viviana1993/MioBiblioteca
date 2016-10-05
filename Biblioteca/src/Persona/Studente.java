package Persona;


public class Studente extends Persona{
	
	//attributo in più
	private double media;
	
	//costruttore vuoto
	public Studente(){
		
	}
	
	
	//creo il costruttore con tipi per poter istanziare l'oggetto anche al di fuori della classe con i dati che ho inserito
	public Studente(String nome,String cognome,double media){
		
		super(nome,cognome);
		this.media=media;
		
		
		}
	//creo il metodo get set


	public double getMedia() {
		return media;
	}


	public void setMedia(double media) {
		this.media = media;
	}
	//altro metodo
	@Override
	
	public String toString(){
		
		return nome+" "+cognome+" ha una media del "+media;
		
	}
	
					

		}
