package interfaceSeggregationPrinciple;

public interface Machine {
	/*
	 * This is a violation of Interface seggregation principle
	 * A simple printer might be able to ONLY print a document and the remaining two methods become 
	 * redundant for it but they would have to extend them.
	 */
	public void print(Document doc);
	public void scan(Document doc) throws Exception;
	public void fax(Document doc);
}
