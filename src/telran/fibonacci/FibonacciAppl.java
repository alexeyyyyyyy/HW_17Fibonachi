package telran.fibonacci;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci(8);
		int sum = 0;
		
		for (int num : fibonacci) {
			System.out.println(num + " ");
			sum += num;
		}
		System.out.println("Sum = " + sum);
	}

}
