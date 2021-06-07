package cetvrtiProjekat;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		/*Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” 
		 * onoliko puta koliko je korisnik zadao preko konzole.
		 * Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta 
		 */
		
		int broj;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Unesi broj:");
	       broj=sc.nextInt();
		 
        int brojac = 1;
		
		do {
			System.out.println("Laku noc!");
			brojac++;
		} while (broj >= brojac );
		  
	}

}
