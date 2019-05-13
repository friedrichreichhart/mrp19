package data;

public class Person {
	
	private String vorname;
	private String nachname;
	private int plz;
	private String ort;
	private String anschrift;
	
	//
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
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

}
