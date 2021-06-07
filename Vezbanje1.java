package domaciPetak2304;

import java.util.Scanner;

public class Vezbanje1 {

	public static void main(String[] args) {
		/*
		 * Vezbanje1: Napisati program koji ima meni za samousluznu kasu u prodavnici.
		 * Meni za potrosace sadrzi sledece opcije:
		 * 
		 * 0 - Izlaz iz programa (zatvaranje kase) 1 - dodavanje cene proizvoda na racun
		 * (ubacivanje u potrosacku korpu) 2 - naplata racuna
		 * 
		 * Ukoliko korisnik unese opciju 0 program se zavrsava. Ukoliko korisnik unese
		 * opciju 1 program pita korisnika da unese cenu proizvoda i ta cena se dodaje
		 * na racun u prodavnici. Ukoliko korisnik unese opciju 2 program pita korisnika
		 * da unese kolicinu novca za naplatu racuna. Ukoliko korisnik unese vrednost
		 * manju od vrednosti racuna, potrebno je da se ispise greska, bez umanjenja
		 * racuna i da se ponovo ispise meni.
		 * 
		 * Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se
		 * kusur i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.
		 */

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int x = 10;
		while (x > i) {

			System.out.println("Meni");
			System.out.println("----");
			System.out.println("Izaberite opciju");
			System.out.println("----");
			System.out.println("0 - Izlaz iz programa");
			System.out.println("1 - Dodaj proizvod");
			System.out.println("2 - Naplata racuna");

			int izbor = sc.nextInt();

			double racun = 0;

			switch (izbor) {
			case 0:
				System.out.println();
				break;
			case 1:
				System.out.println("Unesite cenu proizvoda");
				double cena = sc.nextDouble();
				racun = racun + cena;
				System.out.println("Vas trenutni racun iznosi: " + racun);
			case 2:
				System.out.println("Unesite kolicinu novca za naplatu racuna: ");
				double naplata = sc.nextDouble();

				if (naplata < racun)
					System.out.println("Greska");

				else if (naplata >= racun) {
					double kusur = naplata - racun;
					System.out.println("Vas kusur iznosi: " + kusur);
					racun = 0;
					break;
				}
			}
		}

	}

}
