
public class PaintType {

	private String type;
	private int coverage;
	private int litre;
	private double price;

	public PaintType(String type, int coverage, int litre, double price) {
		this.type = type;
		this.coverage = coverage;
		this.litre = litre;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	public int getLitre() {
		return litre;
	}

	public void setLitre(int litre) {
		this.litre = litre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Type of Paint: " + type + ", Coverage: " + coverage + "m^2 per Litre, Volume: " + litre
				+ ", Cost of paint: price: £" + price;
	}

}
