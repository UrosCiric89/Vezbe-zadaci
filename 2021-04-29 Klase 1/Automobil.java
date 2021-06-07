package klase;

public class Automobil {

	
		/*vozilo  - Napisati klasu Automobil. Automobil ima 
1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
Automobil moze da ima 4) vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku        
Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila. 
Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.*/


	private String marka;
	private String model;
	private int serijskiBroj;
	private String vlasnik1;
	private String vlasnik2;
	private String vlasnik3;
	private String vlasnik4;
	
	public Automobil(String marka, String model, int serijskiBroj) {
		this.marka=marka;
		this.model=model;
		this.serijskiBroj=serijskiBroj;
	}
	public Automobil(String marka, String model) {
		this.marka=marka;
		this.model=model;
	}
	public Automobil(String marka, int serijskiBroj) {
		this.marka=marka;
		this.serijskiBroj=serijskiBroj;
	}
	
	public String getMarka() {
		return marka;
	}
	public String getModel() {
		return model;
	}
	public int getSerijskiBroj() {
		return serijskiBroj;
	}
	public String getVlasnik1() {
		return vlasnik1;
	}
	public void setVlasnik1(String vlasnik1) {
		this.vlasnik1=vlasnik1;
	}
	public String getVlasnik2() {
		return vlasnik2;
	}
	public void setVlasnik2(String vlasnik2) {
		this.vlasnik2=vlasnik2;
	}
	public String getVlasnik3() {
		return vlasnik3;
	}
	public void setVlasnik3(String vlasnik3) {
		this.vlasnik3=vlasnik3;
    }
    public String getVlasnik4() {
	    return vlasnik4;
    }
    public void setVlasnik4(String vlasnik4) {
	    this.vlasnik4=vlasnik4;
    }
}