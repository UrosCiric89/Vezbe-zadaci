package domaciKlase;

public class Zaposleni {
	/*Firma poseduje naziv, sediste, PIB i niz zaposlenih. Sva polja mogu da se dohvate, a naziv firme moze i da se postavi. 
	 * Ispisati ceo objekat klase firma. Ispisati prezimena svih zaposlenih u firmi.

Zaposleni ima ime i prezime koji se zadaju prilikom kreiranja, poziciju i iznos mesecnih primanja. 
Zaposlenog ispisati u obliku IME_PREZIME: POZICIJA (mesecna zarada)

Napisati glavni program, gde cete testirati kako ove klase funkcionisu.*/

	private String ime;
	private String prezime;
	private String pozicija;
	private double zarada;
	
	public Zaposleni(String ime, String prezime, String pozicija, double zarada) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.pozicija = pozicija;
		this.zarada = zarada;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public double getZarada() {
		return zarada;
	}

	public void setZarada(double zarada) {
		this.zarada = zarada;
	}
	public String getZaposleni() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + ": " + pozicija.toUpperCase();
	}
	

}
