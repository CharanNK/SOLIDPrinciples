package interfaceSeggregationPrinciple;

interface Printer {
	/*
	 * Follows Interface seggregation principle does only printing.
	 * Not overloaded with any other method
	 */
	void print(Document d);
}
