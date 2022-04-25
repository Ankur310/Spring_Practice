package com.masai;

public class Division {
	private int a;
	private int b;

	public Division() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Division(int a, int b) {
		super();
		this.a = a;
		this.b = b;
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
	
	public float divide() {
		return this.a/this.b;
	}

}
