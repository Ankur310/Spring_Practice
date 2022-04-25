package com.question1.ci;

public class Circle {
	 private String shape;
	 
	 public Circle(String shape) {
		 this.shape = shape;
	 }
	 
	 public String getShape() {
		return shape;
	}



	public void setShape(String shape) {
		this.shape = shape;
	}



	public void draw() {
		 System.out.println("You have drawn "+  this.shape);
	 }
}
