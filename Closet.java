import java.util.GregorianCalendar;

class Clothes{
	
	private String color;
	private String type;
	private String material;
	private String lastWorn;
	private int sweatLevel;
	private boolean wash;
	
	public Clothes(String color, String type, String material, String lastWorn, int sweatLevel, boolean wash){
		this.color = color;
		this.type = type;
		this.material = material;
		this.lastWorn = lastWorn;
		this.sweatLevel = sweatLevel;
		this.wash = wash;
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
		int whichType = -1;
		
		for(int i = 0; i < cat.length; i++){
			if(cat[i].equals(type)){
				whichType = i;
			}
		}
		
		if(whichType == -1){
			this.type = "Error";
		}
		else this.type = cat[whichType];
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getLastWorn() {
		return lastWorn;
	}

	public void setLastWashed(String lastWorn) {
		
		this.lastWorn = lastWorn;
	}

	public int getSweatLevel() {
		return sweatLevel;
	}

	public void setSweatLevel(int sweatLevel) {
		if(sweatLevel < 6 && sweatLevel > 0){
			this.sweatLevel = sweatLevel;}
		else this.sweatLevel = -9999999;
	}

	public boolean isWash() {
		return wash;
	}

	public void setWash(boolean wash) {
		this.wash = wash;
	}
	
	
}




