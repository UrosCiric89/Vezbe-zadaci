package klase;

import java.util.Scanner;

public class Fudbaleri {

	public static void main(String[] args) {
		/*sport - Napisati klasu Sportista. Sportista ima
		1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
		2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
		3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
		4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi. 

		Napisati glavni program koji kreira tri igraca. 
		U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
		*/
		
		Sportista s1=new Sportista("Zlatan Ibrahimovic", "Fudbal");
		Sportista s2=new Sportista("Francesco Totti", "Fudbal");
		Sportista s3=new Sportista("Aleksandar Mitrovic", "Fudbal");
		
		String imeIprezimePrvog=s1.getImeIprezime();
		String imeIprezimeDrugog=s2.getImeIprezime();
		String imeIprezimeTreceg=s3.getImeIprezime();
		String SportPrvog=s3.getSport();
		String SportDrugog=s3.getSport();
		String SportTreceg=s3.getSport();
		
		
		s1.setKlub("Milan");
		s2.setKlub("Roma");
		s3.setKlub("Fulham");
		s1.setBrojDresa(11);
		s2.setBrojDresa(10);
		s3.setBrojDresa(9);
		
		String klubPrvog=s1.getKlub();
		String klubDrugog=s2.getKlub();
		String klubTreceg=s3.getKlub();
		
		int brojDresaPrvog=s1.getBrojDresa();
		int brojDresaDrugog=s2.getBrojDresa();
		int brojDresaTreceg=s3.getBrojDresa();
		
		System.out.println("Igrac: " + imeIprezimePrvog );
		System.out.println("Sport: " + SportPrvog);
		System.out.println("Klub: " + klubPrvog);
		System.out.println("Broj dresa: " + brojDresaPrvog);
		System.out.println("---------------------");
		System.out.println("Igrac: " + imeIprezimeDrugog );
		System.out.println("Sport: " + SportDrugog);
		System.out.println("Klub: " + klubDrugog);
		System.out.println("Broj dresa: " + brojDresaDrugog);
		System.out.println("---------------------");
		System.out.println("Igrac: " + imeIprezimeTreceg );
		System.out.println("Sport: " + SportTreceg);
		System.out.println("Klub: " + klubTreceg);
		System.out.println("Broj dresa: " + brojDresaTreceg);
		
	}

}
