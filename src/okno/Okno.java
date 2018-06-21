
package okno;
import bazy.Obliczenia;
import bazy.baza;
import model.Zamowienie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Okno extends JFrame implements ActionListener {
	private JButton nadajPrzesylke, sprawdzPrzesylke, dalej, potwierdz, zakoncz, zakoncz2, zakoncz3, dodaKol, sprKol, zobBaze, cofnij, cofnij2, usunWpis, zakonczono, anuluj;
	private JLabel tytul, formularz, wybPrzes, wymPaczki, wagaPaczki, wybWoj, miejNad, miejDost, sprawdz, podajKod, pods, rabatto, cenacalk;
	private JTextField wymX, wymY, wymZ, wagaPole, iloscPole, kodP, rabattokek, usunWpisy;
	private JComboBox<String> mNad, mNad2, mDostWoje, mDostMiast;
	private JTable table;
	private JScrollPane scrollPane;
	private Model tabModel;
	List<Zamowienie> zamowienia = new ArrayList<>();
	List<Zamowienie> zamowienia2 = new ArrayList<>();
	List<Zamowienie> zamowienia3 = new ArrayList<>();
	Date currentDate;
	double cenacalko;
	int itemcount, kodPaczki2;
	
	
	public Okno(List <Zamowienie> listazamowienie){
		
		
		
		
        
        setSize(700,450);
		setTitle("Aplikacja kurierska");
		setLayout(null);
		
		
		
		
		//JBUTTON
		
		nadajPrzesylke = new JButton("NADAJ PRZESY£K ");
		nadajPrzesylke.setBounds(100, 150, 180, 40);
		add(nadajPrzesylke);
		nadajPrzesylke.addActionListener(this);
		
		sprawdzPrzesylke = new JButton("SPRAWDZ PRZESY£K ");
		sprawdzPrzesylke.setBounds(410, 150, 180, 40);
		add(sprawdzPrzesylke);
		sprawdzPrzesylke.addActionListener(this);
		
		dalej = new JButton("DALEJ");
		dalej.setBounds(550, 360, 100, 30);
		add(dalej);
		dalej.addActionListener(this);
		dalej.setVisible(false);
		
		potwierdz = new JButton("POTWIERDè");
		potwierdz.setBounds(530, 350, 120, 30);
		add(potwierdz);
		potwierdz.addActionListener(this);
		potwierdz.setVisible(false);
		
		zakoncz = new JButton("ZAKO—CZ");
		zakoncz.setBounds(530, 350, 120, 30);
		add(zakoncz);
		zakoncz.addActionListener(this);
		zakoncz.setVisible(false);
		
		zakoncz2 = new JButton("ZAKO—CZ");
		zakoncz2.setBounds(530, 350, 120, 30);
		add(zakoncz2);
		zakoncz2.addActionListener(this);
		zakoncz2.setVisible(false);
		
		zakoncz3 = new JButton("ZAKO—CZ");
		zakoncz3.setBounds(530, 350, 120, 30);
		add(zakoncz3);
		zakoncz3.addActionListener(this);
		zakoncz3.setVisible(false);
		
		dodaKol = new JButton("DODAJ KOLEJN•");
		dodaKol.setBounds(50, 350, 150, 30);
		add(dodaKol);
		dodaKol.addActionListener(this);
		dodaKol.setVisible(false);
		
		sprKol = new JButton("SPRAWDè KOLEJN•");
		sprKol.setBounds(50, 350, 150, 30);
		add(sprKol);
		sprKol.addActionListener(this);
		sprKol.setVisible(false);
		
		cofnij = new JButton("COFNIJ");
		cofnij.setBounds(50, 360, 100, 30);
		add(cofnij);
		cofnij.addActionListener(this);
		cofnij.setVisible(false);
		
		cofnij2 = new JButton("COFNIJ");
		cofnij2.setBounds(50, 360, 100, 30);
		add(cofnij2);
		cofnij2.addActionListener(this);
		cofnij2.setVisible(false);
		
		zobBaze = new JButton("ZOBACZ BAZ  DANYCH");
		zobBaze.setBounds(250, 300, 180, 40);
		add(zobBaze);
		zobBaze.addActionListener(this);
		
		
		usunWpis = new JButton("USU— WPIS");
		usunWpis.setBounds(170, 350, 100, 30);
		add(usunWpis);
		usunWpis.addActionListener(this);
		usunWpis.setVisible(false);
		
		zakonczono = new JButton("ZAKO—CZONO");
		zakonczono.setBounds(210, 350, 150, 30);
		add(zakonczono);
		zakonczono.addActionListener(this);
		zakonczono.setVisible(false);
		
		anuluj = new JButton("ANULUJ");
		anuluj.setBounds(370, 350, 150, 30);
		add(anuluj);
		anuluj.addActionListener(this);
		anuluj.setVisible(false);
		
		
		
		
		//JLABEL
		
		tytul = new JLabel("APLIKACJA KURIERSKA");
		tytul.setBounds(140, 10, 600, 100);
		tytul.setFont(new Font("SansSerif", Font.BOLD, 35));
		add(tytul);
		
		formularz = new JLabel("FORMULARZ NADANIA PRZESY£KI");
		formularz.setBounds(140, 5, 600, 100);
		formularz.setFont(new Font("SansSerif", Font.BOLD, 25));
		add(formularz);
		formularz.setVisible(false);
		
		wybPrzes = new JLabel("Wybierz iloúÊ przesy≥ek:");
		wybPrzes.setBounds(50, 80, 600, 100);
		wybPrzes.setFont(new Font("SansSerif", Font.BOLD, 15));
		add(wybPrzes);
		wybPrzes.setVisible(false);
		
		wymPaczki = new JLabel("Podaj wagÍ paczki (kg):");
		wymPaczki.setBounds(50, 115, 600, 100);
		wymPaczki.setFont(new Font("SansSerif", Font.BOLD, 15));
		add(wymPaczki);
		wymPaczki.setVisible(false);
		
		wagaPaczki = new JLabel("Podaj wymiary paczki (cm):              X             X");
		wagaPaczki.setBounds(50, 150, 600, 100);
		wagaPaczki.setFont(new Font("SansSerif", Font.BOLD, 15));
		add(wagaPaczki);
		wagaPaczki.setVisible(false);
		
		wybWoj = new JLabel("Wybierz odpowiednie wojewÛdztwa i miasta:");
		wybWoj.setBounds(50, 185, 600, 100);
		wybWoj.setFont(new Font("SansSerif", Font.BOLD, 15));
		add(wybWoj);
		wybWoj.setVisible(false);
		
		miejNad = new JLabel("Miejsce nadania przesy≥ki:");
		miejNad.setBounds(50, 220, 600, 100);
		miejNad.setFont(new Font("SansSerif", Font.BOLD, 15));
		add(miejNad);
		miejNad.setVisible(false);
		
		miejDost = new JLabel("Miejsce dostarczenia przesy≥ki:");
		miejDost.setBounds(50, 255, 600, 100);
		miejDost.setFont(new Font("SansSerif", Font.BOLD, 15));
		add(miejDost);
		miejDost.setVisible(false);
		
		sprawdz = new JLabel("SPRAWDZANIE PRZESY£KI");
		sprawdz.setBounds(140, 5, 600, 100);
		sprawdz.setFont(new Font("SansSerif", Font.BOLD, 30));
		add(sprawdz);
		sprawdz.setVisible(false);
		
		podajKod = new JLabel("Podaj kod paczki");
		podajKod.setBounds(150, 80, 600, 100);
		podajKod.setFont(new Font("SansSerif", Font.BOLD, 18));
		add(podajKod);
		podajKod.setVisible(false);
		
		pods = new JLabel("PODSUMOWANIE");
		pods.setBounds(210, 5, 600, 100);
		pods.setFont(new Font("SansSerif", Font.BOLD, 30));
		add(pods);
		pods.setVisible(false);
		
		rabatto = new JLabel("Rabat (%):");
		rabatto.setBounds(50, 290, 600, 100);
		rabatto.setFont(new Font("SansSerif", Font.BOLD, 15));
		add(rabatto);
		rabatto.setVisible(false);
		
		
		
		
		//JTEXTFIELD
		
		iloscPole = new JTextField("");
		iloscPole.setBounds(250, 120, 160, 20);
		add(iloscPole);
		iloscPole.setVisible(false);
		
		wagaPole = new JTextField("");
		wagaPole.setBounds(250, 155, 160, 20);
		add(wagaPole);
		wagaPole.setVisible(false);
		
		wymX = new JTextField("");
		wymX.setBounds(250, 190, 40, 20);
		add(wymX);
		wymX.setVisible(false);
		
		wymY = new JTextField("");
		wymY.setBounds(310, 190, 40, 20);
		add(wymY);
		wymY.setVisible(false);
		
		wymZ = new JTextField("");
		wymZ.setBounds(370, 190, 40, 20);
		add(wymZ);
		wymZ.setVisible(false);
		
		kodP = new JTextField("");
		kodP.setBounds(350, 121, 150, 20);
		add(kodP);
		kodP.setVisible(false);
		
		rabattokek = new JTextField("");
		rabattokek.setBounds(250, 330, 100, 20);
		add(rabattokek);
		rabattokek.setVisible(false);
		
		usunWpisy = new JTextField("");
		usunWpisy.setBounds(50, 355, 100, 20);
		add(usunWpisy);
		usunWpisy.setVisible(false);
		
		
		
		//JCOMBOBOX
		
		String [] Wojewodztwa = {
				"£Ûdzkie","Mazowieckie","ålπskie","Wielkopolskie","Ma≥opolskie","Dolnoúlπskie","Pomorskie","Lubelskie","Podkarpackie",
				"Kujawsko-pomorskie","Zachodniopomorskie","WarmiÒsko-mazurskie","åwiÍtokrzyskie","Podlaskie","Lubuskie","Opolskie"
		};
		
		mNad = new JComboBox(Wojewodztwa);
		mNad.setBounds(300, 260, 160, 20);
		add(mNad);
		mNad.setVisible(false);
		mNad.addActionListener(this);
		
		mDostWoje = new JComboBox(Wojewodztwa);
		mDostWoje.setBounds(300, 295, 160, 20);
		add(mDostWoje);
		mDostWoje.setVisible(false);
		mDostWoje.addActionListener(this);
		
		//JSCROLLPANE
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 100, 650, 220);
		scrollPane.setVisible(false);
		add(scrollPane);
		
		
		//tabModel = new Model(listazamowienie);
		table = new JTable(tabModel);
		table.setBounds(15, 100, 650, 220);
		add(table);
		table.setVisible(false);
		scrollPane.setViewportView(table);
		
	
	}
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		Object zrodlo = e.getSource();
		
		if (zrodlo == nadajPrzesylke){
			tytul.setVisible(false);
			nadajPrzesylke.setVisible(false);
			sprawdzPrzesylke.setVisible(false);
			
			formularz.setVisible(true);
			wybPrzes.setVisible(true);
			wymPaczki.setVisible(true);
			wagaPaczki.setVisible(true);
			wybWoj.setVisible(true);
			miejNad.setVisible(true);
			miejDost.setVisible(true);
			dalej.setVisible(true);
			iloscPole.setVisible(true);
			wagaPole.setVisible(true);
			wymX.setVisible(true);
			wymY.setVisible(true);
			wymZ.setVisible(true);
			mNad.setVisible(true);
			mDostWoje.setVisible(true);
			rabatto.setVisible(true);
			rabattokek.setVisible(true);
			zobBaze.setVisible(false);
			cofnij.setVisible(true);
			
			
			String [] Lodz = {"£Ûdü","Pabianice","Zgierz","PiotrkÛw Trybunalski", "Skierniewice" };
			if (mNad2 == null) {
				mNad2 = new JComboBox(Lodz);
				mNad2.setBounds(490, 260, 160, 20);
				add(mNad2);
				mNad2.setVisible(true);
			} else {
				for (String a : Lodz) {
					mNad2.addItem(a);
				}}
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Lodz);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Lodz) {
						mDostMiast.addItem(a);
					}}
					
					mNad2.setVisible(true);
					mDostMiast.setVisible(true);
			
			
		}
		if(zrodlo == sprawdzPrzesylke){
			
			sprawdz.setVisible(true);
			podajKod.setVisible(true);
			kodP.setVisible(true);
			potwierdz.setVisible(true);
			cofnij2.setVisible(true);
			
			tytul.setVisible(false);
			nadajPrzesylke.setVisible(false);
			sprawdzPrzesylke.setVisible(false);
			zobBaze.setVisible(false);
			
			
		}
		
		
		
		if(zrodlo == mNad){
			String wojewodztwo = mNad.getSelectedItem().toString();
			
			
			String [] Slaskie = {"Katowice","Tychy","Bielsko-Bia≥a","Rybnik","Sosnowiec"};
			String [] Wielkopolskie = { "Kalisz", "Konin", "Leszno", "PoznaÒ", "Jarocin" };
			String [] Malopolskie = {"KrakÛw", "Nowy Sπcz", "TarnÛw", "OúwiÍcim", "Wadowice"};
			String [] Dolnoslaskie = {"Wroc≥aw", "Wa≥brzych", "Legnica", "Jelenia GÛra", "SobÛtka"};
			String [] Pomorskie = {"GdaÒsk", "Gdynia", "Sopot", "S≥upsk", "KwidzyÒ" };
			String [] Lubelskie = {"Bia≥a Podlaska", "Che≥m","Lublin","ZamoúÊΩ","Bi≥goraj"};
			String [] Podkarpackie = {"Krosno", "Przemyúl", "RzeszÛw", "Tarnobrzeg", "Leøajsk" };
			String [] Kujawsko = {"Bydgoszcz", "Grudziπdz", "ToruÒ", "W≥oc≥awek", "Inowroc≥aw" };
			String [] Zachodniopomorskie = { "Koszalin", "åwinoujúcie", "Szczecin", "WÍgorzyno", "åwidwin" };
			String [] Warminsko = {"Elblπg", "Olsztyn", "KÍtrzyn", "Mrπgowo","Giøycko" };
			String [] Swietokrzyskie = {"Kielce", "Ma≥ogoszcz", "StaszÛw", "OøarÛw", "SuchedniÛw" };
			String [] Podlaskie = {"Bia≥ystok", "£omøa", "Suwa≥ki", "Knyszyn", "Jedwabne"};
			String [] Lubuskie = { "GorzÛw Wielkopolski", "Zielona GÛra", "Krosno OdrzaÒskie", "SulechÛw", "Babimost"};
			String [] Opolskie = { "Opole", "Niemodlin", "Ozimek", "Kluczbork", "Byczyna"};
			String [] Lodzkie = {"£Ûdü","Pabianice","Zgierz","PiotrkÛw Trybunalski", "Skierniewice" };
			String [] Mazowieckie = { "Warszawa", "P≥ock", "Radom", "Siedlce","Ostro≥Íka"};
			
			
			
			if (mNad2 != null) {
				mNad2.removeAllItems();
			}

			
			
			if (wojewodztwo.equals("ålπskie")){
				if (mNad2 == null) {
					mNad2 = new JComboBox(Slaskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Slaskie) {
						mNad2.addItem(a);
					}
				}
			}

			else if(wojewodztwo.equals("Wielkopolskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Wielkopolskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Wielkopolskie) {
						mNad2.addItem(a);
					}
				}}
			else if(wojewodztwo.equals("Ma≥opolskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Malopolskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Malopolskie) {
						mNad2.addItem(a);
					}
				}}
			else if(wojewodztwo.equals("Dolnoúlπskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Dolnoslaskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Dolnoslaskie) {
						mNad2.addItem(a);
					}
				}}
			else if(wojewodztwo.equals("Pomorskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Pomorskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Pomorskie) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Lubelskie")){
				if (mNad2 == null) {
					mNad2 = new JComboBox(Lubelskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Lubelskie) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Podkarpackie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Podkarpackie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Podkarpackie) {
						mNad2.addItem(a);
					}
				}}
			else if(wojewodztwo.equals("Kujawsko-pomorskie")){

				if (mNad2 == null) {
					mNad2 = new JComboBox(Kujawsko);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Kujawsko) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Zachodniopomorskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Zachodniopomorskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Zachodniopomorskie) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("WarmiÒsko-mazurskie")){
					
				if (mNad2 == null) {
					mNad2 = new JComboBox(Warminsko);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Warminsko) {
						mNad2.addItem(a);
					}
				}
					}
			else if(wojewodztwo.equals("åwiÍtokrzyskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Swietokrzyskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Swietokrzyskie) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Podlaskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Podlaskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Podlaskie) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Lubuskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Lubuskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Lubuskie) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Opolskie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Opolskie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Opolskie) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("£Ûdzkie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Lodzkie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Lodzkie) {
						mNad2.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Mazowieckie")){
				
				if (mNad2 == null) {
					mNad2 = new JComboBox(Mazowieckie);
					mNad2.setBounds(490, 260, 160, 20);
					add(mNad2);
					mNad2.setVisible(true);
				} else {
					for (String a : Mazowieckie) {
						mNad2.addItem(a);
					}
				}
				}
			
			else mNad2.setVisible(false);
	
			}
		
		
		if(zrodlo == mDostWoje){
			String wojewodztwo = mDostWoje.getSelectedItem().toString();
			
			
			String [] Slaskie = {"Katowice","Tychy","Bielsko-Bia≥a","Rybnik","Sosnowiec"};
			String [] Wielkopolskie = { "Kalisz", "Konin", "Leszno", "PoznaÒ", "Jarocin" };
			String [] Malopolskie = { "KrakÛw", "Nowy Sπcz", "TarnÛw", "OúwiÍcim", "Wadowice"};
			String [] Dolnoslaskie = { "Wroc≥aw", "Wa≥brzych", "Legnica", "Jelenia GÛra", "SobÛtka"};
			String [] Pomorskie = { "GdaÒsk", "Gdynia", "Sopot", "S≥upsk", "KwidzyÒ" };
			String [] Lubelskie = { "Bia≥a Podlaska", "Che≥m","Lublin","ZamoúÊΩ","Bi≥goraj"};
			String [] Podkarpackie = {"Krosno", "Przemyúl", "RzeszÛw", "Tarnobrzeg", "Leøajsk" };
			String [] Kujawsko = { "Bydgoszcz", "Grudziπdz", "ToruÒ", "W≥oc≥awek", "Inowroc≥aw" };
			String [] Zachodniopomorskie = { "Koszalin", "åwinoujúcie", "Szczecin", "WÍgorzyno", "åwidwin" };
			String [] Warminsko = { "Elblπg", "Olsztyn", "KÍtrzyn", "Mrπgowo","Giøycko" };
			String [] Swietokrzyskie = { "Kielce", "Ma≥ogoszcz", "StaszÛw", "OøarÛw", "SuchedniÛw" };
			String [] Podlaskie = {"Bia≥ystok", "£omøa", "Suwa≥ki", "Knyszyn", "Jedwabne"};
			String [] Lubuskie = {"GorzÛw Wielkopolski", "Zielona GÛra", "Krosno OdrzaÒskie", "SulechÛw", "Babimost"};
			String [] Opolskie = {"Opole", "Niemodlin", "Ozimek", "Kluczbork", "Byczyna"};
			String [] Lodzkie = {"£Ûdü","Pabianice","Zgierz","PiotrkÛw Trybunalski", "Skierniewice" };
			String [] Mazowieckie = {"Warszawa", "P≥ock", "Radom", "Siedlce","Ostro≥Íka"};
			
			if (mDostMiast != null) {
				mDostMiast.removeAllItems();
			}

			
			
			if (wojewodztwo.equals("ålπskie")){
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Slaskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Slaskie) {
						mDostMiast.addItem(a);
					}
				}
			}

			else if(wojewodztwo.equals("Wielkopolskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Wielkopolskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Wielkopolskie) {
						mDostMiast.addItem(a);
					}
				}}
			else if(wojewodztwo.equals("Ma≥opolskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Malopolskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Malopolskie) {
						mDostMiast.addItem(a);
					}
				}}
			else if(wojewodztwo.equals("Dolnoúlπskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Dolnoslaskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Dolnoslaskie) {
						mDostMiast.addItem(a);
					}
				}}
			else if(wojewodztwo.equals("Pomorskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Pomorskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Pomorskie) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Lubelskie")){
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Lubelskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Lubelskie) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Podkarpackie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Podkarpackie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Podkarpackie) {
						mDostMiast.addItem(a);
					}
				}}
			else if(wojewodztwo.equals("Kujawsko-pomorskie")){

				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Kujawsko);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Kujawsko) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Zachodniopomorskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Zachodniopomorskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Zachodniopomorskie) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("WarmiÒsko-mazurskie")){
					
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Warminsko);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Warminsko) {
						mDostMiast.addItem(a);
					}
				}
					}
			else if(wojewodztwo.equals("åwiÍtokrzyskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Swietokrzyskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Swietokrzyskie) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Podlaskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Podlaskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Podlaskie) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Lubuskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Lubuskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Lubuskie) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Opolskie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Opolskie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Opolskie) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("£Ûdzkie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Lodzkie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Lodzkie) {
						mDostMiast.addItem(a);
					}
				}
				}
			else if(wojewodztwo.equals("Mazowieckie")){
				
				if (mDostMiast == null) {
					mDostMiast = new JComboBox(Mazowieckie);
					mDostMiast.setBounds(490, 295, 160, 20);
					add(mDostMiast);
					mDostMiast.setVisible(true);
				} else {
					for (String a : Mazowieckie) {
						mDostMiast.addItem(a);
					}
				}
				}
			
			else mDostMiast.setVisible(false);
	
			}
	 if(zrodlo == dalej){
			
		 tytul.setVisible(false);
			nadajPrzesylke.setVisible(false);
			sprawdzPrzesylke.setVisible(false);
			
			formularz.setVisible(false);
			wybPrzes.setVisible(false);
			wymPaczki.setVisible(false);
			wagaPaczki.setVisible(false);
			wybWoj.setVisible(false);
			miejNad.setVisible(false);
			miejDost.setVisible(false);
			dalej.setVisible(false);
			iloscPole.setVisible(false);
			wagaPole.setVisible(false);
			wymX.setVisible(false);
			wymY.setVisible(false);
			wymZ.setVisible(false);
			mNad.setVisible(false);
			mDostWoje.setVisible(false);
			rabatto.setVisible(false);
			rabattokek.setVisible(false);
			cofnij.setVisible(false);
			
			mNad2.setVisible(false);
			mDostMiast.setVisible(false);
			
			Warunki w = new Warunki();
			
			
			String ilosc = iloscPole.getText();
			if(w.isParsableAsInteger(ilosc)==false){
				JOptionPane.showMessageDialog(new JFrame(), "B≥πd wprowadü w≥asciwe dane", "Error" ,JOptionPane.ERROR_MESSAGE);
				formularz.setVisible(true);
				wybPrzes.setVisible(true);
				wymPaczki.setVisible(true);
				wagaPaczki.setVisible(true);
				wybWoj.setVisible(true);
				miejNad.setVisible(true);
				miejDost.setVisible(true);
				dalej.setVisible(true);
				iloscPole.setVisible(true);
				wagaPole.setVisible(true);
				wymX.setVisible(true);
				wymY.setVisible(true);
				wymZ.setVisible(true);
				mNad.setVisible(true);
				mDostWoje.setVisible(true);
				rabatto.setVisible(true);
				rabattokek.setVisible(true);
				mNad2.setVisible(true);
				mDostMiast.setVisible(true);
				cofnij.setVisible(true);
				
			}
			else{
				
			
			int ilosc2 = Integer.parseInt(ilosc);
			String waga = wagaPole.getText();
			
			if(w.isParsableAsDouble(waga)==false){
				JOptionPane.showMessageDialog(new JFrame(), "B≥πd wprowadü w≥asciwe dane", "Error" ,JOptionPane.ERROR_MESSAGE);
				formularz.setVisible(true);
				wybPrzes.setVisible(true);
				wymPaczki.setVisible(true);
				wagaPaczki.setVisible(true);
				wybWoj.setVisible(true);
				miejNad.setVisible(true);
				miejDost.setVisible(true);
				dalej.setVisible(true);
				iloscPole.setVisible(true);
				wagaPole.setVisible(true);
				wymX.setVisible(true);
				wymY.setVisible(true);
				wymZ.setVisible(true);
				mNad.setVisible(true);
				mDostWoje.setVisible(true);
				rabatto.setVisible(true);
				rabattokek.setVisible(true);
				mNad2.setVisible(true);
				mDostMiast.setVisible(true);
				cofnij.setVisible(true);
			}
			else{
			
			double waga2 = Double.parseDouble(waga);
			String wymiarX = wymX.getText();
			
			if(w.isParsableAsInteger(wymiarX)==false){
				JOptionPane.showMessageDialog(new JFrame(), "B≥πd wprowadü w≥asciwe dane", "Error" ,JOptionPane.ERROR_MESSAGE);
				formularz.setVisible(true);
				wybPrzes.setVisible(true);
				wymPaczki.setVisible(true);
				wagaPaczki.setVisible(true);
				wybWoj.setVisible(true);
				miejNad.setVisible(true);
				miejDost.setVisible(true);
				dalej.setVisible(true);
				iloscPole.setVisible(true);
				wagaPole.setVisible(true);
				wymX.setVisible(true);
				wymY.setVisible(true);
				wymZ.setVisible(true);
				mNad.setVisible(true);
				mDostWoje.setVisible(true);
				rabatto.setVisible(true);
				rabattokek.setVisible(true);
				mNad2.setVisible(true);
				mDostMiast.setVisible(true);
				cofnij.setVisible(true);
			}
			else{
			
			int wymiarX2 = Integer.parseInt(wymiarX);
			String wymiarY = wymY.getText();
			
			if(w.isParsableAsInteger(wymiarY)==false){
				JOptionPane.showMessageDialog(new JFrame(), "B≥πd wprowadü w≥asciwe dane", "Error" ,JOptionPane.ERROR_MESSAGE);
				formularz.setVisible(true);
				wybPrzes.setVisible(true);
				wymPaczki.setVisible(true);
				wagaPaczki.setVisible(true);
				wybWoj.setVisible(true);
				miejNad.setVisible(true);
				miejDost.setVisible(true);
				dalej.setVisible(true);
				iloscPole.setVisible(true);
				wagaPole.setVisible(true);
				wymX.setVisible(true);
				wymY.setVisible(true);
				wymZ.setVisible(true);
				mNad.setVisible(true);
				mDostWoje.setVisible(true);
				rabatto.setVisible(true);
				rabattokek.setVisible(true);
				mNad2.setVisible(true);
				mDostMiast.setVisible(true);
				cofnij.setVisible(true);
			}
			else{
				
			int wymiarY2 = Integer.parseInt(wymiarY);
			String wymiarZ = wymZ.getText();
			
			if(w.isParsableAsInteger(wymiarZ)==false){
				JOptionPane.showMessageDialog(new JFrame(), "B≥πd wprowadü w≥asciwe dane", "Error" ,JOptionPane.ERROR_MESSAGE);
				formularz.setVisible(true);
				wybPrzes.setVisible(true);
				wymPaczki.setVisible(true);
				wagaPaczki.setVisible(true);
				wybWoj.setVisible(true);
				miejNad.setVisible(true);
				miejDost.setVisible(true);
				dalej.setVisible(true);
				iloscPole.setVisible(true);
				wagaPole.setVisible(true);
				wymX.setVisible(true);
				wymY.setVisible(true);
				wymZ.setVisible(true);
				mNad.setVisible(true);
				mDostWoje.setVisible(true);
				rabatto.setVisible(true);
				rabattokek.setVisible(true);
				mNad2.setVisible(true);
				mDostMiast.setVisible(true);
				cofnij.setVisible(true);
			}
			else{
			int wymiarZ2 = Integer.parseInt(wymiarZ);
			
			
			//Warunek na rabaty
			String rab = null;
			double rab2=0;
			
			rab = rabattokek.getText();
			
			if(w.isParsableAsDoubleRab(rab)==false){
				JOptionPane.showMessageDialog(new JFrame(), "B≥πd wprowadü w≥asciwe dane", "Error" ,JOptionPane.ERROR_MESSAGE);
				formularz.setVisible(true);
				wybPrzes.setVisible(true);
				wymPaczki.setVisible(true);
				wagaPaczki.setVisible(true);
				wybWoj.setVisible(true);
				miejNad.setVisible(true);
				miejDost.setVisible(true);
				dalej.setVisible(true);
				iloscPole.setVisible(true);
				wagaPole.setVisible(true);
				wymX.setVisible(true);
				wymY.setVisible(true);
				wymZ.setVisible(true);
				mNad.setVisible(true);
				mDostWoje.setVisible(true);
				rabatto.setVisible(true);
				rabattokek.setVisible(true);
				mNad2.setVisible(true);
				mDostMiast.setVisible(true);
				cofnij.setVisible(true);
			}
			else{
			if(rab.isEmpty()==true){
				rab2 = 0;
			}
			else {rab2 = Double.parseDouble(rab);
			rabattokek.setText(null);
			}
			
			
			String miasto = mNad2.getSelectedItem().toString();
			String miasto2 = mDostMiast.getSelectedItem().toString();
			String miasto3 = mNad.getSelectedItem().toString();
			String miasto4 = mDostWoje.getSelectedItem().toString();
			
			
			Obliczenia o = new Obliczenia();
			
			//randomowy kod
			int kod = 0;
			kod = o.kod(100000000);
			
			//cena za km
			baza c = new baza();
			double cena;
			cena = c.cena(0, miasto3, miasto4);
			c.closeConnection();
			
			
			//ilosc dni dostawy
			baza d = new baza();
			int dni;
			dni = d.dni(0, miasto3, miasto4);
			d.closeConnection();
			//System.out.println(dni);
			
			
			//data 
			String data = o.data(dni);
			//System.out.println(data);
			
			
			
			//odleglosc miedzy miastami
			baza b = new baza();
			double zmienna = 0;
			zmienna = b.Oblicz(0, miasto);
			double zmienna2 = 0;
			zmienna2 = b.Oblicz2(0, miasto);
			double zmienna3 = 0;
			zmienna3 = b.Oblicz(0, miasto2);
			double zmienna4 = 0;
			zmienna4 = b.Oblicz2(0, miasto2);
			double odleglosc = o.haversine(zmienna, zmienna2, zmienna3, zmienna4);
			//System.out.println(odleglosc);
			b.closeConnection();
			
			//liczenie objetosci paczki
			int objetoscp;
			objetoscp = o.objetosc(wymiarX2, wymiarY2, wymiarZ2, 0);
			//System.out.println(objetoscp);
		 	
			
			
			//filtrowanie cen paczek
			int index;
			index = o.wartosc(objetoscp, 0);
			
			baza f = new baza();
			
			double cenaPaczki;
			cenaPaczki = f.CenazaPaczke(0, index);
			f.closeConnection();
			//System.out.println(cenaPaczki);
			
			
			//cena zamowienia
			double cenaZam;
			cenaZam = o.CenaOstateczna(waga2, objetoscp, cenaPaczki, odleglosc, cena, ilosc2,rab2);
			
			double finalValue = Math.round( cenaZam * 100.0 ) / 100.0;
			//System.out.println(finalValue);76343301	
			
			
			//wyswietlanie ceny calkowitej
			
			cenacalko = Math.round( (cenacalko + finalValue) * 100.0 ) / 100.0;
			double cenarab = cenacalko;
			cenacalk = new JLabel("Cena ca≥kowita: " + cenacalko + " z≥" );
			cenacalk.setBounds(300, 350, 300, 20);
			cenacalk.setFont(new Font("SansSerif", Font.BOLD, 12));
			add(cenacalk);
			cenacalk.setVisible(true);
			
			
			
			//wstawianie do arraya i do bazy
			Zamowienie zamowienie = new Zamowienie(kod, ilosc2, objetoscp, waga2, miasto, miasto2, data ,"W trakcie",kod,finalValue);
			zamowienia.add(zamowienie);
			baza a = new baza();
			a.insertZamowienie(ilosc2, objetoscp, waga2, miasto, miasto2,data,"W trakcie",kod,finalValue);
			a.closeConnection();
			
			
			tabModel = new Model(zamowienia);
		 	
			 table = new JTable(tabModel);
			 table.setBounds(15, 100, 650, 220); 
			 add(table);
			 scrollPane.setViewportView(table); 
			 table.setVisible(true);

			pods.setVisible(true);
			scrollPane.setVisible(true);
			zakoncz.setVisible(true);
			dodaKol.setVisible(true);
			
			
			

			
			mNad.setVisible(false);
			  mNad2.setVisible(false); 
			  mDostWoje.setVisible(false);
			  mDostMiast.setVisible(false);
			
		}}}}}}}
				
				 
	  if(zrodlo == potwierdz){
		  
		  sprawdz.setVisible(false);
			podajKod.setVisible(false);
			kodP.setVisible(false);
			potwierdz.setVisible(false);
			cofnij2.setVisible(false);
		 
		  String kodPaczki =kodP.getText();
		  Warunki z = new Warunki();
		  if(z.isParsableAsInteger(kodPaczki)==false){
			  JOptionPane.showMessageDialog(new JFrame(), "B≥πd wprowadü w≥asciwe dane", "Error" ,JOptionPane.ERROR_MESSAGE);
			  sprawdz.setVisible(true);
				podajKod.setVisible(true);
				kodP.setVisible(true);
				potwierdz.setVisible(true);
				cofnij2.setVisible(true);
				
		  }
		  else{
		  kodPaczki2 = Integer.parseInt(kodPaczki);
		  
		  baza g = new baza();
		  zamowienia2 = g.selectZamowienie(kodPaczki2);
		  tabModel = new Model(zamowienia2);
		  g.closeConnection();
		  table = new JTable(tabModel);
		  table.setBounds(15, 100, 650, 220);
		  add(table);
		  scrollPane.setViewportView(table);
		  table.setVisible(true);
		  pods.setVisible(true);
		  scrollPane.setVisible(true);
		  
		  zakoncz3.setVisible(true);
		  sprKol.setVisible(true);
		  cofnij.setVisible(false);
		  anuluj.setVisible(true);
		  zakonczono.setVisible(true);
		  
		  }
		  
	 }
	   if(zrodlo == zobBaze){
		   baza h = new baza();
			  zamowienia3 = h.selectZamowienie();
			  tabModel = new Model(zamowienia3);
			  h.closeConnection();
			  table = new JTable(tabModel);
			  table.setBounds(15, 100, 650, 220);
			  add(table);
			  scrollPane.setViewportView(table);
			  table.setVisible(true);
			  pods.setVisible(true);
			  scrollPane.setVisible(true);
			  zakoncz2.setVisible(true);
			  
			  nadajPrzesylke.setVisible(false);
			  sprawdzPrzesylke.setVisible(false);
			  zobBaze.setVisible(false);
			  tytul.setVisible(false);
			  usunWpis.setVisible(true);
			  usunWpisy.setVisible(true);
			  
			  
			  
		   
	   }
	 
	
	  if(zrodlo == dodaKol){
		  formularz.setVisible(true);
			wybPrzes.setVisible(true);
			wymPaczki.setVisible(true);
			wagaPaczki.setVisible(true);
			wybWoj.setVisible(true);
			miejNad.setVisible(true);
			miejDost.setVisible(true);
			dalej.setVisible(true);
			iloscPole.setVisible(true);
			wagaPole.setVisible(true);
			wymX.setVisible(true);
			wymY.setVisible(true);
			wymZ.setVisible(true);
			mNad.setVisible(true);
			mDostWoje.setVisible(true);
			mNad2.setVisible(true);
			mDostMiast.setVisible(true);
			cenacalk.setVisible(false);
			 table.setVisible(false);
			 rabatto.setVisible(true);
			 rabattokek.setVisible(true);
			 cofnij.setVisible(true);
			 
				pods.setVisible(false);
				scrollPane.setVisible(false);
				zakoncz.setVisible(false);
				dodaKol.setVisible(false);
				
				iloscPole.setText(null);
				wagaPole.setText(null);
				wymX.setText(null);
				wymY.setText(null);
				wymZ.setText(null);
	  }
	  
	  if(zrodlo == zakoncz){
		  nadajPrzesylke.setVisible(true); 
		  sprawdzPrzesylke.setVisible(true);
		 tytul.setVisible(true);
		 zobBaze.setVisible(true);
		  
		  table.setVisible(false);

			pods.setVisible(false);
			scrollPane.setVisible(false);
			zakoncz.setVisible(false);
			sprKol.setVisible(false);
			dodaKol.setVisible(false);
			zamowienia2.clear();
			
			cenacalk.setVisible(false); 	
			cenacalko = 0;
			zamowienia.clear();
			iloscPole.setText(null);
			wagaPole.setText(null);
			wymX.setText(null);
			wymY.setText(null);
			wymZ.setText(null);
			 }
	  
	  if(zrodlo == zakoncz3){
		  table.setVisible(false);
		  pods.setVisible(false);
		  scrollPane.setVisible(false);
		  sprKol.setVisible(false);
		  zakoncz3.setVisible(false);
		  
		  kodP.setText(null);
		  nadajPrzesylke.setVisible(true); 
		  sprawdzPrzesylke.setVisible(true);
		 tytul.setVisible(true);
		 zobBaze.setVisible(true);
		 
		 anuluj.setVisible(false);
		 zakonczono.setVisible(false);
			
			 	
			 }
	  
	  if(zrodlo == zakoncz2){
		  nadajPrzesylke.setVisible(true); 
		  sprawdzPrzesylke.setVisible(true);
		 zobBaze.setVisible(true);
		  tytul.setVisible(true);
		  table.setVisible(false);

			pods.setVisible(false);
			scrollPane.setVisible(false);
			zakoncz2.setVisible(false);
			
			usunWpis.setVisible(false);
			  usunWpisy.setVisible(false);
			zamowienia3.clear();
			usunWpisy.setText(null);
			
			
			 }
	  
	  
	  if (zrodlo == sprKol){
		  sprawdz.setVisible(true);
			podajKod.setVisible(true);
			kodP.setVisible(true);
			potwierdz.setVisible(true);
			cofnij2.setVisible(true);
			
			 table.setVisible(false);
			  pods.setVisible(false);
			  scrollPane.setVisible(false);
			  
			  zakoncz3.setVisible(false);
			  sprKol.setVisible(false);
			  zamowienia2.clear();
			  kodP.setText(null);
			  anuluj.setVisible(false);
			  zakonczono.setVisible(false);
			  
			  
			  
			  
	  }
	  if(zrodlo == cofnij){
		  nadajPrzesylke.setVisible(false);
			sprawdzPrzesylke.setVisible(false);
			
			formularz.setVisible(false);
			wybPrzes.setVisible(false);
			wymPaczki.setVisible(false);
			wagaPaczki.setVisible(false);
			wybWoj.setVisible(false);
			miejNad.setVisible(false);
			miejDost.setVisible(false);
			dalej.setVisible(false);
			iloscPole.setVisible(false);
			wagaPole.setVisible(false);
			wymX.setVisible(false);
			wymY.setVisible(false);
			wymZ.setVisible(false);
			mNad.setVisible(false);
			mDostWoje.setVisible(false);
			rabatto.setVisible(false);
			rabattokek.setVisible(false);
			cofnij.setVisible(false);
			
			mNad2.setVisible(false);
			mDostMiast.setVisible(false);
			
			 nadajPrzesylke.setVisible(true); 
			  sprawdzPrzesylke.setVisible(true);
			 tytul.setVisible(true);
			 zobBaze.setVisible(true);
			 
			 iloscPole.setText(null);
				wagaPole.setText(null);
				wymX.setText(null);
				wymY.setText(null);
				wymZ.setText(null);
			
			
		  
	  }
	  
	  if(zrodlo == cofnij2){
		  sprawdz.setVisible(false);
			podajKod.setVisible(false);
			kodP.setVisible(false);
			potwierdz.setVisible(false);
			cofnij2.setVisible(false);
			
			nadajPrzesylke.setVisible(true); 
			  sprawdzPrzesylke.setVisible(true);
			 tytul.setVisible(true);
			 zobBaze.setVisible(true);
			 kodP.setText(null);
	  }
	  
	  if(zrodlo == usunWpis){
		  
		  
		  String  usun = usunWpisy.getText();
		  Warunki l = new Warunki();
		  if(l.isParsableAsInteger(usun)==false){
			  JOptionPane.showMessageDialog(new JFrame(), "B≥πd wprowadü w≥asciwe dane", "Error" ,JOptionPane.ERROR_MESSAGE);
			
		  }
		  else{
			
			  int usun2 = Integer.parseInt(usun);
				
				baza w = new baza();
				
				w.deleteRecord(usun2);
				
				w.closeConnection();
				
			remove(table); 
			zamowienia3.clear();
			
			 
		baza x = new baza();
			 
		
		
		  zamowienia3 = x.selectZamowienie();
		  tabModel = new Model(zamowienia3);
		  x.closeConnection();
		  table = new JTable(tabModel);
		  table.setBounds(15, 100, 650, 220);
		  add(table);
		  scrollPane.setViewportView(table);
		  table.setVisible(true);
		  pods.setVisible(true);
		  scrollPane.setVisible(true);
		  usunWpisy.setText(null);
		 
			 
	  }}
	  
	  if(zrodlo == zakonczono){
		  baza p = new baza();
		  p.zakoncz(kodPaczki2);
		  p.closeConnection();
		  
		  remove(table);
		  zamowienia2.clear();
		  
		  baza pp = new baza();
		  
		  zamowienia2 = pp.selectZamowienie(kodPaczki2);
		  tabModel = new Model(zamowienia2);
		  pp.closeConnection();
		  table = new JTable(tabModel);
		  table.setBounds(15, 100, 650, 220);
		  add(table);
		  scrollPane.setViewportView(table);
		  table.setVisible(true);
		  pods.setVisible(true);
		  scrollPane.setVisible(true);
		  
		  zakoncz3.setVisible(true);
		  sprKol.setVisible(true);
		  anuluj.setVisible(true);
		  zakonczono.setVisible(true);
		 
		  
		  		  
		  
	  }
	  if(zrodlo == anuluj){
		  
		  baza rr = new baza();
		  
		  double cenaAn = Math.round( (rr.CenaAnuluj(0, kodPaczki2)*0.3) * 100.0 ) / 100.0;
		  rr.closeConnection();
		  
		  baza r = new baza();
		  r.anuluj(kodPaczki2, cenaAn);
		  r.closeConnection();
		  
		  remove(table);
		  zamowienia2.clear();
		  
		  baza rrr = new baza();
		  
		  zamowienia2 = rrr.selectZamowienie(kodPaczki2);
		  tabModel = new Model(zamowienia2);
		  rrr.closeConnection();
		  table = new JTable(tabModel);
		  table.setBounds(15, 100, 650, 220);
		  add(table);
		  scrollPane.setViewportView(table);
		  table.setVisible(true);
		  pods.setVisible(true);
		  scrollPane.setVisible(true);
		  
		  zakoncz3.setVisible(true);
		  sprKol.setVisible(true);
		  anuluj.setVisible(true);
		  zakonczono.setVisible(true);
		 
		  
		  		  
		  
	  }
	  
	}
	} 

