import java.util.ArrayList;

public class PaintWizard {
	
	private static final String String = null;
	private ArrayList<PaintType> paintList = new ArrayList<PaintType>();
	
	public static void main(String[] args) {
		
		PaintWizard tinList = new PaintWizard();
		
		PaintType paint = new PaintType("Cheapo Max", 10, 20, 19.99);
		PaintType paint1 = new PaintType("Average Joes", 11, 15, 17.99);
		PaintType paint2 = new PaintType("Duluxourous Paints", 10, 20, 25);
		
		tinList.paintList.add(paint);
		tinList.paintList.add(paint1);
		tinList.paintList.add(paint2);
		
		for (PaintType presentPaint : tinList.paintList) {
			System.out.println(presentPaint);
		}
		
		tinList.noOfTins("Average Joes");
		
	}
	
	public void noOfTins(String type) {
		int roomsize = 1600;
		int noOfTins = 0;
		for (PaintType presentPaint : paintList) {
			if (presentPaint.getType().equals(type)) {
				if (roomsize % (presentPaint.getCoverage() * presentPaint.getLitre()) != 0) {
					noOfTins = (roomsize / (presentPaint.getCoverage() * presentPaint.getLitre())) + 1;
				}else {
					noOfTins = (roomsize / (presentPaint.getCoverage() * presentPaint.getLitre()));
				}
			} else {
				
			}
		}System.out.println("No. of tins = " + noOfTins);
	}
	
}
