package telran.fibonacci.model;

import java.util.Iterator;

public class Fibonacci implements Iterable<Integer> {
	
	private int quantity;

	public Fibonacci(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public Iterator<Integer> iterator() {
		return  new Iterator<Integer>() {
			private int current = 1;
			private int next = 2;
			private int count = 0;

			@Override
			public boolean hasNext() {
				return count < quantity;
			}

			@Override
			public Integer next() {
				if(count == 0) {
					count++;
					return current;
				}
				int temp = current;
				current = next;
				next = temp+current;
				count++;
				return temp;
			}
			
		};
	}

}
