package genericsPracticesServices;

import java.util.List;

public class CalculationService<T> {
	public static <T extends Comparable<? super T>> T max(List<T> list) {
		if(list.isEmpty()) {
			throw new IllegalStateException("List caan't be empty");
		}
		T max= list.get(0);
		for(T item : list) { // to compare with max and see what is a bigger number
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}
}
