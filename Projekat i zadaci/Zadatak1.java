package projekatZadaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*Napisati program koji ispisuje koliko cifara ima uneti broj n.*/
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Unesite broj: ");
			int broj = sc.nextInt();	
			int brojCifara = 0;
			while (broj > 0) {
			broj=broj / 10;
			brojCifara++;
			}
			System.out.println("Unet broj ima " + brojCifara + " cifara");

			
	}

}
