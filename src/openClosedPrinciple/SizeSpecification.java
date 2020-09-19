package openClosedPrinciple;

public class SizeSpecification implements Specification<Product> {

	private Size size;
	
	public SizeSpecification(Size size)
	{
		this.size = size;
	}
	
	public boolean isSatisfied(Product item) {
		return item.size == size;
	}

}
