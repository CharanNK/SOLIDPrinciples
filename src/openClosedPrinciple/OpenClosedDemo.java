package openClosedPrinciple;
import java.util.*;

public class OpenClosedDemo {

	public static void main(String[] args) {
		Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
		Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
	    Product house = new Product("House", Color.BLUE, Size.LARGE);
	    
	    List<Product> productList = new ArrayList<Product>();
	    productList.add(apple);
	    productList.add(tree);
	    productList.add(house);
	    
	    ProductFilter productsfilFilter = new ProductFilter();
	    System.out.println("Green products (old)");
	    productsfilFilter.filterByColor(productList, Color.GREEN).forEach(
	    		p-> System.out.println(""+p.name+" is Green"));
	    
	    BetterFilter betterFilter = new BetterFilter();
	    
	    System.out.println("Green producsts (new)");
	    betterFilter.filter(productList,new ColorSpecification(Color.GREEN))
	    	.forEach(p -> System.out.println(""+p.name+" is Green"));
	    
	    System.out.println("Large products");
	    betterFilter.filter(productList, new SizeSpecification(Size.LARGE))
	        .forEach(p -> System.out.println(""+p.name+" is Large"));
	    
	    System.out.println("Large blue product");
	    betterFilter.filter(productList, 
	    		new CombinerSpecification<>(new ColorSpecification(Color.BLUE), new SizeSpecification(Size.LARGE)))
	    		.forEach(p -> System.out.println(" -"+p.name+" is large and blue"));
	}

}
