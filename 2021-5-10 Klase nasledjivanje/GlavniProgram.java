package domaciPonedeljak1005;

import java.util.ArrayList;
import java.util.List;

public class GlavniProgram {

	public static void main(String[] args) {
		/*Zivotinje

		U prirodi obitavaju razne zivotinje. Sve imaju svoju vrstu (rod, porodica, poklasa.. 
		Moze biti kicmenjak/beskicmenjak, moze biti i neko blize odredjivanje…), konkretan naziv i omiljenu hranu.

		Ribe su kicmenjaci koje karakterise vrsta vode u kojoj obitavaju (slatka, slana voda) i vrsta peraja.
		Sisari su kicmenjaci koje se razlikuju po boji dlake i po broju nogu.

		Napraviti klasu Staniste u kom se nalazi lista zivotinja koje u tom stanistu zive. 
		Staniste takodje ima naziv koji moze da se dohvati ali ne i postavi.

		Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
		Ispisati bar jedno staniste.
		Jednom sisaru zameniti boju dlake.*/
		
		Sisari s1= new Sisari("Vuk", "Meso", "Kicmenjak", "Siva", "Cetiri");
		System.out.println(s1);
		
		Ribe r1=new Ribe("Som", "Gliste", "Kicmenjak", "Slatka", "Parna");
		System.out.println(r1);
		
				s1.setBojaDlake("Bela");
				System.out.println(s1);
				List<Vrsta>lista=new ArrayList<Vrsta>();
				lista.add(s1);
				
				
				Staniste st1=new Staniste("Suma", lista);
				System.out.println(st1);
				
				
				

	}

}
