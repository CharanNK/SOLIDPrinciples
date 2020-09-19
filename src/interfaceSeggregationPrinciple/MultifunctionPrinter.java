package interfaceSeggregationPrinciple;

public class MultifunctionPrinter implements Machine{

	@Override
	public void print(Document doc) {
		// print document
	}

	@Override
	public void scan(Document doc) {
		// scan document
	}

	@Override
	public void fax(Document doc) {
		// fax document
	}
	
}
