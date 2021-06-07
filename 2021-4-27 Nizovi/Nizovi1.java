package domaciFunkcijeNizovi;

import java.util.Scanner;

public class Nizovi1 {

	public static void main(String[] args) {
		/*1.Napisti program koji sa standardnog ulaza ucitava duzinu i elemente niza koji su tipa int.
Zatim niz proslediti metodi koja treba da proveri da li je niz palindrom ili nije. 
Na standradnom izlazu obavestiti krajnjeg korisnika njemu razumljivim tekstom da li je unesen niz palindrom.
Primer ucitanog niza koji je palindrom: 12 46 17 46 12
Primer ucitanog niza koji nije palindrom: 12 46 17 12 64*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int duzina = sc.nextInt();
		
		int[] niz = new int[duzina];
		

		for(int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i+ 1)  + ". element niza");
			niz[i] = sc.nextInt();	
		}
	     if(ispisNiza(niz)) {
	    	 System.out.println("Uneti niz je palindrom");
	     }
	     else {
	    	 System.out.println("Uneti niz nije palindrom");
	     }  	 
	}	 	 
		public static boolean ispisNiza(int[] nizic) {
		int[]nizic1=new int[nizic.length];
		for(int i = 0; i<nizic.length;i++) {
			nizic1[i]=nizic[nizic.length-i-1];
		}
		for(int i=0; i<nizic.length;i++) {
			if(nizic[i] !=nizic1[i]) {
				return false;
			}
		}
		return true;	
		}

	}


