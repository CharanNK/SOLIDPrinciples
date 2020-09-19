package liskovSubstitutionPrinciple;

public class RectangleFactory {
	
	/*
	 * This class upholds the Liskov Substitution principle
	 */
	
	public static Rectangle newSquare(int side) {
		return new Rectangle(side,side);
	}
	
	public static Rectangle newRectangle(int width, int height) {
		return new Rectangle(width,height);
	}
}
