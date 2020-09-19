package openClosedPrinciple;

public interface Specification<T> {
	//this class is open for extension
	boolean isSatisfied(T item);
}
