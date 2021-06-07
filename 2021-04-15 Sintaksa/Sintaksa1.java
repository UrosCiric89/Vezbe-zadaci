package prvi;

import java.util.Scanner;

public class Sintaksa1 {

	public static void main(String[] args) {
		/*1-Zadatak: Napisati program koji ce racunati povrsinu okrecene prostorije, 
		 * tako sto ce ivice prostorije ucitavaju preko konzole 
		 * ( za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozore i vrata).
		 */
            
		Scanner sc = new Scanner(System.in);
		System.out.println("Uneti duzinu prostorije:");
		int a =sc.nextInt();
		System.out.println("Uneti sirinu prostorije:");
		int b =sc.nextInt();
		System.out.println("Uneti visinu prostorije:");
		int h =sc.nextInt();
		System.out.println("Povrsina okrecene prostorije je:" + ((a * h + b * h) * 2 + a * b));
	
	}

}
