import java.util.GregorianCalendar;

class Clothes{
	
	private String color;
	private String type;
	private String material;
	private String lastWorn;
	private int sweatLevel;
	private boolean wash;
	private int timesWorn;
	
	public Clothes(){

	}
	
	public Clothes(String color, String type, String material, String lastWorn, int sweatLevel, boolean wash, int timesWorn){
		this.color = color;
		this.type = type;
		this.material = material;
		this.lastWorn = lastWorn;
		this.sweatLevel = sweatLevel;
		this.wash = wash;
		this.timesWorn = timesWorn;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		String[] cat = new String[5];
		cat[0] = "shirt";
		cat[1] = "pants";
		cat[2] = "sweater";
		cat[3] = "socks";
		cat[4] = "underwear";
		int whichType = 1;
		
		for(int i = 0; i < cat.length; i++){
			if(cat[i].equals(type)){
				whichType = i;
			}
		}
		
		this.type = cat[whichType];
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		String[] cat = new String[6];
		cat[0] = "cotton";
		cat[1] = "polyester";
		cat[2] = "wool";
		cat[3] = "silk";
		cat[4] = "denim";
		cat[5] = "corduroy";
		int whichType = -1;
		
		for(int i = 0; i < cat.length; i++){
			if(cat[i].equals(material)){
				whichType = i;
			}
		}
		
		if(whichType == -1){
			this.material = "Error";
		}
		else this.material = cat[whichType];
		this.material = material;
	}

	public String getLastWorn() {
		return lastWorn;
	}

	public void setLastWorn(String lastWorn) {
		
		this.lastWorn = lastWorn;
	}

	public int getSweatLevel() {
		return sweatLevel;
	}

	public void setSweatLevel(String sweat) {
		int sweatLevel = Integer.parseInt(sweat);
		this.sweatLevel = sweatLevel;
	}


	public boolean setWash() {
		
		int time = Spoil.getTimeElapsed(lastWorn);
		boolean needsToClean = Spoil.getSpoiled(lastWorn, material, sweatLevel, timesWorn);
		return needsToClean;
	}
	

	public boolean isWash() {
		return wash;
	}
	
	public int getTimesWorn(){
		return timesWorn;
	}
	
	public void setTimesWorn(String times){
		int timesWorn = Integer.parseInt(times);
		this.timesWorn = timesWorn;
	}
	
	public String toString(){
		return color + ", " + material + " " + type + System.getProperty("line.separator") + "Last Worn: " + lastWorn + System.getProperty("line.separator");
	}
}




