package domaciFunkcijeNizovi;

import java.util.Scanner;

public class Funkcije1 {

	public static void main(String[] args) {
		/*Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza 
		 * (znaci da korisnik unosi tri broja) i taj program treba da pozove i ispise (u mainu)
		 *  najmanji od ta tri unesena broja.
		 */

	Scanner sc= new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("Unesite tri broja za niz: ");
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		int pomocna=najmanji(a,b,c);
		System.out.println("Najmanji broj je: " + pomocna);
	}

	public static int najmanji(int br1, int br2, int br3) {
		int najmanji;
		if(br1<br2) {
			najmanji=br1;
		}
		else {
			najmanji=br2;
		}
		if(br3 < najmanji) {
			najmanji = br3;
		}
		return najmanji;
	}

	}
