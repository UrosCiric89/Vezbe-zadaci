package projekatZadaci;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		/*Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
        Primer1 niza: 3 54 123 18
        Ispis: Niz nije rastuci.
        Primer2 niza: 71 422 1001 5054
        Ispis: Niz je rastuci.*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int duzina = sc.nextInt();

		int[] niz = new int[duzina];

		for (int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i + 1) + ". element niza");
			niz[i] = sc.nextInt();
		}
		if (ispisNiza(niz)) {
			System.out.println("Niz je rastuci");
		} else {
			System.out.println("Niz nije rastuci");
		}

	}

	public static boolean ispisNiza(int[] nizic) {

		for (int i = 0; i < nizic.length; i++) {

			for (int j = i + 1; j < nizic.length; j++) {

				if (nizic[i] > nizic[j]) {
					return false;

				}
			}
		}
		return true;

	}

}
