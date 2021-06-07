package domaci;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCalc {
	
	@BeforeClass
	public void preKlase() {
		System.out.println("Pocinjemo");
	    }
		@Test
		public void testKruga() {
			double r = 10;
			double ocekivano = r*r*3.14;
			double realno = domaci.Calc.pKruga(r);
			Assert.assertEquals(ocekivano, realno);
		}
		@Test
		public void testKvadrata() {
			double a = 10;
			double ocekivano = a*a;
			double realno = domaci.Calc.pKvadrata(a);
			Assert.assertEquals(ocekivano, realno);
		}
		@Test
		public void testPravougaonika() {
			double a = 10;
			double b = 5;
			double ocekivano = a*b;
			double realno = domaci.Calc.pPravougaonika(a,b);
			Assert.assertEquals(ocekivano, realno);
		}

	

}
