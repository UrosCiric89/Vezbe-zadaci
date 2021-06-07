package projekatZadaci;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		// Sahovska tabla
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvi broj za piona (RED): ");
		int broj1 = sc.nextInt();
		System.out.println("Unesite drugi broj za piona (KOLONA): ");
		int broj2 = sc.nextInt();
		System.out.println("Unesite prvi broj za konja (RED): ");
		int broj3 = sc.nextInt();
		System.out.println("Unesite drugi broj za konja (KOLONA): ");
		int broj4 = sc.nextInt();

		
		 for (int i=1; i<=8; i++) 
	        {  
	            for (int j=1; j<=8; j++)
	            { 
	                 System.out.print(i*j+" ");
	            } 
	  
	            System.out.println();
	        } 
		 if (!(broj1==(broj3-1) && (broj2==(broj4-1)|| broj2==(broj4+1)))) {//Mislim da sam bio blizu al ponestalo mi je vremena posto mora da pet da se preda.
			 System.out.println("Lovac je ugrozen");               //Voleo bih samo da znam dal sam isao u pravom smeru ka resenju i dal je razmisljanje dobro?
			 System.out.println(broj1);
			 System.out.println(broj2);
			 System.out.println(broj3);
			 System.out.println(broj4);
		 }else {
			 System.out.println("Lovac nije ugrozen");
		 }

	}

}
