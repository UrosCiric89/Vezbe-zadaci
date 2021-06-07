package drugi;

import java.util.Scanner;

public class Dodatni {

	public static void main(String[] args) {
		/*Dodatni (neobavezni) zadatak Grananja4: 
		Napisati program koji na osnovu unete godine i meseca ispisuje koliko taj mesec ima dana. 
		(Vodite racuna o prestupnoj godini!)*/
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite godinu:");
		int godina =sc.nextInt();
		
		if (godina < 0) {
			System.out.println("Nevalidna vrednost!");
			 }
			System.out.println("Unesite redni broj meseca:");
			int mesec =sc.nextInt();
			switch (mesec) {
			case 1:
			 System.out.println("Januar , 31 dan");
			break;
			 case 2:
			if ((godina % 4 == 0 && godina % 100 != 0)
					 || godina % 400 == 0) 
				System.out.println("Februar , 29 dana");
			else
				System.out.println("Februar , 28 dana");
			break;
			 case 3:
				 System.out.println("Mart , 31 dan");
			 break;
			case 4:
				System.out.println("April , 30 dana");
			break;
			 case 5:
				 System.out.println("Maj, 31 dan");
			 break;
			case 6:
				System.out.println("Jun, 30 dana");
			break;
			 case 7:
				 System.out.println("Jul, 31 dan");
			 break;
			case 8:
				System.out.println("Avgust , 31 dan");
			break;
			 case 9:
				 System.out.println("Septembar , 30 dana");
			 break;
			case 10:
				System.out.println("Oktobar , 31 dan");
			break;
			 case 11:
				 System.out.println("Novembar , 30 dana");
			 break;
			case 12:
				System.out.println("Decembar , 31 dan");
			break;
			 default:
				 System.out.println("Lose unet redni broj meseca");
			 }
			 

	}

}
