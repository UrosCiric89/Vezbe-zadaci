package cetvrtiProjekat;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		/*While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, 
		 * i ispisuje njihov zbir (zbir pozitivnih brojeva).
		 * primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
		 */

		
		double broj=0;
		double zbir=0;
		double broj1;
		int brojbrojeva=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Unesi broj:");
	    
	    
	    
	      
	    while (broj >= 0) {
	    	if (broj > 0) {
	    		brojbrojeva = brojbrojeva + 1;

				if (brojbrojeva == 1) {
					System.out.println("Uneto brojeva.");
				}
				if (brojbrojeva >= 1) {
					System.out.println("Uneto brojeva " + brojbrojeva );
				}
				
			}
	    	broj=sc.nextDouble();
            zbir = broj + zbir;
            System.out.println("Unosi dalje:");
	        zbir = zbir + 1;
	        System.out.println(zbir);
	    	if (broj < 0) {
	    		broj = 0 + broj;
	    		break;
	    	
	    	
	        
	    }}
		 System.out.println(brojbrojeva);
	    System.out.println("Zbir je " + ((zbir - broj) - brojbrojeva));
	    	
		    	
	    
	}

}
