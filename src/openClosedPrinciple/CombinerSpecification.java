package openClosedPrinciple;

public class CombinerSpecification<T> implements Specification<T> {
	private Specification<T> firsSpecification,seconSpecification;

	public CombinerSpecification(Specification<T> first,Specification<T> second){
		this.firsSpecification = first;
		this.seconSpecification = second;
	}
	
	@Override
	public boolean isSatisfied(T item) {
		return firsSpecification.isSatisfied(item) && seconSpecification.isSatisfied(item);
	}
	
	

}
