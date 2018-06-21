package okno;


import java.util.List;
import javax.swing.table.AbstractTableModel;


import model.Zamowienie;

public class Model extends AbstractTableModel{
	private List<Zamowienie> listazamowienie ;
	private final static Object[] nazwyKolumn = { "Kod", "Ilosc", "Objêtoœæ", "Waga", "Nadanie","Dostarczanie", "Szacowana data odbioru", "Status", "Cena"};
	
	
	public Model(List<Zamowienie> listazamowienie ) {
		this.listazamowienie = listazamowienie;
	}
		

	@Override
	public int getColumnCount() {
		
		return nazwyKolumn.length;
	}

	@Override
	public int getRowCount() {
		if(listazamowienie.size() == 0) {
			return 0;
		}
		
		return listazamowienie.size();
	}
	

   
	
	@Override
	public Object getValueAt(int row, int column) {
		if(listazamowienie == null) {
			return null;			
		}	
		
		Zamowienie oneZamowienie = listazamowienie.get(row);
		
		
		switch (column) {
		case 0:
			return oneZamowienie.getKod();
		case 1:
			return oneZamowienie.getIlosc();
		case 2:
			return oneZamowienie.getObjetosc();
		case 3:
			return oneZamowienie.getWaga();
		case 4:
			return oneZamowienie.getNadanie();
		case 5:
			return oneZamowienie.getOdbior();
		case 6:
			return oneZamowienie.getDataOdb();
		case 7:
			return oneZamowienie.getStatus();
		case 8:
			return oneZamowienie.getCena();

		
		
		default:
			return oneZamowienie;
		}
	}	
	
	
	@Override
	public String getColumnName(int column) {
		return nazwyKolumn[column].toString();
		
	}

}

