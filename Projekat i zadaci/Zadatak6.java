package projekatZadaci;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		/*Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
         Primer niza: 32 54 123 18
         Ispis: 18 123 54 32*/
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int duzina = sc.nextInt();
		
		int[] niz = new int[duzina];
		
		for(int i = 0; i < duzina; i++) {
			System.out.println("Unesite " + (i+ 1)  + ". element niza");
			niz[i] = sc.nextInt();	
		}
		
		System.out.print("Ispis niza obrnuto: " );
	    ispisNiza(niz);
	}	 	 
		public static void ispisNiza(int[] nizic) {
		int[]nizic1=new int[nizic.length];
		for(int i = 0; i<nizic.length;i++) {
			nizic1[i]=nizic[nizic.length-i-1];
			System.out.print(nizic1[i] + ", " );
		}
		
	}

}
