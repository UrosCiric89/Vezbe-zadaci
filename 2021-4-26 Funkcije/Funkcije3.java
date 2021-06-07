package domaciFunkcijeNizovi;

import java.util.Scanner;

public class Funkcije3 {

	public static void main(String[] args) {
		/*DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima -> 
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * i poziva i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, 
		 * a druga vraca najveci od unetih brojeva.
		 */

		Scanner sc= new Scanner(System.in);
		
		int[] niz = new int[3];
		int zbir=0;
		for(int i = 0; i < 3; i++) {
			System.out.println("Unesite " + (i+ 1)  + ". element niza");
			niz[i] = sc.nextInt();
			zbir=zbir+niz[i];
			
		}
		int pobednikMax= maks(niz);
		System.out.println("Najveci element niza je: " + pobednikMax);
		System.out.println("Zbir element niza je: " + zbir);
	
	}
	public static int maks(int[] nizic) {
		int max = -1;
		
		for(int i = 0; i < nizic.length; i++) {
			if(nizic[i] > max) {
				max = nizic[i];
			}
			
		}
		
		return max;	
		
	}

}
