package projekatZadaci;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		/*Napisati program koji racuna zbir prvih n prirodnih brojeva, 
		 * izostavljajuci one koji su deljivi brojem k.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj n: ");
		int n = sc.nextInt();
		System.out.println("Unesite broj k: ");
		int k = sc.nextInt();
		int zbir=0;
		for(int i=1; i <n; i++) {
			System.out.println(i);
			zbir=zbir+i;
			if (i % k==0 ) {
				zbir=zbir-i;
			}
		}
		System.out.println("zbir je: " + zbir);
		
		
		
		

	}

}
