package Persona;

public class TestMain {

	public static void main(String[] args) {
		Studente s1=new Studente("Viviana ","Vacirca",24.5);//creo oggetto studente
		//da s1 prendo nom cognome e media
		System.out.println(s1.toString());
		
		Docente d1=new Docente("Massimo","Poncino",2000);
		System.out.println(d1.getNome()+" "+d1.getCognome()+" "+d1.getStipendio());
		
		
		
		
		
	}

}
