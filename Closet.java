
class Clothes{
	
	private String color;
	private String type;
	private String material;
	private int lastWashed;
	private int sweatLevel;
	private boolean wash;
	
	public Clothes(String color, String type, String material, int lastWashed, int sweatLevel, boolean wash){
		this.color = color;
		this.type = type;
		this.material = material;
		this.lastWashed = lastWashed;
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
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getLastWashed() {
		return lastWashed;
	}

	public void setLastWashed(int lastWashed) {
		this.lastWashed = lastWashed;
	}

	public int getSweatLevel() {
		return sweatLevel;
	}

	public void setSweatLevel(int sweatLevel) {
		this.sweatLevel = sweatLevel;
	}

	public boolean isWash() {
		return wash;
	}

	public void setWash(boolean wash) {
		this.wash = wash;
	}
	
	
}
