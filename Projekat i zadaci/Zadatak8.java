package projekatZadaci;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		// Ispraviti greske u kodu:
		

	       //Ovaj kod predstavlja kalkulator povrsina
	       //kvadrata, pravougaonika i kruga.
	       //Povrsina se bira tako sto se unese kao tekst odgovarajuca figura.
	       //Ukoliko se unese 'izadji', program treba da se zavrsi.
	       //Program treba da se ponavlja dokle god se ne unese izadji.

	       Scanner sc = new Scanner(System.in);
	       String figura;
	       String pomocna;
	       while (true) {
	    	   System.out.println("Unesite figuru za proracunavanje povrsine: ");
	           figura = sc.nextLine();
	           pomocna=figura.toLowerCase();
	           switch (pomocna) {
	               case "kvadrat":
	                   racunajKvadrat();
	               case "pravougaonik":
	                   racunajPravougaonik();
	               case "krug":
	                   racunajKrug();
	               case "izadji":
	                   return;
	           }
	       }
	   }

	   public static void racunajKrug() {
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Unesite poluprecnik kruga: ");
	       double r;
	       r = sc.nextDouble();
	       while (r <= 0) {
	    	   System.out.println("Los unos!");
	    	   System.out.println("Unesite ponovo poluprecnik kruga: ");
	    	   r = sc.nextDouble();    
	       }
	       System.out.println("Povrsina kruga je: " + pKruga(r));
	       return;
	   }
	   

	   public static void racunajPravougaonik() {
	       Scanner sc = new Scanner(System.in);
	       double a, b;
	       System.out.println("Unesite duzinu stranice a: ");
	       a = sc.nextDouble();
	       while(a <= 0 ) {
	    	   System.out.println("Los unos!");
	    	   System.out.println("Unesite ponovo duzinu stranice a: ");
	    	   a = sc.nextDouble();
	       }
	       System.out.println("Unesite duzinu stranice b: ");
	       b = sc.nextDouble();
	       while( b <= 0 || a==b) {
	    	   System.out.println("Los unos!");
	    	   System.out.println("Unesite ponovo duzinu stranice b: ");
	    	   b = sc.nextDouble();
	       }     
	       System.out.println("Povrsina pravougaonika je: " + pPravougaonika(a, b));
	   
           return;
	   }

	   public static void racunajKvadrat() {
	       Scanner sc = new Scanner(System.in);
	       double a;
	       System.out.println("Unesite duzinu stranice kvadrata:  ");
	       a = sc.nextDouble();
	       while (a <= 0) {
	           System.out.println("Los unos!");
	           System.out.println("Unesite ponovo duzinu stranice kvadrata:  ");
	           a = sc.nextDouble();
	       }
	       System.out.println("Povrsina kvadrata je: " + pKvadrata(a));
           return;
	   }

	   public static double pKruga(double r) {
	       return r * r * 3.14;
	   }

	   public static double pKvadrata(double a) {
	       return a * a;
	   }

	   public static double pPravougaonika(double a, double b) {
	       return a * b;


	}

}
