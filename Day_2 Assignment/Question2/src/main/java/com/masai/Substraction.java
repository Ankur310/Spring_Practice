package com.masai;

public class Substraction {
	private int a;
	private int b;

	public Substraction(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Substraction() {
		super();
		// TODO Auto-generated constructor stub
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
	
	public int substract() {
		return this.a-this.b;
	}

}
