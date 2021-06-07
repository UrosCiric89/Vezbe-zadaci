package projekatZadaci;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		/*Cest zadatak na intervjuu: Napisati program gde korisnik unosi n brojeva i ispisuje maksimalni i minimalni broj.*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int duzina = sc.nextInt();
		
		int[] niz = new int[duzina];
		
		for(int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i+ 1)  + ". element niza");
			niz[i] = sc.nextInt();	
			}
		System.out.println("Najmanji broj je " + min(niz));
		System.out.println("Najveci broj je " + max(niz));
	}
		public static int min(int[] niz) {
			int rezultat = niz[0];
			for (int i=1; i<niz.length; i++)
			if (niz[i] < rezultat)
			rezultat = niz[i];
			return rezultat;
			}
			public static int max(int[] niz) {
			int rezultat = niz[0];
			for (int i=1; i<niz.length; i++)
			if (niz[i] > rezultat)
			rezultat = niz[i];
			return rezultat;
		
		
		
		
		
		
	}
}
