package bazy;
import java.lang.Math;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class Obliczenia {
	
	
	
	public int kod(int g){
		int e = (int) (Math.random()*g);
		return e;
	}
	
	
		
		  
	final static double R = 6372.8; // W kilometrach
    public static double haversine(double dl1, double szer1, double dl2, double szer2) {
    	
    	
    	
        double dLat = Math.toRadians(dl2 - dl1);
        double dLon = Math.toRadians(szer2 - szer1);
        dl1 = Math.toRadians(dl1);
        dl2 = Math.toRadians(dl2);
 
        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(dl1) * Math.cos(dl2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return R * c;
    }
    
    public String data(int iloscdni){
    	Calendar cal = Calendar.getInstance();
    	cal.add(Calendar.DATE, iloscdni);
    	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    	String formatted = format1.format(cal.getTime());
    	return formatted;
    	
    }
   
    public int objetosc(int x, int y, int z, int objetosc){
    
    	objetosc = x*y*z;
    	return objetosc;
    	
    }
    
    public int wartosc(int objetosc, int i ){
    
    if(objetosc > 0 && objetosc <200){
    	i = 1;
    }
    else if(objetosc >=200 && objetosc <500 ){
    	i = 2;
    }
    else if(objetosc >=500 && objetosc <1000){
    	i = 3;
    }
    else if(objetosc >=1000){
    	i = 4;
    }
    return i;
}
    


public double CenaOstateczna(double wagaPaczki, int objetoscPaczki, double cenaZaGabaryt, double iloscKm, double cenaZaKm, int iloscPaczek, double rabat){
	double cena,cenarab,rabb;
	rabb=rabat;
	Math.round(wagaPaczki);
	if (rabb >20)
	{
		rabb=20;
	}

	cenarab = ((iloscPaczek*wagaPaczki * 0.2 + objetoscPaczki*cenaZaGabaryt + iloscKm*cenaZaKm))*(rabb/100);

	cena=(iloscPaczek*wagaPaczki * 0.2 + objetoscPaczki*cenaZaGabaryt + iloscKm*cenaZaKm);
	cena=cena-cenarab;
	return cena;
}

}


