package klase;

public class Sportista {

	/*sport - Napisati klasu Sportista. Sportista ima
1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi. 

Napisati glavni program koji kreira tri igraca. 
U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.
*/
	private String imeIprezime;
	private String sport;
	private String klub;
	private int brojDresa;
	
	public Sportista (String imeIprezime, String sport) {
		this.imeIprezime=imeIprezime;
		this.sport=sport;
	}
	public String getImeIprezime() {
		return imeIprezime;
	}
	public String getSport() {
		return sport;
	}
	public String getKlub() {
		return klub;
	}
	public void setKlub(String klub) {
		this.klub=klub;
	}
	public int getBrojDresa() {
		return brojDresa;
	}
	public void setBrojDresa(int brojDresa) {
		this.brojDresa=brojDresa;
	}
	
}
