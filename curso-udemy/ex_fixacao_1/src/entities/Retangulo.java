package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double Area() {
		return width * height;
	}
	
	public double Perimeter() {
		return (width * 2) + (height * 2);
	}
	
	public double Diagonal() {
		double sumOfLegs = (width * width) + (height * height);
		return Math.sqrt(sumOfLegs);
	}

}
