package liskovSubstitutionPrinciple;

public class Square extends Rectangle{
	/*
	 * This class is a violation of the Liskov Substitution Principle
	 */
	
	public Square() {}
	
	public Square(int size) {
		width = height = size;
	}
	
	public void setHeight(int height) {
		this.width = height;
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
		this.height = width;
	}
	
}
