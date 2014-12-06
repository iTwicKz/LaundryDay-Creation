import java.util.GregorianCalendar;


class Spoil{
	
	private int timeElapsed;
	private boolean spoil;
	
	public Spoil(int timeElapsed){
		this.timeElapsed = timeElapsed;
	}
	
	public static int getTimeElapsed(String lastWorn){
		GregorianCalendar calendar = new GregorianCalendar();
		String[] dateSplit = lastWorn.split("/");
		String dateElasped = "";
		int month = Integer.parseInt(dateSplit[0]) - calendar.get(GregorianCalendar.MONTH);
		int day = Integer.parseInt(dateSplit[1]) - calendar.get(GregorianCalendar.DAY_OF_MONTH);
		int year = Integer.parseInt(dateSplit[2]) - calendar.get(GregorianCalendar.YEAR);
		int timeElasped = day + (month*30) + (year*365);
		return timeElasped;
	}
	
	public static boolean getSpoiled(int time, String material, int sweat, int timesWorn){
		
		int clean = 0;
		clean = time;
		if(material.equals("wool") || material.equals("denim") || material.equals("silk")){
			clean /= 2;
		}
		clean += Math.pow(sweat, 3);
		clean *= timesWorn;
		
		if(clean < 30){
			return false;
		}
		else return true;
		
	}
	
	
}



