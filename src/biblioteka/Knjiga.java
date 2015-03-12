package biblioteka;

public class Knjiga {
	
	private String Naslov;
	private String autori;
	private String Izdavac;
	private long ISBN;
	private int izdanje;
	
	public String getNaslov() {
		return Naslov;
	}
	public void setNaslov(String naslov) {
		Naslov = naslov;
	}
	public String getAutori() {
		return autori;
	}
	public void setAutori(String autori) {
		this.autori = autori;
	}
	public String getIzdavac() {
		return Izdavac;
	}
	public void setIzdavac(String izdavac) {
		Izdavac = izdavac;
	}
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	
}
