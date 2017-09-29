package com.cognizant.shapes;

public class Shapes {

	private int numberofSides;
	
		public Shapes (int shape) {
			this.numberofSides = shape;
	}
		
	public void calculateShapeArea( int sideLength) {
		
//		if (this.numberofSides == 1) {
//			Circle c = new Circle();
//			c.calculateArea(sideLength);	
//		}
//		else if (this.numberofSides == 3) {
//				Triangle t = new Triangle();
//				t.calculateArea(sideLength);	
//		}
//		
//		else if (this.numberofSides == 4) {
//				Square s = new Square();
//				s.calculateArea(sideLength);	
//		}
//		else {
//			System.out.println("No shapes Present");
//			}
		
		switch (this.numberofSides) {
		
		case 1:   
			Circle c = new Circle();
	        c.calculateArea(sideLength);
	        break;
		case 3:  
			Triangle t = new Triangle();
			t.calculateArea(sideLength);	
		    break;
		case 4: 
			Square s = new Square();
			s.calculateArea(sideLength);
			break;
		default :
			System.out.println("No shapes Present");
				}
		
	}
	
	public static void main(String[] args) {
		
		Shapes s = new Shapes(1);
		s.calculateShapeArea(15);

	}
}
