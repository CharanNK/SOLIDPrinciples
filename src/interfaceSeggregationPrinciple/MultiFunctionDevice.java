package interfaceSeggregationPrinciple;

public class MultiFunctionDevice implements Printer,Scanner {
	/*
	 * This class follows the decorator pattern
	 */
	public Printer printer;
	public Scanner scanner;
	
	public MultiFunctionDevice(Printer printer,Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;
	}
	
	@Override
	public void scan(Document d) {
		scanner.scan(d);
		
	}
	@Override
	public void print(Document d) {
		printer.print(d);
	}
	
	

}
