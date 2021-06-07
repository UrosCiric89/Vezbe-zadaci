package domaciPonedeljak1005;

public class VrstaBezkicmenjaci extends Vrsta{
	
	private String bezkicmenjaci;

	public VrstaBezkicmenjaci(String naziv, String omiljenaHrana, String bezkicmenjaci) {
		super(naziv, omiljenaHrana);
		this.bezkicmenjaci = bezkicmenjaci;
	}

	public String getBezkicmenjaci() {
		return bezkicmenjaci;
	}
	
	

}
