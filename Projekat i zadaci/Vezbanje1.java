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

		int izbor;
		double racun = 0;
		double artikli = 0;
		double suma = 0;

		do {
			System.out.println("MENI KASE");
			System.out.println("------------------------");
			System.out.println("Izaberi opciju:");
			System.out.println("------------------------");
			System.out.println("1 - Dodaj proizvod u korpu");
			System.out.println("2 - Naplata racuna");
			System.out.println("0 - Izlaz iz programa");
			System.out.println("------------------------");
			System.out.println("Vas racun za sada iznosi: " + racun);
			izbor = sc.nextInt();

			switch (izbor) {
			case 1:
				System.out.println("Unesite cenu proizvoda");
				artikli = sc.nextDouble();
				while (artikli <= 0) {
					System.out.println("Pogresan unos, pokusajte ponovo");
					System.out.println("Unesite cenu proizvoda:");
					artikli = sc.nextInt();
				}
				racun = racun + artikli;
				break;
			case 2:
				if (racun == 0) {
					System.out.println("Vasa korpa je prazna");
				} else {

					System.out.println("Vas racun iznosi " + racun);
					System.out.println("Unesite kolicinu novca za naplatu racuna: ");
					suma = sc.nextInt();

					if (suma == 0) {
						System.out.println("Ispraznili ste vasu korpu. Pokusajte opet");
						racun = 0;
						break;
					}
					while (suma < racun && suma != 0) {
						System.out.println("Niste uneli dovoljnu kolicinu novca");
						System.out.println("Vas racun iznosi " + racun);
						System.out.println("Unesite kolicinu novca za naplatu racuna: ");
						suma = sc.nextInt();
					}
					System.out.println("Vas kusur iznosi " + (suma - racun));
					racun = 0;
				}
				break;

			case 0:
				if (racun > 0) {
					System.out.println("Vas racun nije placen. Platite ili vratite. ");
					System.out.println("Ako zelite da vratite artikle odaberite opciju 2 a zatim unesite 0 ");
					izbor = 2;
				} else
					System.out.println("Dovidjenja");
				break;
			default:
				System.out.println("Pogresan unos. Pokusajte ponovo.");
				break;
			}
		} while (izbor != 0);
	}

}
