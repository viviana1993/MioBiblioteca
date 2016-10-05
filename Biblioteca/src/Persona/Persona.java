package Persona;

public class Persona {
	//creo attributi
	protected String nome;//mi permette di mostrarlo solo alle classi che derivano da persona (studente e docente)
	protected String cognome;
	
	//creo il costruttore vuoto per poter istanziare l'oggetto anche al di fuori della classe
	public Persona(){
		
	}
	//creo il costruttore con tipi per poter istanziare l'oggetto anche al di fuori della classe con i dati che ho inserito
	public Persona(String nome,String cognome){
		
		this.setNome(nome);//inserisco il nome e lo assegno all'ogetto come nome
		this.setCognome(cognome);
		
	}
	
	
	//metodo per poter visualizzare e scrivere fuori dalla classe i dati(get set)
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	//altro metodo
	@Override
		public String toString(){
			
			return nome+" "+cognome;
			
		}
	
}
