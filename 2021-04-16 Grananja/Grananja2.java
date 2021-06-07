package drugi;

import java.util.Scanner;

public class Grananja2 {

	public static void main(String[] args) {
		/*Grananja2: Prvi domaci zadatak od 15.4.2021. uraditi ponovo, 
koristeci grananja kako bismo se ogradili od nemogucih izracunavanja povrsina 
(kakvi celi brojevi moraju da budu visina, sirina i duzina?)

Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije, 
tako sto se ivice prostorije ucitavaju preko konzole. 
(za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).*/

		
		Scanner sc = new Scanner(System.in);	
	    System.out.println("Uneti visinu prostorije:");
		int visina =sc.nextInt();
		if (visina <= 0) {
			System.out.println("Nevalidna vrednost!");
			}
		else if (visina > 0) {
			System.out.println("Uneti sirinu prostorije:");
		    }
		int sirina =sc.nextInt();
		if (sirina <= 0) {
			System.out.println("Nevalidna vrednost!");
			}
		else if (sirina > 0) {
			System.out.println("Uneti duzinu prostorije:");
		    }
		int duzina =sc.nextInt();
		if (duzina <= 0) {
			System.out.println("Nevalidna vrednost!");
			}
		else if (sirina > 0) {
		if (visina + sirina + duzina >= 3) {
			System.out.println("Povrsina okrecene prostorije je: " + 
		((duzina * visina + sirina * visina) * 2 + duzina * sirina));
		    }}
		
		}
	}


