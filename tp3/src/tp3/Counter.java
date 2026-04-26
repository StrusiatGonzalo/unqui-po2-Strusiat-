package tp3;

import java.util.ArrayList;

public class Counter{
	
	private ArrayList<Integer> array = new ArrayList<Integer>(20);
	
	public Integer getEvenOcurrences() {
			return (int) array.stream()
					.filter(x -> x % 2 == 0)
					.count();
	}
	
	public void addNumber(int x) {
		array.add(x);
	}
	
	public int eddEvenOcurrences() {
		return (int) array.stream()
				.filter(x -> x % 2 != 0)
				.count();
	}
	
	public int divOcurrences(int i) {
		return (int) array.stream()
				.filter(x -> x % i == 0)
				.count();
	}
}


