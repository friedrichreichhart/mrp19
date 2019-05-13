package data;

public class Person {
	
	protected String vorname;
	private String nachname;
	private int plz;
	private String ort;
	private String anschrift;
	
	//
	public Person() {
		// leerer Constructor
	}

	//
	public Person(String nachname, String vorname) {
		//
		super();
		//
		this.setVorname(vorname);
		this.setNachname(nachname);
		//
	}
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		if (nachname == null || nachname.isEmpty())
			return "";
		//
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getPlz() {
		
		return plz;
	}
	public void setPlz(int plz) {
		if (plz > 1000 && plz <= 9999) {
			this.plz = plz;
		}
	}
	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public String getAnschrift() {
		return anschrift;
	}
	public void setAnschrift(String anschrift) {
		this.anschrift = anschrift;
	}
	
	@Override
	public String toString() {
		return getNachname() + ", " + getVorname();
	}

}
