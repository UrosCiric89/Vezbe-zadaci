package domaciCetvrtak2204;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		/*Dodatni neobavezni  For3: 
Napraviti program koji ce odstampati na standardnom izlazu trougao od zvezdica. 
Ako je unet broj 5 (korisnik unosi broj), trougao ce izgledati ovako:

uneto:  * * * * *
   5    * * * *
        * * * 
        * *
        * 
                                                                                     */
		
		Scanner sc = new Scanner(System.in);
		
		    double broj=0;
			while (broj != 5) {
			System.out.println("Unesite broj:");
			broj=sc.nextInt();
	         }
		
		 for (int i=1; i<=5; i++) 
	        { 
	            for (int j=5; j>=i; j-- )
	            { 
	                System.out.print("* ");
	            } 
	  
	            System.out.println();
	         
		}

	}

}
