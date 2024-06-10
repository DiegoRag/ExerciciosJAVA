package application;

import entities.Rectangle;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle Rectangle = new Rectangle();
		
		Scanner valor = new Scanner(System.in);
		System.out.println("What's the rectangle's width?");
		Rectangle.setWidth(valor.nextDouble());
		System.out.println("What's the rectangle's height?");
		Rectangle.setHeight(valor.nextDouble());
		
		Rectangle.Area();
		Rectangle.Perimeter();
		Rectangle.Diagonal();
		valor.close();
	}

}
