import java.util.GregorianCalendar;


class Spoil{
		
	public static int getTimeElapsed(String lastWorn){
		GregorianCalendar calendar = new GregorianCalendar();
		String[] dateSplit = lastWorn.split("/");
		String dateElasped = "";
		int month = calendar.get(GregorianCalendar.MONTH) + 1 - Integer.parseInt(dateSplit[0]);
		int day = calendar.get(GregorianCalendar.DAY_OF_MONTH) - Integer.parseInt(dateSplit[1]);
		int year = calendar.get(GregorianCalendar.YEAR) - Integer.parseInt(dateSplit[2]);
		int timeElasped = day + (month*30) + (year*365);
		return timeElasped;
	}
	
	public static boolean getSpoiled(String time, String material, int sweat, int timesWorn){
		
		int clean = 0;
		clean = getTimeElapsed(time);
		if(material.equals("wool") || material.equals("denim") || material.equals("silk")){
			clean /= 2;
		}
		clean += Math.pow(sweat, 3);
		clean *= timesWorn;
		System.out.println(clean);
		if(clean < 80){
			return false;
		}
		else return true;
		
	}
	
	
}



