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
	
	public void mul(int a, int b) {
		int mul = a*b;
		System.out.println(mul);

	}

}
