package drugi;

public class Grananja3 {

	public static void main(String[] args) {
		/*Grananja3: Napisati program koji na osnovu unetog naziva meseca 
        ispisuje koliko ima meseci u godini koji pocinju na to slovo(na taj glas) 
         - za resavanje ovog zadatka koristiti switch*/
		
	    String mesec = "decembar";
	    
        switch(mesec) {
        case "Januar":
        case "januar":
        case "Jun":
        case "jun":
        case "Jul":
        case "jul":
       	 System.out.println("Ima tri meseca koji pocinju na slovo J u godini");
            break;
        case "Februar":
        case "februar":
       	 System.out.println("Ima jedan mesec koji pocinje na slovo F u godini");
       	    break;
        case "Mart":
        case "mart":
        case "Maj":
        case "maj":
        	System.out.println("Ima dva meseca koji pocinju na slovo M u godini");
        	break;
        case "April":
        case "april":
        case "Avgust":
        case "avgust":
        	System.out.println("Ima dva meseca koji pocinju na slovo A u godini");
        	break;
        case "Septembar":
        case "septembar":
        	System.out.println("Ima jedan mesec koji pocinje na slovo S u godini");
        	break;
        case "Oktobar":
        case "oktobar":
        	System.out.println("Ima jedan mesec koji pocinje na slovo O u godini");
        	break;
        case "Novembar":
        case "novembar":
        	System.out.println("Ima jedan mesec koji pocinje na slovo N u godini");
        	break;
        case "Decembar":
        case "decembar":
        	System.out.println("Ima jedan mesec koji pocinje na slovo D u godini");
        	break;
       	 default:
       		 System.out.println("Nepostojeci mesec");
       	 
        }
	}

}
