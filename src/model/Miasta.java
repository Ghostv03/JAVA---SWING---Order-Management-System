package model;



public class Miasta {

	private int id;
	private String wojewodztwo;
	private String nazwaMiasta;
	private double szer;
	private double dlug;
	
	
	
	public Miasta(int id, String wojewodztwo, String nazwaMiasta, double szer, double dlug) {
		
		this.id = id;
		this.wojewodztwo = wojewodztwo;
		this.nazwaMiasta = nazwaMiasta;
		this.szer = szer;
		this.dlug = dlug;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getWojewodztwo() {
		return wojewodztwo;
	}



	public void setWojewodztwo(String wojewodztwo) {
		this.wojewodztwo = wojewodztwo;
	}



	public String getNazwaMiasta() {
		return nazwaMiasta;
	}



	public void setNazwaMiasta(String nazwaMiasta) {
		this.nazwaMiasta = nazwaMiasta;
	}



	public double getSzer() {
		return szer;
	}



	public void setSzer(double szer) {
		this.szer = szer;
	}



	public double getDlug() {
		return dlug;
	}



	public void setDlug(double dlug) {
		this.dlug = dlug;
	}



	public String toString(){
		
		return "["+id+"] - "+ nazwaMiasta +" - "+wojewodztwo+" - "+dlug+" - "+szer;
	}
	
}
