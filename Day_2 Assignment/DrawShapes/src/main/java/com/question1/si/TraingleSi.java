package com.question1.si;

public class TraingleSi {
	
		
		private String shape;
		
		
		public TraingleSi() {
			super();
			// TODO Auto-generated constructor stub
		}

		public TraingleSi(String shape) {
			this.shape = shape;
		}
		
		public String getShape() {
			return shape;
		}


		public void setShape(String shape) {
			this.shape = shape;
		}

		public void draw() {
			System.out.println("You have drawn " + this.shape);
		}
}
