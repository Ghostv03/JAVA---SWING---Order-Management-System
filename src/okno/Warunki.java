package okno;

public class Warunki {
		
	public static boolean isParsableAsLong(final String s) {
		    try {
		        Long.valueOf(s);
		       
		        return true;
		    } catch (NumberFormatException numberFormatException) {
		        return false;
		    }
		}
	
	public static boolean isParsableAsDouble(final String s) {
	    try {
	        Double.valueOf(s);
	        return true;
	    } catch (NumberFormatException numberFormatException) {
	        return false;
	    }
	}
	
	public static boolean isParsableAsDoubleRab(final String s){
		try{
			if(s.isEmpty()==true){
				return true;
			}
			Double.valueOf(s);
			return true;
		}
		catch (NumberFormatException numberFormatException) {
	        return false;
	    }
		
	}

	public static boolean isParsableAsInteger(final String s) {
	    try {
	        Integer.valueOf(s);
	        return true;
	    } catch (NumberFormatException numberFormatException) {
	        return false;
	    }
	}
		
	}

