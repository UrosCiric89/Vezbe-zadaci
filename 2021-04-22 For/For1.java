package domaciCetvrtak2204;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/*For1: Napisati program koji omoguciti korisniku da unosi recii, 
          sve dok ne unese rec �stop�, nebitno da li je koristio mala, 
       velika slova ili kombinaciju. Mozete pri radu koristiti petlju po izboru.*/
		
		
	
		Scanner sc = new Scanner(System.in);
		
		
		String rec = sc.nextLine();
		String zaustavljanje = "stop";
	
		
		while (!rec.equalsIgnoreCase (zaustavljanje)) {
			
		 System.out.println(rec);
		 rec = sc.nextLine();
		 
		
		}
		System.out.println("Zaustavljeno");
		
	}

	}
