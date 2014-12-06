import java.util.GregorianCalendar;


public class TimeSpoil {

}

class TimeSpoil{
	
	private int timeElapsed;
	
	public TimeSpoil(){
		
	}
	
	public int getTimeElapsed(String lastWorn){
		GregorianCalendar calendar = new GregorianCalendar();
		String[] dateSplit = lastWorn.split("/");
		String dateElasped = "";
		int month = Integer.parseInt(dateSplit[0]) - calendar.get(GregorianCalendar.MONTH);
		int day = Integer.parseInt(dateSplit[1]) - calendar.get(GregorianCalendar.DAY_OF_MONTH);
		int year = Integer.parseInt(dateSplit[2]) - calendar.get(GregorianCalendar.YEAR);
		int timeElasped = day + (month*30) + (year*365);
		return timeElasped;
	}
	
	
	
}
