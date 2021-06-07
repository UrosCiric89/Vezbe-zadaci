package domaciFunkcijeNizovi;

import java.util.Scanner;

public class Nizovi2 {

	public static void main(String[] args) {
		/*
2.Napisati program koji izracunava proizvod elemenata niza tipa int,  koji su veci od njihovog indeksa. 
Za unos niza i za proizvod koristiti zasebno metode. Duzina niza i unos niza ucitavaju se sa standardnog ulaza.
Primer ucitanog niza: 3 7 1 4 2 5
Primer izracunatog proizvoda: 84*/
		

		Scanner sc= new Scanner(System.in);
		int duzina;
		System.out.println("Unesite duzinu niza: ");
		duzina=sc.nextInt();
		
		int[] niz = new int [duzina];
		nizNizNiz(niz);
		int proizvod=proizvod(niz);
		System.out.println("Proizvod elemenata niza koji su veci od njihovog indeksa su: " + proizvod);
		
	}

	public static void nizNizNiz(int[] nizic) {
		for(int i=0; i < nizic.length; i++) {
			System.out.println("Unesite " + (i+1) + ". clan niza:");
			Scanner sc=new Scanner(System.in);
			nizic[i]=sc.nextInt();
		}
	}
	public static int proizvod(int[] pomnozi) {
		int proizvod=1;
		for(int i=0; i < pomnozi.length; i++) {
			if(pomnozi[i] > i) {
				proizvod=proizvod*pomnozi[i];
			}
		}
		return proizvod;
	}
}
