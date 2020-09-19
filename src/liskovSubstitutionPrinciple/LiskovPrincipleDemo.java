package liskovSubstitutionPrinciple;

public class LiskovPrincipleDemo {
	
	static void useIt(Rectangle rect) {
		int width = rect.getWidth();
		rect.setHeight(10);
		System.out.println("Expected area : "+(width*10)+"\nGot area :"+rect.getArea());
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(2,3);
		useIt(rect);
		
		Rectangle square = new Square();
		square.setWidth(10);
		square.setHeight(5);
		useIt(square);
	}

}
