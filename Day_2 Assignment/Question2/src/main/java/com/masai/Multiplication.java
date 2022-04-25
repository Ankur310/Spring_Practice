package com.masai;

public class Multiplication {
	
	private int a;
	private int b;
	
	public Multiplication(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Multiplication() {
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int multiply() {
		return this.a*this.b;
	}

}
