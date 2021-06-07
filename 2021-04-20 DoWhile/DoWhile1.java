package cetvrtiProjekat;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		/*Napisati program koji ce omoguciti Peri da unese sa koliko novca raspolaze. 
On moze da kupuje sve dok mu ne ostane samo 89 dinara jer mu toliko novca treba da kupi BUSPLUS kartu i vrati se kuci sa novogodisnjim poklonima. 
Pera treba  da unosi pojedinacne cene poklona, a program treba da ga obavesti kada potrosi sav predvidjeni novac, 
to jest kada za sledeci poklon vise nema kinte.*/
		
		
		double suma;
		double poklon = 0;
		double karta = 89;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko para imate:");
		suma = sc.nextDouble();
				
		do {
			suma=suma - poklon;
			if (suma < karta) 
				System.out.println("Nemate dovoljno para");
			
			if (suma > karta) 
				System.out.println("Ostalo Vam je jos " + (suma - karta));
			
			System.out.println("Poklon kosta:");
				poklon = sc.nextDouble();
		}while(suma >= karta);
		        
			System.out.println("Dovidjenja");
			
	}

}
