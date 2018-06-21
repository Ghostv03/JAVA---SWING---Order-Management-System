package test;



import java.util.List;

import javax.swing.JFrame;

import model.Dostawa;
import model.Gabaryty;
import model.Miasta;
import model.Zamowienie;
import okno.Okno;
import bazy.baza;

public class Test {
	
	
    
	
	 
	    public static void main(String[] args) {
	        baza a = new baza();
	       
	       /* //SLASKIE
	        a.insertMiasta("Tychy","�l�skie",18.59,50.08);
	        a.insertMiasta("Katowice","�l�skie",19.00,50.15);
	        a.insertMiasta("Bielsko-Bia�a","�l�skie",19.04,49.50);
	        a.insertMiasta("Rybnik","�l�skie",18.33,50.05);
	        a.insertMiasta("Sosnowiec","�l�skie",19.08,50.17);
	        //WIELKOPOLSKIE
	        a.insertMiasta("Kalisz","Wielkopolskie",18.06,51.46);
	        a.insertMiasta("Konin","Wielkopolskie",18.16,52.13);
	        a.insertMiasta("Leszno","Wielkopolskie",16.34,51.51);
	        a.insertMiasta("Pozna�","Wielkopolskie",16.55,52.25);
	        a.insertMiasta("Jarocin","Wielkopolskie",17.30,51.58);
	        //MALOPOLSKIE
	        a.insertMiasta("Krak�w","Ma�opolskie",19.57,50.03);
	        a.insertMiasta("Nowy S�cz","Ma�opolskie",20.42,49.37);
	        a.insertMiasta("Tarn�w","Ma�opolskie",21.00,50.02);
	        a.insertMiasta("O�wi�cim","Ma�opolskie",19.08,50.02);
	        a.insertMiasta("Wadowice","Ma�opolskie",19.30,49.53);
	        //DOLNOSLASKIE
	        a.insertMiasta("Wroc�aw","Dolno�l�skie",17.02,51.07);
	        a.insertMiasta("Wa�brzych","Dolno�l�skie",16.17,50.47);
	        a.insertMiasta("Legnica","Dolno�l�skie",16.10,51.13);
	        a.insertMiasta("Jelenia G�ra","Dolno�l�skie",15.44,50.54);
	        a.insertMiasta("Sob�tka","Dolno�l�skie",16.45,50.54);
	        //POMORSKIE
	        a.insertMiasta("Gda�sk","Pomorskie",18.38,54.22);
	        a.insertMiasta("Gdynia","Pomorskie",18.32,54.32);
	        a.insertMiasta("Sopot","Pomorskie",18.33,54.26);
	        a.insertMiasta("Kwidzy�","Pomorskie",18.56,53.44);
	        a.insertMiasta("S�upsk","Pomorskie",17.02,54.28);
	        //LUBELSKIE
	        a.insertMiasta("Che�m","Lubelskie",23.29,51.08);
	        a.insertMiasta("Lublin","Lubelskie",22.34,51.14);
	        a.insertMiasta("Zamo��","Lubelskie",23.16,50.43);
	        a.insertMiasta("Bia�a Podlaska","Lubelskie",23.07,52.02);
	        a.insertMiasta("Bi�goraj","Lubelskie",22.43,50.32);
	        //PODKARPACKIE
	        a.insertMiasta("Krosno","Podkarpackie",21.46,49.42);
	        a.insertMiasta("Przemy�l","Podkarpackie",22.47,49.48);
	        a.insertMiasta("Rzesz�w","Podkarpackie",22.01,50.03);
	        a.insertMiasta("Tarnobrzeg","Podkarpackie",21.41,50.35);
	        a.insertMiasta("Le�ajsk","Podkarpackie",22.26,50.16);
	        //KUJAWSKO-POMORSKIE
	        a.insertMiasta("Bydgoszcz","Kujawsko-pomorskie",18.00,53.07);
	        a.insertMiasta("Grudzi�dz","Kujawsko-pomorskie",18.46,53.29);
	        a.insertMiasta("Toru�","Kujawsko-pomorskie",18.37,53.02);
	        a.insertMiasta("W�oc�awek","Kujawsko-pomorskie",19.03,52.39);
	        a.insertMiasta("Inowroc�aw","Kujawsko-pomorskie",18.15,52.48);
	        //ZACHODNIOPOMORSKIE
	        a.insertMiasta("Koszalin","Zachodniopomorskie",16.11,54.11);
	        a.insertMiasta("Szczecin","Zachodniopomorskie",14.34,53.26);
	        a.insertMiasta("�winouj�cie","Zachodniopomorskie",14.15,53.55);
	        a.insertMiasta("W�gorzyno","Zachodniopomorskie",15.33,53.32);
	        a.insertMiasta("�widwin","Zachodniopomorskie",15.47,53.47);
	        //WARMINSKO-MAZURSKIE
	        a.insertMiasta("Elbl�g","Warmi�sko-mazurskie",19.24,54.10);
	        a.insertMiasta("Olsztyn","Warmi�sko-mazurskie",20.30,53.47);
	        a.insertMiasta("K�trzyn","Warmi�sko-mazurskie",21.23,54.05);
	        a.insertMiasta("Mr�gowo","Warmi�sko-mazurskie",21.18,53.52);
	        a.insertMiasta("Gi�ycko","Warmi�sko-mazurskie",21.47,54.02);
	        //SWIETOKRZYSKIE
	        a.insertMiasta("Kielce","�wi�tokrzyskie",20.37,50.53);
	        a.insertMiasta("Ma�ogoszcz","�wi�tokrzyskie",20.16,50.49);
	        a.insertMiasta("Stasz�w","�wi�tokrzyskie",21.10,50.34);
	        a.insertMiasta("O�ar�w","�wi�tokrzyskie",21.40,50.53);
	        a.insertMiasta("Suchedni�w","�wi�tokrzyskie",20.50,51.03);
	        //PODLASKIE
	        a.insertMiasta("Bia�ystok","Podlaskie",23.10,53.08);
	        a.insertMiasta("�om�a","Podlaskie",22.04,53.11);
	        a.insertMiasta("Suwa�ki","Podlaskie",22.56,54.06);
	        a.insertMiasta("Knyszyn","Podlaskie",22.55,53.18);
	        a.insertMiasta("Jedwabne","Podlaskie",22.18,53.17);
	        //LUBUSKIE
	        a.insertMiasta("Gorz�w Wielkopolski","Lubuskie",15.14,52.44);
	        a.insertMiasta("Zielona G�ra","Lubuskie",15.30,51.56);
	        a.insertMiasta("Krosno Odrza�skie","Lubuskie",15.06,52.02);
	        a.insertMiasta("Sulech�w","Lubuskie",15.37,52.05);
	        a.insertMiasta("Babimost","Lubuskie",15.50,52.09);
	        //OPOLSKIE
	        a.insertMiasta("Opole","Opolskie",17.56,50.40);
	        a.insertMiasta("Niemodlin","Opolskie",17.37,50.38);
	        a.insertMiasta("Ozimek","Opolskie",18.13,50.41);
	        a.insertMiasta("Kluczbork","Opolskie",18.13,50.58);
	        a.insertMiasta("Byczyna","Opolskie",18.13,51.07);
	        //LODZKIE
	        a.insertMiasta("��d�","��dzkie",19.28,51.47);
	        a.insertMiasta("Zgierz","��dzkie",19.25,51.52);
	        a.insertMiasta("Pabianice","��dzkie",19.22,51.40);
	        a.insertMiasta("Piotrk�w Trybunalski","��dzkie",19.41,51.24);
	        a.insertMiasta("Skierniewice","��dzkie",20.08,51.58);
	        //MAZOWIECKIE
	        a.insertMiasta("Warszawa","Mazowieckie",21.02,52.12);
	        a.insertMiasta("P�ock","Mazowieckie",19.42,52.33);
	        a.insertMiasta("Radom","Mazowieckie",21.10,51.24);
	        a.insertMiasta("Siedlce","Mazowieckie",22.17,52.11);
	        a.insertMiasta("Ostro��ka","Mazowieckie",21.35,53.05);
	       
	       
	        a.insertDostawa(	"��dzkie",	"��dzkie",	0.20,	1);
	        a.insertDostawa(	"Mazowieckie",	"��dzkie",	0.32,	2);
	        a.insertDostawa(	"�l�skie",	"��dzkie",	0.45,	4);
	        a.insertDostawa(	"Wielkopolskie",	"��dzkie",	0.48,	3);
	        a.insertDostawa(	"Ma�opolskie",	"��dzkie",	0.45,	2);
	        a.insertDostawa(	"Dolno�l�skie",	"��dzkie",	0.68,	4);
	        a.insertDostawa(	"Pomorskie",	"��dzkie",	0.62,	5);
	        a.insertDostawa(	"Lubelskie",	"��dzkie",	0.64,	6);
	        a.insertDostawa(	"Podkarpackie",	"��dzkie",	0.62,	7);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"��dzkie",	0.52,	9);
	        a.insertDostawa(	"Zachodniopomorskie",	"��dzkie",	0.42,	10);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"��dzkie",	0.53,	2);
	        a.insertDostawa(	"�wi�tokrzyskie",	"��dzkie",	0.56,	3);
	        a.insertDostawa(	"Podlaskie",	"��dzkie",	0.59,	4);
	        a.insertDostawa(	"Lubuskie",	"��dzkie",	0.56,	2);
	        a.insertDostawa(	"Opolskie",	"��dzkie",	0.44,	3);
	        a.insertDostawa(	"��dzkie",	"Mazowieckie",	0.32,	5);
	        a.insertDostawa(	"Mazowieckie",	"Mazowieckie",	0.20,	1);
	        a.insertDostawa(	"�l�skie",	"Mazowieckie",	0.32,	2);
	        a.insertDostawa(	"Wielkopolskie",	"Mazowieckie",	0.45,	4);
	        a.insertDostawa(	"Ma�opolskie",	"Mazowieckie",	0.48,	3);
	        a.insertDostawa(	"Dolno�l�skie",	"Mazowieckie",	0.45,	2);
	        a.insertDostawa(	"Pomorskie",	"Mazowieckie",	0.68,	4);
	        a.insertDostawa(	"Lubelskie",	"Mazowieckie",	0.62,	5);
	        a.insertDostawa(	"Podkarpackie",	"Mazowieckie",	0.64,	6);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Mazowieckie",	0.62,	7);
	        a.insertDostawa(	"Zachodniopomorskie",	"Mazowieckie",	0.52,	9);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Mazowieckie",	0.42,	10);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Mazowieckie",	0.53,	2);
	        a.insertDostawa(	"Podlaskie",	"Mazowieckie",	0.56,	3);
	        a.insertDostawa(	"Lubuskie",	"Mazowieckie",	0.59,	4);
	        a.insertDostawa(	"Opolskie",	"Mazowieckie",	0.56,	2);
	        a.insertDostawa(	"��dzkie",	"�l�skie",	0.45,	3);
	        a.insertDostawa(	"Mazowieckie",	"�l�skie",	0.56,	5);
	        a.insertDostawa(	"�l�skie",	"�l�skie",	0.20,	1);
	        a.insertDostawa(	"Wielkopolskie",	"�l�skie",	0.64,	2);
	        a.insertDostawa(	"Ma�opolskie",	"�l�skie",	0.62,	4);
	        a.insertDostawa(	"Dolno�l�skie",	"�l�skie",	0.52,	3);
	        a.insertDostawa(	"Pomorskie",	"�l�skie",	0.42,	2);
	        a.insertDostawa(	"Lubelskie",	"�l�skie",	0.53,	4);
	        a.insertDostawa(	"Podkarpackie",	"�l�skie",	0.56,	5);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"�l�skie",	0.59,	6);
	        a.insertDostawa(	"Zachodniopomorskie",	"�l�skie",	0.56,	7);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"�l�skie",	0.42,	9);
	        a.insertDostawa(	"�wi�tokrzyskie",	"�l�skie",	0.53,	10);
	        a.insertDostawa(	"Podlaskie",	"�l�skie",	0.56,	2);
	        a.insertDostawa(	"Lubuskie",	"�l�skie",	0.59,	3);
	        a.insertDostawa(	"Opolskie",	"�l�skie",	0.56,	4);
	        a.insertDostawa(	"��dzkie",	"Wielkopolskie",	0.48,	2);
	        a.insertDostawa(	"Mazowieckie",	"Wielkopolskie",	0.53,	3);
	        a.insertDostawa(	"�l�skie",	"Wielkopolskie",	0.56,	5);
	        a.insertDostawa(	"Wielkopolskie",	"Wielkopolskie",	0.20,	1);
	        a.insertDostawa(	"Ma�opolskie",	"Wielkopolskie",	0.53,	2);
	        a.insertDostawa(	"Dolno�l�skie",	"Wielkopolskie",	0.56,	4);
	        a.insertDostawa(	"Pomorskie",	"Wielkopolskie",	0.59,	3);
	        a.insertDostawa(	"Lubelskie",	"Wielkopolskie",	0.56,	2);
	        a.insertDostawa(	"Podkarpackie",	"Wielkopolskie",	0.42,	4);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Wielkopolskie",	0.53,	5);
	        a.insertDostawa(	"Zachodniopomorskie",	"Wielkopolskie",	0.56,	6);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Wielkopolskie",	0.59,	7);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Wielkopolskie",	0.56,	9);
	        a.insertDostawa(	"Podlaskie",	"Wielkopolskie",	0.48,	10);
	        a.insertDostawa(	"Lubuskie",	"Wielkopolskie",	0.53,	2);
	        a.insertDostawa(	"Opolskie",	"Wielkopolskie",	0.53,	3);
	        a.insertDostawa(	"��dzkie",	"Ma�opolskie",	0.45,	4);
	        a.insertDostawa(	"Mazowieckie",	"Ma�opolskie",	0.56,	2);
	        a.insertDostawa(	"�l�skie",	"Ma�opolskie",	0.59,	3);
	        a.insertDostawa(	"Wielkopolskie",	"Ma�opolskie",	0.56,	5);
	        a.insertDostawa(	"Ma�opolskie",	"Ma�opolskie",	0.20,	1);
	        a.insertDostawa(	"Dolno�l�skie",	"Ma�opolskie",	0.56,	2);
	        a.insertDostawa(	"Pomorskie",	"Ma�opolskie",	0.59,	4);
	        a.insertDostawa(	"Lubelskie",	"Ma�opolskie",	0.56,	3);
	        a.insertDostawa(	"Podkarpackie",	"Ma�opolskie",	0.42,	2);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Ma�opolskie",	0.53,	4);
	        a.insertDostawa(	"Zachodniopomorskie",	"Ma�opolskie",	0.56,	5);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Ma�opolskie",	0.59,	6);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Ma�opolskie",	0.56,	7);
	        a.insertDostawa(	"Podlaskie",	"Ma�opolskie",	0.48,	9);
	        a.insertDostawa(	"Lubuskie",	"Ma�opolskie",	0.53,	10);
	        a.insertDostawa(	"Opolskie",	"Ma�opolskie",	0.20,	2);
	        a.insertDostawa(	"��dzkie",	"Dolno�l�skie",	0.68,	3);
	        a.insertDostawa(	"Mazowieckie",	"Dolno�l�skie",	0.42,	4);
	        a.insertDostawa(	"�l�skie",	"Dolno�l�skie",	0.53,	2);
	        a.insertDostawa(	"Wielkopolskie",	"Dolno�l�skie",	0.56,	3);
	        a.insertDostawa(	"Ma�opolskie",	"Dolno�l�skie",	0.59,	5);
	        a.insertDostawa(	"Dolno�l�skie",	"Dolno�l�skie",	0.20,	1);
	        a.insertDostawa(	"Pomorskie",	"Dolno�l�skie",	0.42,	2);
	        a.insertDostawa(	"Lubelskie",	"Dolno�l�skie",	0.53,	4);
	        a.insertDostawa(	"Podkarpackie",	"Dolno�l�skie",	0.56,	3);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Dolno�l�skie",	0.59,	2);
	        a.insertDostawa(	"Zachodniopomorskie",	"Dolno�l�skie",	0.56,	4);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Dolno�l�skie",	0.45,	5);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Dolno�l�skie",	0.56,	6);
	        a.insertDostawa(	"Podlaskie",	"Dolno�l�skie",	0.20,	7);
	        a.insertDostawa(	"Lubuskie",	"Dolno�l�skie",	0.64,	9);
	        a.insertDostawa(	"Opolskie",	"Dolno�l�skie",	0.62,	10);
	        a.insertDostawa(	"��dzkie",	"Pomorskie",	0.62,	2);
	        a.insertDostawa(	"Mazowieckie",	"Pomorskie",	0.20,	3);
	        a.insertDostawa(	"�l�skie",	"Pomorskie",	0.64,	4);
	        a.insertDostawa(	"Wielkopolskie",	"Pomorskie",	0.62,	2);
	        a.insertDostawa(	"Ma�opolskie",	"Pomorskie",	0.52,	3);
	        a.insertDostawa(	"Dolno�l�skie",	"Pomorskie",	0.42,	5);
	        a.insertDostawa(	"Pomorskie",	"Pomorskie",	0.20,	1);
	        a.insertDostawa(	"Lubelskie",	"Pomorskie",	0.52,	2);
	        a.insertDostawa(	"Podkarpackie",	"Pomorskie",	0.42,	4);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Pomorskie",	0.53,	3);
	        a.insertDostawa(	"Zachodniopomorskie",	"Pomorskie",	0.56,	2);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Pomorskie",	0.59,	4);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Pomorskie",	0.56,	5);
	        a.insertDostawa(	"Podlaskie",	"Pomorskie",	0.45,	6);
	        a.insertDostawa(	"Lubuskie",	"Pomorskie",	0.56,	7);
	        a.insertDostawa(	"Opolskie",	"Pomorskie",	0.20,	9);
	        a.insertDostawa(	"��dzkie",	"Lubelskie",	0.64,	10);
	        a.insertDostawa(	"Mazowieckie",	"Lubelskie",	0.62,	2);
	        a.insertDostawa(	"�l�skie",	"Lubelskie",	0.52,	3);
	        a.insertDostawa(	"Wielkopolskie",	"Lubelskie",	0.42,	4);
	        a.insertDostawa(	"Ma�opolskie",	"Lubelskie",	0.62,	2);
	        a.insertDostawa(	"Dolno�l�skie",	"Lubelskie",	0.52,	3);
	        a.insertDostawa(	"Pomorskie",	"Lubelskie",	0.42,	5);
	        a.insertDostawa(	"Lubelskie",	"Lubelskie",	0.20,	1);
	        a.insertDostawa(	"Podkarpackie",	"Lubelskie",	0.53,	2);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Lubelskie",	0.56,	4);
	        a.insertDostawa(	"Zachodniopomorskie",	"Lubelskie",	0.59,	3);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Lubelskie",	0.56,	2);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Lubelskie",	0.45,	4);
	        a.insertDostawa(	"Podlaskie",	"Lubelskie",	0.56,	5);
	        a.insertDostawa(	"Lubuskie",	"Lubelskie",	0.20,	6);
	        a.insertDostawa(	"Opolskie",	"Lubelskie",	0.64,	7);
	        a.insertDostawa(	"��dzkie",	"Podkarpackie",	0.62,	9);
	        a.insertDostawa(	"Mazowieckie",	"Podkarpackie",	0.52,	10);
	        a.insertDostawa(	"�l�skie",	"Podkarpackie",	0.42,	2);
	        a.insertDostawa(	"Wielkopolskie",	"Podkarpackie",	0.62,	3);
	        a.insertDostawa(	"Ma�opolskie",	"Podkarpackie",	0.52,	4);
	        a.insertDostawa(	"Dolno�l�skie",	"Podkarpackie",	0.42,	2);
	        a.insertDostawa(	"Pomorskie",	"Podkarpackie",	0.52,	3);
	        a.insertDostawa(	"Lubelskie",	"Podkarpackie",	0.42,	5);
	        a.insertDostawa(	"Podkarpackie",	"Podkarpackie",	0.20,	1);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Podkarpackie",	0.45,	2);
	        a.insertDostawa(	"Zachodniopomorskie",	"Podkarpackie",	0.48,	4);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Podkarpackie",	0.45,	3);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Podkarpackie",	0.68,	2);
	        a.insertDostawa(	"Podlaskie",	"Podkarpackie",	0.62,	4);
	        a.insertDostawa(	"Lubuskie",	"Podkarpackie",	0.64,	5);
	        a.insertDostawa(	"Opolskie",	"Podkarpackie",	0.62,	6);
	        a.insertDostawa(	"��dzkie",	"Kujawsko-pomorskie",	0.52,	7);
	        a.insertDostawa(	"Mazowieckie",	"Kujawsko-pomorskie",	0.42,	9);
	        a.insertDostawa(	"�l�skie",	"Kujawsko-pomorskie",	0.53,	10);
	        a.insertDostawa(	"Wielkopolskie",	"Kujawsko-pomorskie",	0.56,	2);
	        a.insertDostawa(	"Ma�opolskie",	"Kujawsko-pomorskie",	0.59,	3);
	        a.insertDostawa(	"Dolno�l�skie",	"Kujawsko-pomorskie",	0.42,	4);
	        a.insertDostawa(	"Pomorskie",	"Kujawsko-pomorskie",	0.53,	2);
	        a.insertDostawa(	"Lubelskie",	"Kujawsko-pomorskie",	0.56,	3);
	        a.insertDostawa(	"Podkarpackie",	"Kujawsko-pomorskie",	0.59,	5);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Kujawsko-pomorskie",	0.20,	1);
	        a.insertDostawa(	"Zachodniopomorskie",	"Kujawsko-pomorskie",	0.45,	2);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Kujawsko-pomorskie",	0.48,	4);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Kujawsko-pomorskie",	0.45,	3);
	        a.insertDostawa(	"Podlaskie",	"Kujawsko-pomorskie",	0.68,	2);
	        a.insertDostawa(	"Lubuskie",	"Kujawsko-pomorskie",	0.62,	4);
	        a.insertDostawa(	"Opolskie",	"Kujawsko-pomorskie",	0.64,	5);
	        a.insertDostawa(	"��dzkie",	"Zachodniopomorskie",	0.62,	6);
	        a.insertDostawa(	"Mazowieckie",	"Zachodniopomorskie",	0.52,	7);
	        a.insertDostawa(	"�l�skie",	"Zachodniopomorskie",	0.42,	9);
	        a.insertDostawa(	"Wielkopolskie",	"Zachodniopomorskie",	0.53,	10);
	        a.insertDostawa(	"Ma�opolskie",	"Zachodniopomorskie",	0.56,	2);
	        a.insertDostawa(	"Dolno�l�skie",	"Zachodniopomorskie",	0.59,	3);
	        a.insertDostawa(	"Pomorskie",	"Zachodniopomorskie",	0.42,	4);
	        a.insertDostawa(	"Lubelskie",	"Zachodniopomorskie",	0.53,	2);
	        a.insertDostawa(	"Podkarpackie",	"Zachodniopomorskie",	0.56,	3);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Zachodniopomorskie",	0.59,	5);
	        a.insertDostawa(	"Zachodniopomorskie",	"Zachodniopomorskie",	0.20,	1);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Zachodniopomorskie",	0.45,	2);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Zachodniopomorskie",	0.48,	4);
	        a.insertDostawa(	"Podlaskie",	"Zachodniopomorskie",	0.45,	3);
	        a.insertDostawa(	"Lubuskie",	"Zachodniopomorskie",	0.68,	2);
	        a.insertDostawa(	"Opolskie",	"Zachodniopomorskie",	0.62,	4);
	        a.insertDostawa(	"��dzkie",	"Warmi�sko-mazurskie",	0.64,	5);
	        a.insertDostawa(	"Mazowieckie",	"Warmi�sko-mazurskie",	0.62,	6);
	        a.insertDostawa(	"�l�skie",	"Warmi�sko-mazurskie",	0.52,	7);
	        a.insertDostawa(	"Wielkopolskie",	"Warmi�sko-mazurskie",	0.42,	9);
	        a.insertDostawa(	"Ma�opolskie",	"Warmi�sko-mazurskie",	0.53,	10);
	        a.insertDostawa(	"Dolno�l�skie",	"Warmi�sko-mazurskie",	0.56,	2);
	        a.insertDostawa(	"Pomorskie",	"Warmi�sko-mazurskie",	0.59,	3);
	        a.insertDostawa(	"Lubelskie",	"Warmi�sko-mazurskie",	0.42,	4);
	        a.insertDostawa(	"Podkarpackie",	"Warmi�sko-mazurskie",	0.53,	2);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Warmi�sko-mazurskie",	0.56,	3);
	        a.insertDostawa(	"Zachodniopomorskie",	"Warmi�sko-mazurskie",	0.59,	5);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Warmi�sko-mazurskie",	0.20,	1);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Warmi�sko-mazurskie",	0.45,	2);
	        a.insertDostawa(	"Podlaskie",	"Warmi�sko-mazurskie",	0.48,	4);
	        a.insertDostawa(	"Lubuskie",	"Warmi�sko-mazurskie",	0.45,	3);
	        a.insertDostawa(	"Opolskie",	"Warmi�sko-mazurskie",	0.68,	2);
	        a.insertDostawa(	"��dzkie",	"�wi�tokrzyskie",	0.62,	4);
	        a.insertDostawa(	"Mazowieckie",	"�wi�tokrzyskie",	0.64,	5);
	        a.insertDostawa(	"�l�skie",	"�wi�tokrzyskie",	0.62,	6);
	        a.insertDostawa(	"Wielkopolskie",	"�wi�tokrzyskie",	0.52,	7);
	        a.insertDostawa(	"Ma�opolskie",	"�wi�tokrzyskie",	0.42,	9);
	        a.insertDostawa(	"Dolno�l�skie",	"�wi�tokrzyskie",	0.53,	10);
	        a.insertDostawa(	"Pomorskie",	"�wi�tokrzyskie",	0.56,	2);
	        a.insertDostawa(	"Lubelskie",	"�wi�tokrzyskie",	0.59,	3);
	        a.insertDostawa(	"Podkarpackie",	"�wi�tokrzyskie",	0.42,	4);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"�wi�tokrzyskie",	0.53,	2);
	        a.insertDostawa(	"Zachodniopomorskie",	"�wi�tokrzyskie",	0.56,	3);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"�wi�tokrzyskie",	0.59,	5);
	        a.insertDostawa(	"�wi�tokrzyskie",	"�wi�tokrzyskie",	0.20,	1);
	        a.insertDostawa(	"Podlaskie",	"�wi�tokrzyskie",	0.32,	2);
	        a.insertDostawa(	"Lubuskie",	"�wi�tokrzyskie",	0.45,	4);
	        a.insertDostawa(	"Opolskie",	"�wi�tokrzyskie",	0.48,	3);
	        a.insertDostawa(	"��dzkie",	"Podlaskie",	0.45,	2);
	        a.insertDostawa(	"Mazowieckie",	"Podlaskie",	0.68,	4);
	        a.insertDostawa(	"�l�skie",	"Podlaskie",	0.62,	5);
	        a.insertDostawa(	"Wielkopolskie",	"Podlaskie",	0.64,	6);
	        a.insertDostawa(	"Ma�opolskie",	"Podlaskie",	0.62,	7);
	        a.insertDostawa(	"Dolno�l�skie",	"Podlaskie",	0.52,	9);
	        a.insertDostawa(	"Pomorskie",	"Podlaskie",	0.42,	10);
	        a.insertDostawa(	"Lubelskie",	"Podlaskie",	0.53,	2);
	        a.insertDostawa(	"Podkarpackie",	"Podlaskie",	0.56,	3);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Podlaskie",	0.59,	4);
	        a.insertDostawa(	"Zachodniopomorskie",	"Podlaskie",	0.56,	2);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Podlaskie",	0.44,	3);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Podlaskie",	0.44,	5);
	        a.insertDostawa(	"Podlaskie",	"Podlaskie",	0.20,	1);
	        a.insertDostawa(	"Lubuskie",	"Podlaskie",	0.32,	2);
	        a.insertDostawa(	"Opolskie",	"Podlaskie",	0.45,	4);
	        a.insertDostawa(	"��dzkie",	"Lubuskie",	0.48,	3);
	        a.insertDostawa(	"Mazowieckie",	"Lubuskie",	0.45,	2);
	        a.insertDostawa(	"�l�skie",	"Lubuskie",	0.68,	4);
	        a.insertDostawa(	"Wielkopolskie",	"Lubuskie",	0.62,	5);
	        a.insertDostawa(	"Ma�opolskie",	"Lubuskie",	0.64,	6);
	        a.insertDostawa(	"Dolno�l�skie",	"Lubuskie",	0.62,	7);
	        a.insertDostawa(	"Pomorskie",	"Lubuskie",	0.52,	9);
	        a.insertDostawa(	"Lubelskie",	"Lubuskie",	0.42,	10);
	        a.insertDostawa(	"Podkarpackie",	"Lubuskie",	0.53,	2);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Lubuskie",	0.56,	3); 
	        a.insertDostawa(	"Zachodniopomorskie",	"Lubuskie",	0.59,	4);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Lubuskie",	0.56,	2);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Lubuskie",	0.44,	3);
	        a.insertDostawa(	"Podlaskie",	"Lubuskie",	0.44,	5);
	        a.insertDostawa(	"Lubuskie",	"Lubuskie",	0.20,	1);
	        a.insertDostawa(	"Opolskie",	"Lubuskie",	0.32,	2);
	        a.insertDostawa(	"��dzkie",	"Opolskie",	0.45,	4);
	        a.insertDostawa(	"Mazowieckie",	"Opolskie",	0.48,	3);
	        a.insertDostawa(	"�l�skie",	"Opolskie",	0.45,	2);
	        a.insertDostawa(	"Wielkopolskie",	"Opolskie",	0.68,	4);
	        a.insertDostawa(	"Ma�opolskie",	"Opolskie",	0.62,	5);
	        a.insertDostawa(	"Dolno�l�skie",	"Opolskie",	0.64,	6);
	        a.insertDostawa(	"Pomorskie",	"Opolskie",	0.62,	7);
	        a.insertDostawa(	"Lubelskie",	"Opolskie",	0.52,	9);
	        a.insertDostawa(	"Podkarpackie",	"Opolskie",	0.42,	10);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Opolskie",	0.53,	2);
	        a.insertDostawa(	"Zachodniopomorskie",	"Opolskie",	0.56,	3);
	        a.insertDostawa(	"Warmi�sko-mazurskie",	"Opolskie",	0.59,	4);
	        a.insertDostawa(	"�wi�tokrzyskie",	"Opolskie",	0.56,	2);
	        a.insertDostawa(	"Podlaskie",	"Opolskie",	0.44,	3);
	        a.insertDostawa(	"Lubuskie",	"Opolskie",	0.44,	5);
	        a.insertDostawa(	"Opolskie",	"Opolskie",	0.20,	1);

	        
	       
	        a.insertGabaryty(100, 0.1);
	        a.insertGabaryty(350, 0.075);
	        a.insertGabaryty(750, 0.025);
	        a.insertGabaryty(1000,0.01);
	        */
	       
	        
	        List<Miasta> miasta = a.selectMiasta();
	        List<Gabaryty> gabaryty = a.selectGabaryty();
	        List<Dostawa> dostawa = a.selectDostawa();
	        List<Zamowienie> zamowienie = a.selectZamowienie();
	        
	        Okno okno = new Okno(zamowienie);
		      okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      
		      okno.setVisible(true);
	        
	        
	       /* for (Zamowienie b : zamowienie) {
	        System.out.println(b);*/

	        
	        
	       
	        
	       // miasta.removeAll(miasta);
	        //gabaryty.removeAll(gabaryty);
	        //dostawa.removeAll(dostawa);
	        //zamowienie.removeAll(zamowienie);
	 
	       
	        
	        /*System.out.println("Miasta: ");
	        for(Miasta c: miasta)
	            System.out.println(c);
	 
	       
	        
	        System.out.println("Gabaryty:");
	        for(Gabaryty p: gabaryty)
	            System.out.println(p);
	        
	        System.out.println("Dostawy:");
	        for(Dostawa p: dostawa)
	            System.out.println(p);*/
	        
	       /* System.out.println("Zamowienia:");
	        for(Zamowienie p: zamowienie1)
	            System.out.println(p); */
	        
	        
	        
	       
	 
	        a.closeConnection();
	    }
	    
	    
	    }


