package model;

public class Gabaryty {
	
	private int id;
	private int objetoscPaczki;
	private double maxCena;
	
	public Gabaryty(int id, int objetoscPaczki, double maxCena) {
		
		this.id = id;
		this.objetoscPaczki = objetoscPaczki;
		this.maxCena = maxCena;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getObjetoscPaczki() {
		return objetoscPaczki;
	}

	public void setObjetoscPaczki(int objetoscPaczki) {
		this.objetoscPaczki = objetoscPaczki;
	}

	public double getMaxCena() {
		return maxCena;
	}

	public void setMaxCena(double maxCena) {
		this.maxCena = maxCena;
	}


	public String toString(){
		return "["+ id +"] - "+ objetoscPaczki +" - "+ maxCena;
	}

}
