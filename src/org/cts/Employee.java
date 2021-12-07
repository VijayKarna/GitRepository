package org.cts;

public class Employee {
	private void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.add(10, 20);
	}

}
