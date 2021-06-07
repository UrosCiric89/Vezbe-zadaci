package domaciPonedeljak1005;

public class VrstaKicmenjaci extends Vrsta{
	
	private String kicmenjaci;

	public VrstaKicmenjaci(String naziv, String omiljenaHrana, String kicmenjaci) {
		super(naziv, omiljenaHrana);
		this.kicmenjaci = kicmenjaci;
	}

	public String getKicmenjaci() {
		return kicmenjaci;
	}

	

}
