package domaciFunkcijeNizovi;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {
		/*Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * i taj program treba da pozove i vrati (u mainu) proizvod unetih brojeva.
		 */

		Scanner sc= new Scanner(System.in);
		int[] niz = new int[3];
		for(int i=0; i < 3;i++) {
			System.out.println("Unesite " + (i+ 1)  + ". broj od 3.");
			niz[i] = sc.nextInt();
			}
		
		int pro = proizvodBrojeva(niz);
		System.out.println("Proizvod brojeva je: " + pro);

	}

	public static int proizvodBrojeva(int[]niz) {
		int proizvod=1;
		for(int i = 0; i<niz.length; i++) {
		proizvod=proizvod*niz[i];	
		}
		return proizvod;
	}

}
