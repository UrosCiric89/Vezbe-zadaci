package projekatZadaci;

public class Zadatak2 {

	public static void main(String[] args) {
		/*Zadatak sa tehnickog intervjua: ako je x = 3, a y = 7, Napisati program tako da im se vrednosti zamene. 
		 * Dostaviti oba resenja, sa i bez uvodjenja novih promenljivih
		 */
		
		int x=3;
		int y=7;
		int z;
		z=x;
		x=y;
		y=z;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}

}
