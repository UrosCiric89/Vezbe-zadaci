package domaciKlase;

public class GlavniProgram2 {

	public static void main(String[] args) {
		/*Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se postavi. 
		 * Ispisati ceo objekat klase firma. Ispisati prezimena svih zaposlenih u firmi.

	Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja. 
	Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)

	Napisati glavni program, gde cete testirati kako ove klase funkcionisu.*/
		
		Zaposleni z1=new Zaposleni("Milan", "Mitic", "vlasnik", 150000 );
		Zaposleni z2=new Zaposleni("Jelena", "Milosevic", "Idm", 100000 );
		Zaposleni z3=new Zaposleni("Mila", "Ergic", "vozac", 50000 );
		Zaposleni z4=new Zaposleni("Bojana", "Stajkovic", "Dekorater", 150000 );
		Zaposleni z5=new Zaposleni("Petar", "Panic", "Bastovan", 20000 );
		Zaposleni z6=new Zaposleni("Mirko", "Mirkovic", "Direktor", 150000 );
		Zaposleni z7=new Zaposleni("Marko", "Miric", "pomocni radnik", 70000 );
		
		System.out.print(z1.getPrezime()+ ", ");
		System.out.print(z2.getPrezime()+ ", ");
		System.out.print(z3.getPrezime()+ ", ");
		System.out.print(z4.getPrezime()+ ", ");
		System.out.print(z5.getPrezime()+ ", ");
		System.out.print(z6.getPrezime()+ ", ");
		System.out.print(z7.getPrezime()+ " ");
		System.out.println();
		System.out.println("-------------------");
		
		
		Zaposleni[]zaposleni1= {z1,z2,z3};
		Zaposleni[]zaposleni2= {z4,z5};
		Zaposleni[]zaposleni3= {z6,z7};
		
		Firma f1= new Firma("Reca", "Beograd", 123456789, zaposleni1);
		Firma f2= new Firma("DekorBo", "Beograd", 987654321, zaposleni2);
		Firma f3= new Firma("PazPlam", "Beograd", 852045631, zaposleni3);
		
		System.out.print(f1.getNaziv() + ", ");
		System.out.print(f1.getSediste()+ ", ");
		System.out.print("PIB: " + f1.getPIB()+ ", ");
		System.out.println();
		System.out.println("Zaposleni u firmi su: ");
		System.out.print(z1.getIme()+ " ");
		System.out.print(z1.getPrezime()+ ", ");
	    System.out.println();
		System.out.print(z2.getIme()+ " ");
		System.out.print(z2.getPrezime()+ ", ");
		System.out.println();
		System.out.print(z3.getIme()+ " ");
		System.out.print(z3.getPrezime()+ " ");
		System.out.println();
		System.out.println("-------------------");
		System.out.print(f2.getNaziv() + ", ");
		System.out.print(f2.getSediste()+ ", ");
		System.out.print("PIB: " + f2.getPIB()+ ", ");
		System.out.println();
		System.out.println("Zaposleni u firmi su: ");
		System.out.print(z4.getIme()+ " ");
		System.out.print(z4.getPrezime()+ ", ");
	    System.out.println();
		System.out.print(z5.getIme()+ " ");
		System.out.print(z5.getPrezime()+ " ");
		System.out.println();
		System.out.println("-------------------");
		System.out.print(f3.getNaziv() + ", ");
		System.out.print(f3.getSediste()+ ", ");
		System.out.print("PIB: " + f3.getPIB()+ ", ");
		System.out.println();
		System.out.println("Zaposleni u firmi su: ");
		System.out.print(z6.getIme()+ " ");
		System.out.print(z6.getPrezime()+ ", ");
	    System.out.println();
		System.out.print(z7.getIme()+ " ");
		System.out.print(z7.getPrezime()+ " ");
		System.out.println();
		System.out.println("-------------------");
		System.out.println(z1.getZaposleni() + " " + "("+z1.getZarada()+")");
		System.out.println(z2.getZaposleni() + " " + "("+z2.getZarada()+")");
		System.out.println(z3.getZaposleni() + " " + "("+z3.getZarada()+")");
		System.out.println(z4.getZaposleni() + " " + "("+z4.getZarada()+")");
		System.out.println(z5.getZaposleni() + " " + "("+z5.getZarada()+")");
		System.out.println(z6.getZaposleni() + " " + "("+z6.getZarada()+")");
		System.out.println(z7.getZaposleni() + " " + "("+z7.getZarada()+")");
	}
}
