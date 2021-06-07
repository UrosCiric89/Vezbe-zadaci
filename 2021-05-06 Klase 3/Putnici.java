package domaciKlase;

public class Putnici {
	/*Napisati klasu Putovanje. Putovanje ima destinaciju, cenu aranzmana i listu putnika. 
	 * Putnici imaju ime, prezime i broj pasosa.
U glavnom programu se igrati i testirati napisane klase.
Obavezni deo: napraviti bar 3 razlicita putovanja. 
Po zelji staviti putovanja u listu koja se zove ponuda. Jednom putovanju bar promeniti cenu aranzmana. 
Izbaciti jedno putovanje iz ponude.
Sa putovanja izbaciti jednog od putnika.
Neobavezni: vas slobodan izbor u skladu sa tekstom zadatka*/
	
	private String ime;
	private String Prezime;
	private int brojPasosa;
	
	public Putnici(String ime, String prezime, int brojPasosa) {
		super();
		this.ime = ime;
		Prezime = prezime;
		this.brojPasosa = brojPasosa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return Prezime;
	}

	public void setPrezime(String prezime) {
		Prezime = prezime;
	}

	public int getBrojPasosa() {
		return brojPasosa;
	}
	
	
}
