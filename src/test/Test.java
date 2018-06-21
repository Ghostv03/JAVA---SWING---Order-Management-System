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
	        a.insertMiasta("Tychy","Œl¹skie",18.59,50.08);
	        a.insertMiasta("Katowice","Œl¹skie",19.00,50.15);
	        a.insertMiasta("Bielsko-Bia³a","Œl¹skie",19.04,49.50);
	        a.insertMiasta("Rybnik","Œl¹skie",18.33,50.05);
	        a.insertMiasta("Sosnowiec","Œl¹skie",19.08,50.17);
	        //WIELKOPOLSKIE
	        a.insertMiasta("Kalisz","Wielkopolskie",18.06,51.46);
	        a.insertMiasta("Konin","Wielkopolskie",18.16,52.13);
	        a.insertMiasta("Leszno","Wielkopolskie",16.34,51.51);
	        a.insertMiasta("Poznañ","Wielkopolskie",16.55,52.25);
	        a.insertMiasta("Jarocin","Wielkopolskie",17.30,51.58);
	        //MALOPOLSKIE
	        a.insertMiasta("Kraków","Ma³opolskie",19.57,50.03);
	        a.insertMiasta("Nowy S¹cz","Ma³opolskie",20.42,49.37);
	        a.insertMiasta("Tarnów","Ma³opolskie",21.00,50.02);
	        a.insertMiasta("Oœwiêcim","Ma³opolskie",19.08,50.02);
	        a.insertMiasta("Wadowice","Ma³opolskie",19.30,49.53);
	        //DOLNOSLASKIE
	        a.insertMiasta("Wroc³aw","Dolnoœl¹skie",17.02,51.07);
	        a.insertMiasta("Wa³brzych","Dolnoœl¹skie",16.17,50.47);
	        a.insertMiasta("Legnica","Dolnoœl¹skie",16.10,51.13);
	        a.insertMiasta("Jelenia Góra","Dolnoœl¹skie",15.44,50.54);
	        a.insertMiasta("Sobótka","Dolnoœl¹skie",16.45,50.54);
	        //POMORSKIE
	        a.insertMiasta("Gdañsk","Pomorskie",18.38,54.22);
	        a.insertMiasta("Gdynia","Pomorskie",18.32,54.32);
	        a.insertMiasta("Sopot","Pomorskie",18.33,54.26);
	        a.insertMiasta("Kwidzyñ","Pomorskie",18.56,53.44);
	        a.insertMiasta("S³upsk","Pomorskie",17.02,54.28);
	        //LUBELSKIE
	        a.insertMiasta("Che³m","Lubelskie",23.29,51.08);
	        a.insertMiasta("Lublin","Lubelskie",22.34,51.14);
	        a.insertMiasta("Zamoœæ","Lubelskie",23.16,50.43);
	        a.insertMiasta("Bia³a Podlaska","Lubelskie",23.07,52.02);
	        a.insertMiasta("Bi³goraj","Lubelskie",22.43,50.32);
	        //PODKARPACKIE
	        a.insertMiasta("Krosno","Podkarpackie",21.46,49.42);
	        a.insertMiasta("Przemyœl","Podkarpackie",22.47,49.48);
	        a.insertMiasta("Rzeszów","Podkarpackie",22.01,50.03);
	        a.insertMiasta("Tarnobrzeg","Podkarpackie",21.41,50.35);
	        a.insertMiasta("Le¿ajsk","Podkarpackie",22.26,50.16);
	        //KUJAWSKO-POMORSKIE
	        a.insertMiasta("Bydgoszcz","Kujawsko-pomorskie",18.00,53.07);
	        a.insertMiasta("Grudzi¹dz","Kujawsko-pomorskie",18.46,53.29);
	        a.insertMiasta("Toruñ","Kujawsko-pomorskie",18.37,53.02);
	        a.insertMiasta("W³oc³awek","Kujawsko-pomorskie",19.03,52.39);
	        a.insertMiasta("Inowroc³aw","Kujawsko-pomorskie",18.15,52.48);
	        //ZACHODNIOPOMORSKIE
	        a.insertMiasta("Koszalin","Zachodniopomorskie",16.11,54.11);
	        a.insertMiasta("Szczecin","Zachodniopomorskie",14.34,53.26);
	        a.insertMiasta("Œwinoujœcie","Zachodniopomorskie",14.15,53.55);
	        a.insertMiasta("Wêgorzyno","Zachodniopomorskie",15.33,53.32);
	        a.insertMiasta("Œwidwin","Zachodniopomorskie",15.47,53.47);
	        //WARMINSKO-MAZURSKIE
	        a.insertMiasta("Elbl¹g","Warmiñsko-mazurskie",19.24,54.10);
	        a.insertMiasta("Olsztyn","Warmiñsko-mazurskie",20.30,53.47);
	        a.insertMiasta("Kêtrzyn","Warmiñsko-mazurskie",21.23,54.05);
	        a.insertMiasta("Mr¹gowo","Warmiñsko-mazurskie",21.18,53.52);
	        a.insertMiasta("Gi¿ycko","Warmiñsko-mazurskie",21.47,54.02);
	        //SWIETOKRZYSKIE
	        a.insertMiasta("Kielce","Œwiêtokrzyskie",20.37,50.53);
	        a.insertMiasta("Ma³ogoszcz","Œwiêtokrzyskie",20.16,50.49);
	        a.insertMiasta("Staszów","Œwiêtokrzyskie",21.10,50.34);
	        a.insertMiasta("O¿arów","Œwiêtokrzyskie",21.40,50.53);
	        a.insertMiasta("Suchedniów","Œwiêtokrzyskie",20.50,51.03);
	        //PODLASKIE
	        a.insertMiasta("Bia³ystok","Podlaskie",23.10,53.08);
	        a.insertMiasta("£om¿a","Podlaskie",22.04,53.11);
	        a.insertMiasta("Suwa³ki","Podlaskie",22.56,54.06);
	        a.insertMiasta("Knyszyn","Podlaskie",22.55,53.18);
	        a.insertMiasta("Jedwabne","Podlaskie",22.18,53.17);
	        //LUBUSKIE
	        a.insertMiasta("Gorzów Wielkopolski","Lubuskie",15.14,52.44);
	        a.insertMiasta("Zielona Góra","Lubuskie",15.30,51.56);
	        a.insertMiasta("Krosno Odrzañskie","Lubuskie",15.06,52.02);
	        a.insertMiasta("Sulechów","Lubuskie",15.37,52.05);
	        a.insertMiasta("Babimost","Lubuskie",15.50,52.09);
	        //OPOLSKIE
	        a.insertMiasta("Opole","Opolskie",17.56,50.40);
	        a.insertMiasta("Niemodlin","Opolskie",17.37,50.38);
	        a.insertMiasta("Ozimek","Opolskie",18.13,50.41);
	        a.insertMiasta("Kluczbork","Opolskie",18.13,50.58);
	        a.insertMiasta("Byczyna","Opolskie",18.13,51.07);
	        //LODZKIE
	        a.insertMiasta("£ódŸ","£ódzkie",19.28,51.47);
	        a.insertMiasta("Zgierz","£ódzkie",19.25,51.52);
	        a.insertMiasta("Pabianice","£ódzkie",19.22,51.40);
	        a.insertMiasta("Piotrków Trybunalski","£ódzkie",19.41,51.24);
	        a.insertMiasta("Skierniewice","£ódzkie",20.08,51.58);
	        //MAZOWIECKIE
	        a.insertMiasta("Warszawa","Mazowieckie",21.02,52.12);
	        a.insertMiasta("P³ock","Mazowieckie",19.42,52.33);
	        a.insertMiasta("Radom","Mazowieckie",21.10,51.24);
	        a.insertMiasta("Siedlce","Mazowieckie",22.17,52.11);
	        a.insertMiasta("Ostro³êka","Mazowieckie",21.35,53.05);
	       
	       
	        a.insertDostawa(	"£ódzkie",	"£ódzkie",	0.20,	1);
	        a.insertDostawa(	"Mazowieckie",	"£ódzkie",	0.32,	2);
	        a.insertDostawa(	"Œl¹skie",	"£ódzkie",	0.45,	4);
	        a.insertDostawa(	"Wielkopolskie",	"£ódzkie",	0.48,	3);
	        a.insertDostawa(	"Ma³opolskie",	"£ódzkie",	0.45,	2);
	        a.insertDostawa(	"Dolnoœl¹skie",	"£ódzkie",	0.68,	4);
	        a.insertDostawa(	"Pomorskie",	"£ódzkie",	0.62,	5);
	        a.insertDostawa(	"Lubelskie",	"£ódzkie",	0.64,	6);
	        a.insertDostawa(	"Podkarpackie",	"£ódzkie",	0.62,	7);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"£ódzkie",	0.52,	9);
	        a.insertDostawa(	"Zachodniopomorskie",	"£ódzkie",	0.42,	10);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"£ódzkie",	0.53,	2);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"£ódzkie",	0.56,	3);
	        a.insertDostawa(	"Podlaskie",	"£ódzkie",	0.59,	4);
	        a.insertDostawa(	"Lubuskie",	"£ódzkie",	0.56,	2);
	        a.insertDostawa(	"Opolskie",	"£ódzkie",	0.44,	3);
	        a.insertDostawa(	"£ódzkie",	"Mazowieckie",	0.32,	5);
	        a.insertDostawa(	"Mazowieckie",	"Mazowieckie",	0.20,	1);
	        a.insertDostawa(	"Œl¹skie",	"Mazowieckie",	0.32,	2);
	        a.insertDostawa(	"Wielkopolskie",	"Mazowieckie",	0.45,	4);
	        a.insertDostawa(	"Ma³opolskie",	"Mazowieckie",	0.48,	3);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Mazowieckie",	0.45,	2);
	        a.insertDostawa(	"Pomorskie",	"Mazowieckie",	0.68,	4);
	        a.insertDostawa(	"Lubelskie",	"Mazowieckie",	0.62,	5);
	        a.insertDostawa(	"Podkarpackie",	"Mazowieckie",	0.64,	6);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Mazowieckie",	0.62,	7);
	        a.insertDostawa(	"Zachodniopomorskie",	"Mazowieckie",	0.52,	9);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Mazowieckie",	0.42,	10);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Mazowieckie",	0.53,	2);
	        a.insertDostawa(	"Podlaskie",	"Mazowieckie",	0.56,	3);
	        a.insertDostawa(	"Lubuskie",	"Mazowieckie",	0.59,	4);
	        a.insertDostawa(	"Opolskie",	"Mazowieckie",	0.56,	2);
	        a.insertDostawa(	"£ódzkie",	"Œl¹skie",	0.45,	3);
	        a.insertDostawa(	"Mazowieckie",	"Œl¹skie",	0.56,	5);
	        a.insertDostawa(	"Œl¹skie",	"Œl¹skie",	0.20,	1);
	        a.insertDostawa(	"Wielkopolskie",	"Œl¹skie",	0.64,	2);
	        a.insertDostawa(	"Ma³opolskie",	"Œl¹skie",	0.62,	4);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Œl¹skie",	0.52,	3);
	        a.insertDostawa(	"Pomorskie",	"Œl¹skie",	0.42,	2);
	        a.insertDostawa(	"Lubelskie",	"Œl¹skie",	0.53,	4);
	        a.insertDostawa(	"Podkarpackie",	"Œl¹skie",	0.56,	5);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Œl¹skie",	0.59,	6);
	        a.insertDostawa(	"Zachodniopomorskie",	"Œl¹skie",	0.56,	7);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Œl¹skie",	0.42,	9);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Œl¹skie",	0.53,	10);
	        a.insertDostawa(	"Podlaskie",	"Œl¹skie",	0.56,	2);
	        a.insertDostawa(	"Lubuskie",	"Œl¹skie",	0.59,	3);
	        a.insertDostawa(	"Opolskie",	"Œl¹skie",	0.56,	4);
	        a.insertDostawa(	"£ódzkie",	"Wielkopolskie",	0.48,	2);
	        a.insertDostawa(	"Mazowieckie",	"Wielkopolskie",	0.53,	3);
	        a.insertDostawa(	"Œl¹skie",	"Wielkopolskie",	0.56,	5);
	        a.insertDostawa(	"Wielkopolskie",	"Wielkopolskie",	0.20,	1);
	        a.insertDostawa(	"Ma³opolskie",	"Wielkopolskie",	0.53,	2);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Wielkopolskie",	0.56,	4);
	        a.insertDostawa(	"Pomorskie",	"Wielkopolskie",	0.59,	3);
	        a.insertDostawa(	"Lubelskie",	"Wielkopolskie",	0.56,	2);
	        a.insertDostawa(	"Podkarpackie",	"Wielkopolskie",	0.42,	4);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Wielkopolskie",	0.53,	5);
	        a.insertDostawa(	"Zachodniopomorskie",	"Wielkopolskie",	0.56,	6);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Wielkopolskie",	0.59,	7);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Wielkopolskie",	0.56,	9);
	        a.insertDostawa(	"Podlaskie",	"Wielkopolskie",	0.48,	10);
	        a.insertDostawa(	"Lubuskie",	"Wielkopolskie",	0.53,	2);
	        a.insertDostawa(	"Opolskie",	"Wielkopolskie",	0.53,	3);
	        a.insertDostawa(	"£ódzkie",	"Ma³opolskie",	0.45,	4);
	        a.insertDostawa(	"Mazowieckie",	"Ma³opolskie",	0.56,	2);
	        a.insertDostawa(	"Œl¹skie",	"Ma³opolskie",	0.59,	3);
	        a.insertDostawa(	"Wielkopolskie",	"Ma³opolskie",	0.56,	5);
	        a.insertDostawa(	"Ma³opolskie",	"Ma³opolskie",	0.20,	1);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Ma³opolskie",	0.56,	2);
	        a.insertDostawa(	"Pomorskie",	"Ma³opolskie",	0.59,	4);
	        a.insertDostawa(	"Lubelskie",	"Ma³opolskie",	0.56,	3);
	        a.insertDostawa(	"Podkarpackie",	"Ma³opolskie",	0.42,	2);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Ma³opolskie",	0.53,	4);
	        a.insertDostawa(	"Zachodniopomorskie",	"Ma³opolskie",	0.56,	5);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Ma³opolskie",	0.59,	6);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Ma³opolskie",	0.56,	7);
	        a.insertDostawa(	"Podlaskie",	"Ma³opolskie",	0.48,	9);
	        a.insertDostawa(	"Lubuskie",	"Ma³opolskie",	0.53,	10);
	        a.insertDostawa(	"Opolskie",	"Ma³opolskie",	0.20,	2);
	        a.insertDostawa(	"£ódzkie",	"Dolnoœl¹skie",	0.68,	3);
	        a.insertDostawa(	"Mazowieckie",	"Dolnoœl¹skie",	0.42,	4);
	        a.insertDostawa(	"Œl¹skie",	"Dolnoœl¹skie",	0.53,	2);
	        a.insertDostawa(	"Wielkopolskie",	"Dolnoœl¹skie",	0.56,	3);
	        a.insertDostawa(	"Ma³opolskie",	"Dolnoœl¹skie",	0.59,	5);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Dolnoœl¹skie",	0.20,	1);
	        a.insertDostawa(	"Pomorskie",	"Dolnoœl¹skie",	0.42,	2);
	        a.insertDostawa(	"Lubelskie",	"Dolnoœl¹skie",	0.53,	4);
	        a.insertDostawa(	"Podkarpackie",	"Dolnoœl¹skie",	0.56,	3);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Dolnoœl¹skie",	0.59,	2);
	        a.insertDostawa(	"Zachodniopomorskie",	"Dolnoœl¹skie",	0.56,	4);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Dolnoœl¹skie",	0.45,	5);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Dolnoœl¹skie",	0.56,	6);
	        a.insertDostawa(	"Podlaskie",	"Dolnoœl¹skie",	0.20,	7);
	        a.insertDostawa(	"Lubuskie",	"Dolnoœl¹skie",	0.64,	9);
	        a.insertDostawa(	"Opolskie",	"Dolnoœl¹skie",	0.62,	10);
	        a.insertDostawa(	"£ódzkie",	"Pomorskie",	0.62,	2);
	        a.insertDostawa(	"Mazowieckie",	"Pomorskie",	0.20,	3);
	        a.insertDostawa(	"Œl¹skie",	"Pomorskie",	0.64,	4);
	        a.insertDostawa(	"Wielkopolskie",	"Pomorskie",	0.62,	2);
	        a.insertDostawa(	"Ma³opolskie",	"Pomorskie",	0.52,	3);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Pomorskie",	0.42,	5);
	        a.insertDostawa(	"Pomorskie",	"Pomorskie",	0.20,	1);
	        a.insertDostawa(	"Lubelskie",	"Pomorskie",	0.52,	2);
	        a.insertDostawa(	"Podkarpackie",	"Pomorskie",	0.42,	4);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Pomorskie",	0.53,	3);
	        a.insertDostawa(	"Zachodniopomorskie",	"Pomorskie",	0.56,	2);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Pomorskie",	0.59,	4);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Pomorskie",	0.56,	5);
	        a.insertDostawa(	"Podlaskie",	"Pomorskie",	0.45,	6);
	        a.insertDostawa(	"Lubuskie",	"Pomorskie",	0.56,	7);
	        a.insertDostawa(	"Opolskie",	"Pomorskie",	0.20,	9);
	        a.insertDostawa(	"£ódzkie",	"Lubelskie",	0.64,	10);
	        a.insertDostawa(	"Mazowieckie",	"Lubelskie",	0.62,	2);
	        a.insertDostawa(	"Œl¹skie",	"Lubelskie",	0.52,	3);
	        a.insertDostawa(	"Wielkopolskie",	"Lubelskie",	0.42,	4);
	        a.insertDostawa(	"Ma³opolskie",	"Lubelskie",	0.62,	2);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Lubelskie",	0.52,	3);
	        a.insertDostawa(	"Pomorskie",	"Lubelskie",	0.42,	5);
	        a.insertDostawa(	"Lubelskie",	"Lubelskie",	0.20,	1);
	        a.insertDostawa(	"Podkarpackie",	"Lubelskie",	0.53,	2);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Lubelskie",	0.56,	4);
	        a.insertDostawa(	"Zachodniopomorskie",	"Lubelskie",	0.59,	3);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Lubelskie",	0.56,	2);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Lubelskie",	0.45,	4);
	        a.insertDostawa(	"Podlaskie",	"Lubelskie",	0.56,	5);
	        a.insertDostawa(	"Lubuskie",	"Lubelskie",	0.20,	6);
	        a.insertDostawa(	"Opolskie",	"Lubelskie",	0.64,	7);
	        a.insertDostawa(	"£ódzkie",	"Podkarpackie",	0.62,	9);
	        a.insertDostawa(	"Mazowieckie",	"Podkarpackie",	0.52,	10);
	        a.insertDostawa(	"Œl¹skie",	"Podkarpackie",	0.42,	2);
	        a.insertDostawa(	"Wielkopolskie",	"Podkarpackie",	0.62,	3);
	        a.insertDostawa(	"Ma³opolskie",	"Podkarpackie",	0.52,	4);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Podkarpackie",	0.42,	2);
	        a.insertDostawa(	"Pomorskie",	"Podkarpackie",	0.52,	3);
	        a.insertDostawa(	"Lubelskie",	"Podkarpackie",	0.42,	5);
	        a.insertDostawa(	"Podkarpackie",	"Podkarpackie",	0.20,	1);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Podkarpackie",	0.45,	2);
	        a.insertDostawa(	"Zachodniopomorskie",	"Podkarpackie",	0.48,	4);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Podkarpackie",	0.45,	3);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Podkarpackie",	0.68,	2);
	        a.insertDostawa(	"Podlaskie",	"Podkarpackie",	0.62,	4);
	        a.insertDostawa(	"Lubuskie",	"Podkarpackie",	0.64,	5);
	        a.insertDostawa(	"Opolskie",	"Podkarpackie",	0.62,	6);
	        a.insertDostawa(	"£ódzkie",	"Kujawsko-pomorskie",	0.52,	7);
	        a.insertDostawa(	"Mazowieckie",	"Kujawsko-pomorskie",	0.42,	9);
	        a.insertDostawa(	"Œl¹skie",	"Kujawsko-pomorskie",	0.53,	10);
	        a.insertDostawa(	"Wielkopolskie",	"Kujawsko-pomorskie",	0.56,	2);
	        a.insertDostawa(	"Ma³opolskie",	"Kujawsko-pomorskie",	0.59,	3);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Kujawsko-pomorskie",	0.42,	4);
	        a.insertDostawa(	"Pomorskie",	"Kujawsko-pomorskie",	0.53,	2);
	        a.insertDostawa(	"Lubelskie",	"Kujawsko-pomorskie",	0.56,	3);
	        a.insertDostawa(	"Podkarpackie",	"Kujawsko-pomorskie",	0.59,	5);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Kujawsko-pomorskie",	0.20,	1);
	        a.insertDostawa(	"Zachodniopomorskie",	"Kujawsko-pomorskie",	0.45,	2);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Kujawsko-pomorskie",	0.48,	4);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Kujawsko-pomorskie",	0.45,	3);
	        a.insertDostawa(	"Podlaskie",	"Kujawsko-pomorskie",	0.68,	2);
	        a.insertDostawa(	"Lubuskie",	"Kujawsko-pomorskie",	0.62,	4);
	        a.insertDostawa(	"Opolskie",	"Kujawsko-pomorskie",	0.64,	5);
	        a.insertDostawa(	"£ódzkie",	"Zachodniopomorskie",	0.62,	6);
	        a.insertDostawa(	"Mazowieckie",	"Zachodniopomorskie",	0.52,	7);
	        a.insertDostawa(	"Œl¹skie",	"Zachodniopomorskie",	0.42,	9);
	        a.insertDostawa(	"Wielkopolskie",	"Zachodniopomorskie",	0.53,	10);
	        a.insertDostawa(	"Ma³opolskie",	"Zachodniopomorskie",	0.56,	2);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Zachodniopomorskie",	0.59,	3);
	        a.insertDostawa(	"Pomorskie",	"Zachodniopomorskie",	0.42,	4);
	        a.insertDostawa(	"Lubelskie",	"Zachodniopomorskie",	0.53,	2);
	        a.insertDostawa(	"Podkarpackie",	"Zachodniopomorskie",	0.56,	3);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Zachodniopomorskie",	0.59,	5);
	        a.insertDostawa(	"Zachodniopomorskie",	"Zachodniopomorskie",	0.20,	1);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Zachodniopomorskie",	0.45,	2);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Zachodniopomorskie",	0.48,	4);
	        a.insertDostawa(	"Podlaskie",	"Zachodniopomorskie",	0.45,	3);
	        a.insertDostawa(	"Lubuskie",	"Zachodniopomorskie",	0.68,	2);
	        a.insertDostawa(	"Opolskie",	"Zachodniopomorskie",	0.62,	4);
	        a.insertDostawa(	"£ódzkie",	"Warmiñsko-mazurskie",	0.64,	5);
	        a.insertDostawa(	"Mazowieckie",	"Warmiñsko-mazurskie",	0.62,	6);
	        a.insertDostawa(	"Œl¹skie",	"Warmiñsko-mazurskie",	0.52,	7);
	        a.insertDostawa(	"Wielkopolskie",	"Warmiñsko-mazurskie",	0.42,	9);
	        a.insertDostawa(	"Ma³opolskie",	"Warmiñsko-mazurskie",	0.53,	10);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Warmiñsko-mazurskie",	0.56,	2);
	        a.insertDostawa(	"Pomorskie",	"Warmiñsko-mazurskie",	0.59,	3);
	        a.insertDostawa(	"Lubelskie",	"Warmiñsko-mazurskie",	0.42,	4);
	        a.insertDostawa(	"Podkarpackie",	"Warmiñsko-mazurskie",	0.53,	2);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Warmiñsko-mazurskie",	0.56,	3);
	        a.insertDostawa(	"Zachodniopomorskie",	"Warmiñsko-mazurskie",	0.59,	5);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Warmiñsko-mazurskie",	0.20,	1);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Warmiñsko-mazurskie",	0.45,	2);
	        a.insertDostawa(	"Podlaskie",	"Warmiñsko-mazurskie",	0.48,	4);
	        a.insertDostawa(	"Lubuskie",	"Warmiñsko-mazurskie",	0.45,	3);
	        a.insertDostawa(	"Opolskie",	"Warmiñsko-mazurskie",	0.68,	2);
	        a.insertDostawa(	"£ódzkie",	"Œwiêtokrzyskie",	0.62,	4);
	        a.insertDostawa(	"Mazowieckie",	"Œwiêtokrzyskie",	0.64,	5);
	        a.insertDostawa(	"Œl¹skie",	"Œwiêtokrzyskie",	0.62,	6);
	        a.insertDostawa(	"Wielkopolskie",	"Œwiêtokrzyskie",	0.52,	7);
	        a.insertDostawa(	"Ma³opolskie",	"Œwiêtokrzyskie",	0.42,	9);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Œwiêtokrzyskie",	0.53,	10);
	        a.insertDostawa(	"Pomorskie",	"Œwiêtokrzyskie",	0.56,	2);
	        a.insertDostawa(	"Lubelskie",	"Œwiêtokrzyskie",	0.59,	3);
	        a.insertDostawa(	"Podkarpackie",	"Œwiêtokrzyskie",	0.42,	4);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Œwiêtokrzyskie",	0.53,	2);
	        a.insertDostawa(	"Zachodniopomorskie",	"Œwiêtokrzyskie",	0.56,	3);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Œwiêtokrzyskie",	0.59,	5);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Œwiêtokrzyskie",	0.20,	1);
	        a.insertDostawa(	"Podlaskie",	"Œwiêtokrzyskie",	0.32,	2);
	        a.insertDostawa(	"Lubuskie",	"Œwiêtokrzyskie",	0.45,	4);
	        a.insertDostawa(	"Opolskie",	"Œwiêtokrzyskie",	0.48,	3);
	        a.insertDostawa(	"£ódzkie",	"Podlaskie",	0.45,	2);
	        a.insertDostawa(	"Mazowieckie",	"Podlaskie",	0.68,	4);
	        a.insertDostawa(	"Œl¹skie",	"Podlaskie",	0.62,	5);
	        a.insertDostawa(	"Wielkopolskie",	"Podlaskie",	0.64,	6);
	        a.insertDostawa(	"Ma³opolskie",	"Podlaskie",	0.62,	7);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Podlaskie",	0.52,	9);
	        a.insertDostawa(	"Pomorskie",	"Podlaskie",	0.42,	10);
	        a.insertDostawa(	"Lubelskie",	"Podlaskie",	0.53,	2);
	        a.insertDostawa(	"Podkarpackie",	"Podlaskie",	0.56,	3);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Podlaskie",	0.59,	4);
	        a.insertDostawa(	"Zachodniopomorskie",	"Podlaskie",	0.56,	2);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Podlaskie",	0.44,	3);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Podlaskie",	0.44,	5);
	        a.insertDostawa(	"Podlaskie",	"Podlaskie",	0.20,	1);
	        a.insertDostawa(	"Lubuskie",	"Podlaskie",	0.32,	2);
	        a.insertDostawa(	"Opolskie",	"Podlaskie",	0.45,	4);
	        a.insertDostawa(	"£ódzkie",	"Lubuskie",	0.48,	3);
	        a.insertDostawa(	"Mazowieckie",	"Lubuskie",	0.45,	2);
	        a.insertDostawa(	"Œl¹skie",	"Lubuskie",	0.68,	4);
	        a.insertDostawa(	"Wielkopolskie",	"Lubuskie",	0.62,	5);
	        a.insertDostawa(	"Ma³opolskie",	"Lubuskie",	0.64,	6);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Lubuskie",	0.62,	7);
	        a.insertDostawa(	"Pomorskie",	"Lubuskie",	0.52,	9);
	        a.insertDostawa(	"Lubelskie",	"Lubuskie",	0.42,	10);
	        a.insertDostawa(	"Podkarpackie",	"Lubuskie",	0.53,	2);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Lubuskie",	0.56,	3); 
	        a.insertDostawa(	"Zachodniopomorskie",	"Lubuskie",	0.59,	4);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Lubuskie",	0.56,	2);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Lubuskie",	0.44,	3);
	        a.insertDostawa(	"Podlaskie",	"Lubuskie",	0.44,	5);
	        a.insertDostawa(	"Lubuskie",	"Lubuskie",	0.20,	1);
	        a.insertDostawa(	"Opolskie",	"Lubuskie",	0.32,	2);
	        a.insertDostawa(	"£ódzkie",	"Opolskie",	0.45,	4);
	        a.insertDostawa(	"Mazowieckie",	"Opolskie",	0.48,	3);
	        a.insertDostawa(	"Œl¹skie",	"Opolskie",	0.45,	2);
	        a.insertDostawa(	"Wielkopolskie",	"Opolskie",	0.68,	4);
	        a.insertDostawa(	"Ma³opolskie",	"Opolskie",	0.62,	5);
	        a.insertDostawa(	"Dolnoœl¹skie",	"Opolskie",	0.64,	6);
	        a.insertDostawa(	"Pomorskie",	"Opolskie",	0.62,	7);
	        a.insertDostawa(	"Lubelskie",	"Opolskie",	0.52,	9);
	        a.insertDostawa(	"Podkarpackie",	"Opolskie",	0.42,	10);
	        a.insertDostawa(	"Kujawsko-pomorskie",	"Opolskie",	0.53,	2);
	        a.insertDostawa(	"Zachodniopomorskie",	"Opolskie",	0.56,	3);
	        a.insertDostawa(	"Warmiñsko-mazurskie",	"Opolskie",	0.59,	4);
	        a.insertDostawa(	"Œwiêtokrzyskie",	"Opolskie",	0.56,	2);
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


