package bankaDom;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import bankaDom.BankaKod;

public class TestBankaKod {
	/*Po uzoru na rad na casu (zadatak sa klasama Account i TestAccount), napraviti klasu TestBankaKod i :

	proveriti da li konstruktor dobro postavlja argumente, kao i da li get metode vracaju odgovarajuce vrednosti. 
	Kada se napravi racun, na stanju je 0 dinara.*/
	
	@Test
	public void testKonstruktor() {
		BankaKod bk = new BankaKod("Uros", "123-78978945-14");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk.dohvatiIme(), "Uros");
		sa.assertEquals(bk.dohvatiZiroRacun(), "123-78978945-14");
		sa.assertEquals(bk.dohvatiIznos(), 0d);
		
		sa.assertAll();
	}
	@Test
	public void testDohvati() {
		String ime = "Uros";
		String brojRacuna = "123-78978945-14";
		double stanje = 0;
		
		
		BankaKod bk = new BankaKod(ime,  brojRacuna);
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk.dohvatiIme(), ime);
		sa.assertEquals(bk.dohvatiZiroRacun(), brojRacuna);
		sa.assertEquals(bk.dohvatiIznos(), stanje);
		
		
		Assert.assertEquals(bk.dohvatiIznos(), stanje);
		
		sa.assertAll();
		//Mislim da je drugi test bespotreban ako se ne varam u konstruktoru je sve provereno sto se trazi
	}

}
