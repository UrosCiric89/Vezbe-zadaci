package drugi;

import java.util.Scanner;

public class Grananja1 {
	/*Grananja1: Napisati program koji proverava da li je uneti broj paran. 
     *Ukoliko jeste, program treba da ispise poruku: Broj je paran! 
     *Ukoliko nije, program treba da ispise poruku: Broj je neparan!
     */

	public static void main(String[] args) {
		
		System.out.println("Unesite paran broj");
		Scanner sc = new Scanner(System.in);
		int broj = sc.nextInt();
		
	     if (broj  % 2 == 0) {
			System.out.println("Broj je paran!");
		}
		else  {
			System.out.println("Broj je neparan!");
		}
		
	}

}
