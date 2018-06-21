package bazy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
 
import model.Miasta;
import model.Gabaryty;
import model.Dostawa;
import model.Zamowienie;

public class baza {
	 public static final String DRIVER = "org.sqlite.JDBC";
	    public static final String DB_URL = "jdbc:sqlite:baza.db";
	 
	    private Connection conn;
	    private Statement stat;
	
	    //laczenie z baza
	    public baza(){
	            try {
	                Class.forName(baza.DRIVER);
	            } catch (ClassNotFoundException e) {
	                System.err.println("Brak sterownika JDBC");
	                e.printStackTrace();
	            }
	     
	            try {
	                conn = DriverManager.getConnection(DB_URL);
	                stat = conn.createStatement();
	            } catch (SQLException e) {
	                System.err.println("Problem z otwarciem polaczenia");
	                e.printStackTrace();
	            }
	     
	            createTables();
	        }
	    	
	   
	    
	    
	    
	    
	    public boolean createTables()  {
	        String createMiasta = "CREATE TABLE IF NOT EXISTS miasta (id_miasta INTEGER PRIMARY KEY AUTOINCREMENT, Nazwa_miasta varchar(255), Województwo varchar(255), Szerokosc double, Dlugosc double)";
	        String createGabaryty = "CREATE TABLE IF NOT EXISTS gabaryty (id_gabarytu INTEGER PRIMARY KEY AUTOINCREMENT, Objetosc_paczki int, Max_cena double)";
	        String createDostawa = "CREATE TABLE IF NOT EXISTS dostawa (id_dostawy INTEGER PRIMARY KEY AUTOINCREMENT, Województwo_dostawcy varchar(255), Województwo_odbiorcy varchar(255), Cena_trasportu double, Czas_dostawy int)";
	        String createZamowienie = "CREATE TABLE IF NOT EXISTS zamowienie (id_zamowienia INTEGER PRIMARY KEY AUTOINCREMENT, Iloœæ int,Objetosc int, Waga double, Nadanie varchar(255), Dostarczenie varchar(255), Szacowana_data_odbioru varchar(255), status varchar(255), kod int, cena double)";
	        try {
	            stat.execute(createMiasta);
	            stat.execute(createGabaryty);
	            stat.execute(createDostawa);
	            stat.execute(createZamowienie);
	            
	        } catch (SQLException e) {
	            System.err.println("Blad przy tworzeniu tabeli");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	    
	    public boolean insertMiasta(String nazwaMiasta, String wojewodztwo, double szer, double dlug) {
	        try {
	            PreparedStatement prepStmt = conn.prepareStatement(
	                    "insert into miasta values (NULL, ?, ?,?,?);");
	            prepStmt.setString(1, nazwaMiasta);
	            prepStmt.setString(2, wojewodztwo);
	            prepStmt.setDouble(3, dlug);
	            prepStmt.setDouble(4, szer);
	            prepStmt.execute();
	        } catch (SQLException e) {
	            System.err.println("Blad przy wstawianiu miasta");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	    
	    public boolean insertDostawa(String wojNad, String wojOdb, double cena, int czasDost) {
	        try {
	            PreparedStatement prepStmt = conn.prepareStatement(
	                    "insert into dostawa values (NULL, ?, ?, ?, ?);");
	            prepStmt.setString(1, wojNad);
	            prepStmt.setString(2, wojOdb);
	            prepStmt.setDouble(3, cena);
	            prepStmt.setInt(4, czasDost);
	            prepStmt.execute();
	        } catch (SQLException e) {
	            System.err.println("Blad przy wstawianiu dostawy");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	    
	    public boolean insertZamowienie(int ilosc, int objetosc, double waga, String nadanie, String odbior,
				String dataOdb, String status, int kod, double cena) {
	        try {
	            PreparedStatement prepStmt = conn.prepareStatement(
	                    "insert into zamowienie values (NULL,?,?,?,?,?,?,?,?,?);");
	            prepStmt.setInt(1, ilosc);
	            prepStmt.setInt(2, objetosc);
	            prepStmt.setDouble(3, waga);
	            prepStmt.setString(4, nadanie);
	            prepStmt.setString(5, odbior);
	            prepStmt.setString(6, dataOdb);
	            prepStmt.setString(7, status);
	            prepStmt.setInt(8, kod);
	            prepStmt.setDouble(9, cena);
	            prepStmt.execute();
	        } catch (SQLException e) {
	            System.err.println("Blad przy wstawianiu zamowienia");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	    
	    public boolean insertGabaryty(int objetoscPaczki, double maxCena) {
	        try {
	            PreparedStatement prepStmt = conn.prepareStatement(
	                    "insert into gabaryty values (NULL, ?, ?);");
	            
	            prepStmt.setInt(1, objetoscPaczki);
	            prepStmt.setDouble(2, maxCena);
	            prepStmt.execute();
	        } catch (SQLException e) {
	            System.err.println("Blad przy wstawianiu gabarytu");
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	   
	    
	    public List<Miasta> selectMiasta() {
	        List<Miasta> miasta = new LinkedList<Miasta>();
	        try {
	            ResultSet result = stat.executeQuery("SELECT * FROM miasta");
	            int id;
	            double szer, dlug;
	            String nazwaMiasta, wojewodztwo;
	            while(result.next()) {
	                id = result.getInt("id_miasta");
	                nazwaMiasta = result.getString("Nazwa_miasta");
	                wojewodztwo = result.getString("Województwo");
	                szer = result.getDouble("Dlugosc");
	                dlug = result.getDouble("Szerokosc");
	                
	                miasta.add(new Miasta(id, nazwaMiasta, wojewodztwo, dlug, szer));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return miasta;
	    }
	    
	    public List<Dostawa> selectDostawa() {
	        List<Dostawa> dostawa = new LinkedList<Dostawa>();
	        try {
	            ResultSet result = stat.executeQuery("SELECT * FROM dostawa");
	            int id, czasDost;
	            double cena;
	            String wojNad, wojOdb;
	            while(result.next()) {
	                id = result.getInt("id_dostawy");
	                czasDost = result.getInt("Czas_dostawy");
	                cena = result.getDouble("Cena_trasportu");
	                wojNad = result.getString("Województwo_dostawcy");
	                wojOdb = result.getString("Województwo_odbiorcy");
	                
	                dostawa.add(new Dostawa(id, wojNad, wojOdb, cena, czasDost ));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return dostawa;
	    }
	    
	    public List<Gabaryty> selectGabaryty() {
	        List<Gabaryty> gabaryty = new LinkedList<Gabaryty>();
	        try {
	            ResultSet result = stat.executeQuery("SELECT * FROM gabaryty");
	            int id, objetoscPaczki;
	            double maxCena;
	            while(result.next()) {
	                id = result.getInt("id_gabarytu");
	                
	                maxCena = result.getDouble("Max_cena");
	                objetoscPaczki= result.getInt("Objetosc_paczki");
	                
	                
	                gabaryty.add(new Gabaryty(id, objetoscPaczki, maxCena));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return gabaryty;
	    }
	    
	    public List<Zamowienie> selectZamowienie(int kod2) {
	        List<Zamowienie> zamowienie = new LinkedList<Zamowienie>();
	        try {
	            ResultSet result = stat.executeQuery("SELECT * FROM zamowienie WHERE kod =" + kod2);
	            int id, objetosc, kod, ilosc;
	            double cena, waga;
	            String nadanie, odbior, dataOdb, status;
	            while(result.next()) {
	                id = result.getInt("id_zamowienia");
	               
	                
	                cena = result.getDouble("cena");
	                
	               
	                objetosc= result.getInt("Objetosc");
	                waga= result.getDouble("Waga");
	                kod= result.getInt("kod");
	                ilosc= result.getInt("Iloœæ");
	                
	                nadanie= result.getString("Nadanie");
	                odbior= result.getString("Dostarczenie");
	                dataOdb= result.getString("Szacowana_data_odbioru");
	                status= result.getString("status");
	                
	                
	                zamowienie.add(new Zamowienie(id, ilosc, objetosc, waga, nadanie, odbior,
	            			dataOdb, status, kod, cena));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return zamowienie;
	    }
	    
	    public List<Zamowienie> selectZamowienie() {
	        List<Zamowienie> zamowienie = new LinkedList<Zamowienie>();
	        try {
	            ResultSet result = stat.executeQuery("SELECT * FROM zamowienie");
	            int id, objetosc, kod, ilosc;
	            double cena, waga;
	            String nadanie, odbior, dataOdb, status;
	            while(result.next()) {
	                id = result.getInt("id_zamowienia");	                
	                cena = result.getDouble("cena");
	                objetosc= result.getInt("Objetosc");
	                waga= result.getDouble("Waga");
	                kod= result.getInt("kod");
	                ilosc= result.getInt("Iloœæ");
	                
	                nadanie= result.getString("Nadanie");
	                odbior= result.getString("Dostarczenie");
	                dataOdb= result.getString("Szacowana_data_odbioru");
	                status= result.getString("status");
	                
	                
	                zamowienie.add(new Zamowienie(id, ilosc, objetosc, waga, nadanie, odbior,
	            			dataOdb, status, kod, cena));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return null;
	        }
	        return zamowienie;
	    }
	    
	    //USUWANIE WIERSZA Z BAZY
	    
	    public boolean deleteRecord(int g){
			   String delete = "Delete FROM zamowienie WHERE kod = " + g  ; 
			   
			   
			   try{
				   stat.execute(delete);
				  
			   }catch (SQLException e) {
		            System.err.println("Blad przy usuwaniu wpisu");
		            e.printStackTrace();
		            return false;
		        }
		        return true;
			 
		   }
	    
	  
	    
	    
	    
	    
	    //WYCIAGANIE Z BAZY SZEROKOSCI GEOGRAFICZNEJ
	    public double Oblicz(double szerokosc2, String indeks2 ){
		
			String szerokosc = "SELECT Szerokosc FROM miasta WHERE Nazwa_miasta = '" + indeks2+"'";
		
			ResultSet resultset = null;
			
			try{
				
				resultset = stat.executeQuery(szerokosc);  
				
		        
		              szerokosc2 = resultset.getDouble("Szerokosc");
		           
			}catch (SQLException e) {
	            System.err.println("Blad przy wyszukiwaniu wiersza");
	            e.printStackTrace();
	           
	        }
	        
			return szerokosc2;
	        
	   }
			
	    
	    //WYCIAGANIE Z BAZY D£UGOŒCI GEOGRAFICZNEJ
	    
	    public double Oblicz2(double dlugosc2, String indeks){
			 
			
			 
			String dlugosc = "SELECT Dlugosc FROM miasta WHERE Nazwa_miasta = '" + indeks+"'";
		
			ResultSet resultset2 = null;
			
				
			
			try{
				
				resultset2 = stat.executeQuery(dlugosc);  
				
		       
		             dlugosc2 = resultset2.getDouble("Dlugosc");
		            // System.out.println(dlugosc2);
		        
		         
		       
				
			}catch (SQLException e) {
	            System.err.println("Blad przy wyszukiwaniu wiersza");
	            e.printStackTrace();
	            
	        }
	        
	        return dlugosc2;
	        
		 
	   }
	    //WYCIAGANIE CENY ZA KM
	    public double cena(double dlugosc2, String indeks, String indeks2){
			 
			String dlugosc = "SELECT Cena_trasportu FROM dostawa WHERE Województwo_dostawcy = '" + indeks+"'"+" AND " + "Województwo_odbiorcy = '"+ indeks2+"'";
			ResultSet resultset3 = null;
			
				try{
				resultset3 = stat.executeQuery(dlugosc);  
				dlugosc2 = resultset3.getDouble("Cena_trasportu");
		       
		      
			}catch (SQLException e) {
	            System.err.println("Blad przy wyszukiwaniu wiersza");
	            e.printStackTrace();
	            
	        }
	        
	        return dlugosc2;
	   }
	    
	    public int dni(int dlugosc2, String indeks, String indeks2){
			 
			String dlugosc = "SELECT Czas_dostawy FROM dostawa WHERE Województwo_dostawcy = '" + indeks+"'"+" AND " + "Województwo_odbiorcy = '"+ indeks2+"'";
			ResultSet resultset3 = null;
			
				try{
				resultset3 = stat.executeQuery(dlugosc);  
				dlugosc2 = resultset3.getInt("Czas_dostawy");
		       // System.out.println(dlugosc2);
		      
			}catch (SQLException e) {
	            System.err.println("Blad przy wyszukiwaniu wiersza");
	            e.printStackTrace();
	            
	        }
	        
	        return dlugosc2;
	        
		 
	   }
	    
	    
	    //Wyciagnie ceny za paczke
	    public double CenazaPaczke(double cenapaczki, int indeks){
			
			String dlugosc = "SELECT Max_cena FROM gabaryty WHERE id_gabarytu = " + indeks;
			ResultSet resultset2 = null;

			try{
				
				resultset2 = stat.executeQuery(dlugosc);  
				
		             cenapaczki = resultset2.getDouble("Max_cena");
		       
			}catch (SQLException e) {
	            System.err.println("Blad przy wyszukiwaniu wiersza");
	            e.printStackTrace();
	            
	        }
	        
	        return cenapaczki;
	     
	   }
	    
	    //ZMIANA STATUSU NA "ZAKONCZONO"
	    public void zakoncz(int kodPaczki2){
	    	String zakoncz = "UPDATE zamowienie SET status = 'Zakoñczono' WHERE kod = " + kodPaczki2;
	    	
	    	try{
	    		stat.executeUpdate(zakoncz);
	    	}
	    	catch(SQLException e){
	    		System.err.println("Blad przy zmianie statusu");
	            e.printStackTrace();
	    		
	    	}
	    }
	    
	    //WYCIAGNIE CENY ZAMOWIENIA
	    
 public double CenaAnuluj(double cenapaczki, int kodPaczki2){
			
			String cena = "SELECT cena FROM zamowienie WHERE kod = " + kodPaczki2;
			ResultSet resultset2 = null;
			

			try{
				
				resultset2 = stat.executeQuery(cena);  
				
		        cenapaczki = resultset2.getDouble("cena");
		       
			}catch (SQLException e) {
	            System.err.println("Blad przy zmianie statusu");
	            e.printStackTrace();
	            
	        }
	        
	        return cenapaczki;
	     
	   }
	    
	  //ZMIANA STATUSU NA "ANULOWANE"
	    public void anuluj(int kodPaczki2, double cena){
	    	String zakoncz = "UPDATE zamowienie SET status = 'Anulowane', cena = " + cena + " WHERE kod = " + kodPaczki2;
	    	
	    	try{
	    		stat.executeUpdate(zakoncz);
	    	}
	    	catch(SQLException e){
	    		System.err.println("Blad przy zmianie statusu");
	            e.printStackTrace();
	    		
	    	}
	    }
	    	    
	    //ZAMYKANIE POLACZENIA Z BAZA
	    
	    public void closeConnection() {
	        try {
	            conn.close();
	        } catch (SQLException e) {
	            System.err.println("Problem z zamknieciem polaczenia");
	            e.printStackTrace();
	        }
	    }
	    
	    
	    
	    }
	


