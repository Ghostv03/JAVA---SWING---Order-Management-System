package model;

public class Zamowienie {
	
	private int id;
	private int ilosc;
	private int objetosc;
	private double waga;
	private String nadanie;
	private String odbior;
	private String dataOdb;
	private String status;
	private int kod;
	private double cena;
	
	
	public Zamowienie(int id, int ilosc, int objetosc, double waga2, String nadanie, String odbior, String dataOdb,
			String status, int kod, double cena) {
		super();
		this.id = id;
		this.ilosc = ilosc;
		this.objetosc = objetosc;
		this.waga = waga2;
		this.nadanie = nadanie;
		this.odbior = odbior;
		this.dataOdb = dataOdb;
		this.status = status;
		this.kod = kod;
		this.cena = cena;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIlosc() {
		return ilosc;
	}


	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}


	public int getObjetosc() {
		return objetosc;
	}


	public void setObjetosc(int objetosc) {
		this.objetosc = objetosc;
	}


	public double getWaga() {
		return waga;
	}


	public void setWaga(double waga) {
		this.waga = waga;
	}


	public String getNadanie() {
		return nadanie;
	}


	public void setNadanie(String nadanie) {
		this.nadanie = nadanie;
	}


	public String getOdbior() {
		return odbior;
	}


	public void setOdbior(String odbior) {
		this.odbior = odbior;
	}


	public String getDataOdb() {
		return dataOdb;
	}


	public void setDataOdb(String dataOdb) {
		this.dataOdb = dataOdb;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public int getKod() {
		return kod;
	}


	public void setKod(int kod) {
		this.kod = kod;
	}


	public double getCena() {
		return cena;
	}


	public void setCena(double cena) {
		this.cena = cena;
	}


	public String toString(){
		return "["+ id +"] - "+ ilosc +" - "+ objetosc +" - "+ waga +" - "+nadanie+" - "+odbior+" - "+dataOdb+" - "+status+" - "+kod+" - "+cena;
	}

}
