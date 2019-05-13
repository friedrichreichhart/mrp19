package data;

public class Student extends Person {
	//
	private int schulstufe;
	private String klasse; 
	//
	public Student(String vorname, String nachname, int schulstufe) {
		super(nachname, vorname);
		//
		this.setSchulstufe(schulstufe);
		//
	}
	//
	public int getSchulstufe() {
		return schulstufe;
	}
	public void setSchulstufe(int schulstufe) {
		this.schulstufe = schulstufe;
	}
	public String getKlasse() {
		return klasse;
	}
	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
	//
	public Student() {
	}
}
