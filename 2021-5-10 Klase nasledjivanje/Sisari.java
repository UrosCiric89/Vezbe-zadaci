package domaciPonedeljak1005;

public class Sisari extends VrstaKicmenjaci{
	 private String bojaDlake; 
	 private String brojNogu;
	 
	public Sisari(String naziv, String omiljenaHrana, String kicmenjaci, String bojaDlake, String brojNogu) {
		super(naziv, omiljenaHrana, kicmenjaci);
		this.bojaDlake = bojaDlake;
		this.brojNogu = brojNogu;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getBrojNogu() {
		return brojNogu;
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
		sb.append(getBojaDlake());
		sb.append("--");
		sb.append(getBrojNogu());
		return sb.toString();
	}
	
	 

}
