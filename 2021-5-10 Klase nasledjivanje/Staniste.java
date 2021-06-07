package domaciPonedeljak1005;

import java.util.ArrayList;
import java.util.List;

public class Staniste {
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
	
	private String nazivStanista;
	
	List<Vrsta>lista;
	
	

	public Staniste(String nazivStanista, List<Vrsta> lista) {
		
		this.nazivStanista = nazivStanista;
		this.lista = lista;
	}
	public void dodajZivotinju(Sisari s1) {
		this.lista.add(s1);
	}

	


	public List<Vrsta> getLista() {
		return lista;
	}

	public void setLista(List<Vrsta> lista) {
		this.lista = lista;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getNazivStanista());
		sb.append("--");
		sb.append(getLista());
		return sb.toString();
	}
	

	

	
	
	

}
