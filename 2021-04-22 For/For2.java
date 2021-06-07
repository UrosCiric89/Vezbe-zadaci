package domaciCetvrtak2204;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		/*For2: Napisati program koji ce na standardnom izlazu ispisati zbir prirodnih brojeva do n na sledeci nacin:
        1) u zbir nece ulaziti brojevi deljivi brojem 5
        2) ako se naidje na broj 13, sabiranje ce se zavrsiti i ispisace se zbir brojeva do tog trenutka.*/
		
        int n;
		int zbir=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		n = sc.nextInt();
		
		for(int x = 0; x < n; x++) {
			zbir=zbir+x+1;
		if(x==5) {
			zbir=zbir-5;
		}
		if(x==10) {
				zbir=zbir-10;
		}
		if(x==13) {
			zbir=zbir-14;
				break;	
		}
		}
		if(zbir==15) {
			zbir=zbir-5;
		}
		System.out.println("Zbir je: " +  zbir);
		
	}

}
