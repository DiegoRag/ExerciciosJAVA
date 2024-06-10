package entities;

public class Rectangle {
	double width;
	double height;
	
	
	public double Area() {
		double area = (this.width * this.height);
		System.out.println("The area of the rectangle is " + " = " + area + "\n");
		return area;
	}
	
	public double Perimeter() {
		double perimeter = 2 * (this.width + this.height);
		System.out.println("The perimeter of the rectangle is " + " = " + perimeter + "\n");
		return perimeter;
	}
	
	public double Diagonal() {
		
		double diagonal = ((this.height * this.height) + (this.width * this.width));
		double raiz = Math.sqrt(diagonal);
		System.out.println("The diagonal of the rectangle is " + " = " + raiz + "\n");
		return raiz;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
