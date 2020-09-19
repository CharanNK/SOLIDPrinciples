package openClosedPrinciple;
import java.util.*;
import java.util.stream.Stream;

public class ProductFilter {
	
	//This class violates the Open Closed Principle. You would have to write more methods when the number of criteria increases
	public Stream<Product> filterByColor(List<Product> products, Color color)
	{
	   return products.stream().filter(p -> p.color == color);
	}
	
	public Stream<Product> filterBySize(List<Product> products, Size size){
		return products.stream().filter(p -> p.size == size);
	}
	
	public Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color)
	{
	   return products.stream().filter(p -> p.size == size && p.color == color);
	}
}
