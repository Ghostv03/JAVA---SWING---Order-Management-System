package model;

public class Dostawa {
	
private int id;
private String wojNad;
private String wojOdb;
private double cena;
private int czasDost;
public Dostawa(int id, String wojNad, String wojOdb, double cena, int czasDost) {
	
	this.id = id;
	this.wojNad = wojNad;
	this.wojOdb = wojOdb;
	this.cena = cena;
	this.czasDost = czasDost;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getWojNad() {
	return wojNad;
}
public void setWojNad(String wojNad) {
	this.wojNad = wojNad;
}
public String getWojOdb() {
	return wojOdb;
}
public void setWojOdb(String wojOdb) {
	this.wojOdb = wojOdb;
}
public double getCena() {
	return cena;
}
public void setCena(double cena) {
	this.cena = cena;
}
public int getCzasDost() {
	return czasDost;
}
public void setCzasDost(int czasDost) {
	this.czasDost = czasDost;
}


public String toString(){
	return "["+ id +"] - "+ wojNad +" "+ wojOdb +" - "+ cena +" - "+ czasDost;
}
}
