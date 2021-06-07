package klase;

public class Voznja {

	public static void main(String[] args) {
		/*vozilo  - Napisati klasu Automobil. Automobil ima 
		1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
		2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
		3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
		Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku        
		Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila. 
		Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.*/

		Automobil a1=new Automobil("Audi","A4",123456789);
		Automobil a2=new Automobil("BMW","318i");
		Automobil a3=new Automobil("Mercedes-Benz","S 400 D 4M LONG",789654123);
		
		a1.setVlasnik1("IT Bootcamp");
		
		String markaPrvogAutomobila=a1.getMarka();
		String modelPrvogAutomobila=a1.getModel();
		int serijskiBrojPrvogAutomobila=a1.getSerijskiBroj();
		
		System.out.println("Marka: " + markaPrvogAutomobila);
		System.out.println("Model: " + modelPrvogAutomobila);
		System.out.println("Serijski broj: " + serijskiBrojPrvogAutomobila);
		System.out.println("Vlasnik: " + a1.getVlasnik1());
		
		a3.setVlasnik1("IT Bootcamp");
		a3.setVlasnik2("Ljiljana Randjelov");
		a3.setVlasnik3("Tijana Kusljevic");
		a3.setVlasnik4("Barbara Petrovic");
		
		String markaTrecegAutomobila=a3.getMarka();
		String modelTrecegAutomobila=a3.getModel();
		int serijskiBrojTrecegAutomobila=a3.getSerijskiBroj();
		
		System.out.println("Marka: " + markaTrecegAutomobila);
		System.out.println("Model: " + modelTrecegAutomobila);
		System.out.println("Serijski broj: " + serijskiBrojTrecegAutomobila);
		System.out.println("Vlasnik: " + a3.getVlasnik1() + ", " + a3.getVlasnik2() + ", " + a3.getVlasnik3() + ", " + a3.getVlasnik4());
		
		a1.setVlasnik1("Uros Ciric");
		
		System.out.println("Marka: " + markaPrvogAutomobila);
		System.out.println("Model: " + modelPrvogAutomobila);
		System.out.println("Serijski broj: " + serijskiBrojPrvogAutomobila);
		System.out.println("Vlasnik: " + a1.getVlasnik1());
		
        a2.setVlasnik2("Ljiljana Randjelov");
        String markaDrugogAutomobila=a2.getMarka();
		String modelDrugogAutomobila=a2.getModel();
		int serijskiBrojDrugogAutomobila=a2.getSerijskiBroj();
		
		System.out.println("Marka: " + markaDrugogAutomobila);
		System.out.println("Model: " + modelDrugogAutomobila);
		System.out.println("Serijski broj: " + serijskiBrojDrugogAutomobila);
		System.out.println("Vlasnik: " + a2.getVlasnik2());
		
		Automobil a4=new Automobil("Peugot", 951159951);
		
		a4.setVlasnik4("Barbara Petrovic");
		String markaCetvrtogAutomobila=a4.getMarka();
		int serijskiBrojCetvrtogAutomobila=a4.getSerijskiBroj();
		System.out.println("Marka: " + markaCetvrtogAutomobila);
		System.out.println("Serijski broj: " + serijskiBrojCetvrtogAutomobila);
		System.out.println("Vlasnik: " + a4.getVlasnik4());
		
		
	}

}
