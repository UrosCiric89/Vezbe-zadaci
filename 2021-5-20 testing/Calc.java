package domaci;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		System.out.println("Program za racunanje povrsine kruga, kvadrata i pravougaonika" );
		
		 Scanner sc = new Scanner(System.in);
	       String figura;
	       while (true) {
	    	   System.out.println("Unesite figuru za izracunavanje povrsine ili izadji za izlaz iz programa: ");
	           figura = sc.nextLine();
	           figura=figura.toLowerCase();
	           switch (figura) {
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
	       double r;
	       System.out.println("Unesite poluprecnik kruga: ");
	       r = sc.nextDouble();
	       if (r <= 0) {
	           System.out.println("Los unos!");
	           return;
	       }
	       System.out.println("Povrsina kruga je: " + pKruga(r));
	   }

	   public static void racunajPravougaonik() {
	       Scanner sc = new Scanner(System.in);
	       double a, b;
	       System.out.println("Unesite prvu stranicu pravougaonika: ");
	       a = sc.nextDouble();
	       System.out.println("Unesite drugu stranicu pravougaonika: ");
	       b = sc.nextDouble();
	       if (a <= 0 || b <= 0) {
	           System.out.println("Los unos!");
	           return;
	       }
	       System.out.println("Povrsina pravougaionika je: " + pPravougaonika(a, b));

	   }

	   public static void racunajKvadrat() {
	       Scanner sc = new Scanner(System.in);
	       double a;
	       System.out.println("Unesite stranicu kvadrata: ");
	       a = sc.nextDouble();
	       if (a <= 0) {
	           System.out.println("Los unos!");
	           return;
	       }
	       System.out.println("Povrsina kvadrata je: " + pKvadrata(a));

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
