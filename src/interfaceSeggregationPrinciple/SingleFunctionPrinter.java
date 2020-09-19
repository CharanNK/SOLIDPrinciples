package interfaceSeggregationPrinciple;

public class SingleFunctionPrinter implements Machine {

	@Override
	public void print(Document doc) {
		// print document
		
	}

	@Override
	public void scan(Document doc) throws Exception {
		throw new Exception();
	}

	@Override
	public void fax(Document doc) {
		// throw an exception or leave this null
		
	}

}
