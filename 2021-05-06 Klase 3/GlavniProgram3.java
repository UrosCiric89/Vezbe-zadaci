package domaciKlase;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram3 {

	public static void main(String[] args) {
		/*Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika. 
		 * Putnici imaju ime, prezime i broj pasosa.
	U glavnom programu se igrati i testirati napisane klase.
	Obavezni deo: napraviti bar 3 razlicita putovanja. 
	Po zelji staviti putovanja u listu koja se zove ponuda. Jednom putovanju bar promeniti cenu aranzmana. 
	Izbaciti jedno putovanje iz ponude.
	Sa putovanja izbaciti jednog od putnika.
	Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka*/
		
		Putnici p1=new Putnici("Uros","Ciric",123456789);
		Putnici p2=new Putnici("Milos","Matic",123456789);
		Putnici p3=new Putnici("Marko","Cirovic",123456789);
		Putnici p4=new Putnici("Tijana","Cirkovic",123456789);
		Putnici p5=new Putnici("Jovana","Stojkovic",123456789);
		Putnici p6=new Putnici("Bojana","Ciric",123456789);
		Putnici p7=new Putnici("Jelena","Sundric",123456789);
		Putnici p8=new Putnici("Jovan","Miric",123456789);
		Putnici p9=new Putnici("Teodora","Tosovic",123456789);
		
		List<Putnici>listaPutnika=new ArrayList<Putnici>();
		List<Putnici>listaPutnika1=new ArrayList<Putnici>();
		List<Putnici>listaPutnika2=new ArrayList<Putnici>();
		listaPutnika.add(p1);
		listaPutnika.add(p2);
		listaPutnika.add(p3);
		listaPutnika.add(p4);
		listaPutnika1.add(p5);
		listaPutnika1.add(p6);
		listaPutnika1.add(p7);
		listaPutnika2.add(p8);
		listaPutnika2.add(p9);
		
		
		
		System.out.println(listaPutnika.size());
		System.out.println(listaPutnika1.size());
		System.out.println(listaPutnika2.size());
		
		Putovanje d1=new Putovanje("Egipat", 100000, listaPutnika);
		Putovanje d2=new Putovanje("Spanija", 90000, listaPutnika1);
		Putovanje d3=new Putovanje("Grcka", 40000, listaPutnika2);
		
		Ponuda d11=new Ponuda(d1);
		Ponuda d22=new Ponuda(d2);
		Ponuda d33=new Ponuda(d3);
		
		List<Ponuda>listaPonuda=new ArrayList<Ponuda>();
		listaPonuda.add(d11);
		listaPonuda.add(d22);
		listaPonuda.add(d33);
		
		System.out.println(d1.getDestinacija());
		System.out.println(d1.getCena());
		System.out.println("Lista putnika: ");
		System.out.println(listaPutnika.size());
		d1.setCena(95000);
		listaPutnika.remove(0);
		System.out.println(d1.getDestinacija());
		System.out.println("Cena sa popustom iznosi: " + d1.getCena());
		System.out.println("Lista putnika: ");
		System.out.println(listaPutnika.size());
		
		System.out.println(listaPonuda.size());
		listaPonuda.remove(1);
		System.out.println(listaPonuda.size());
		

	}

}
