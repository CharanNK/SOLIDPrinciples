package openClosedPrinciple;

import java.util.List;
import java.util.stream.Stream;

public interface Filter<T> {
	Stream<T> filter(List<T> item,Specification<T> spec);
}
