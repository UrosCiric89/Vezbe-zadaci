package domaciKlase;

public class GlavniProgram1 {

	public static void main(String[] args) {
		/*Dogadjaj

		Napraviti klasu Event koja sadrzi podatke o vremenu, dvorani u kojoj se dogadjaj organizuje i tip (koncert, utakmica, vencanje…)

		Napraviti klasu Dvorana koja sadrzi podatke o nazivu dvorane, gradu gde se nalazi i kapacitetu (broju mesta).

		Uvezati ove klase i u glavnom programu se igrati sa njima.*/
		
		Dvorana d11=new Dvorana("Arena", "Beograd", 20000);
		Dvorana d12=new Dvorana("Spens", "Novi Sad", 11500);
		Dvorana d13=new Dvorana("JNA","Beograd", 32000);
		Dvorana d14=new Dvorana("Principessa", "Beograd", 200);
		
		Dogadjaj d1=new Dogadjaj("30-i Septembar u 20:00", d11,"utakmica");
		Dogadjaj d2=new Dogadjaj("25-i Januar u 20:00",d12,"koncert");
		Dogadjaj d3=new Dogadjaj("15-i Jun u 19:00",d13,"utakmica");
		Dogadjaj d4=new Dogadjaj("25-i Maj u 19:00",d14,"vencanje");
		
		System.out.print(d4.getVreme() + ", ");
		System.out.print(d14.getNaziv() + ", ");
		System.out.print(d14.getGrad() + ", ");
		System.out.print("Kapacitet mesta: " + d14.getKapacitet() + ", ");
		System.out.print(d4.getTip() + " ");
		System.out.println();
		d14.setKapacitet(250);
		System.out.print(d4.getVreme() + ", ");
		System.out.print(d14.getNaziv() + ", ");
		System.out.print(d14.getGrad() + ", ");
		System.out.print("Kapacitet mesta: " + d14.getKapacitet() + ", ");
		System.out.print(d4.getTip() + " ");
	}

}
