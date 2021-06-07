package domaciPonedeljak1005;

public class Ribe extends VrstaKicmenjaci{
	 private String vrstaVode; 
	 private String vrstaPeraja;
	 
	public Ribe(String naziv, String omiljenaHrana, String kicmenjaci, String vrstaVode, String vrstaPeraja) {
		super(naziv, omiljenaHrana, kicmenjaci);
		this.vrstaVode = vrstaVode;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getVrstaVode() {
		return vrstaVode;
	}

	public void setVrstaVode(String vrstaVode) {
		this.vrstaVode = vrstaVode;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(getNaziv());
		sb.append("--");
		sb.append(getOmiljenaHrana());
		sb.append("--");
		sb.append(getKicmenjaci());
		sb.append("--");
		sb.append(getVrstaVode());
		sb.append("--");
		sb.append(getVrstaPeraja());
		return sb.toString();
	}
}
