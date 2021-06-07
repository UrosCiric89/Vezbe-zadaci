package cetvrtiProjekat;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		/*Napisati program koji ce korisniku ispisati poruku 
		 * da li je ceo pozitivan broj koji je uneo palindrom ili nije palindrom. 
		 */
		
	int n;
	int cilj = 0;
	
	int bravo=0;
	Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
     int n1=n;  
       do {
    	   cilj = n % 10;
    	   System.out.print(cilj);
    	   n = n / 10;
    	   
       }
		 while(n != 0);
		 if (cilj == (n * 10) + (n1 % 10)) {
  		   System.out.println(" Polindrom");
		 }
		 if (cilj != (n * 10) + (n1 % 10)) {
	  		   System.out.println(" Nije polindrom");
			 }
       

	}}
