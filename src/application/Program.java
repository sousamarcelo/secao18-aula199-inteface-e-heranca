package application;

import java.util.Locale;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.enums.Color;
import model.service.AbstractShape;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		AbstractShape circle = new Circle(2.0, Color.BLACK);
		AbstractShape rectangle = new Rectangle(3.0, 4.0, Color.GREEN);
		
		System.out.println("Circle: " + circle.getColor());
		System.out.println("Circle: " + String.format("%.2f", circle.area()) );
		System.out.println("Rectangle: " + rectangle.getColor());
		System.out.println("Rectangle: " + String.format("%.2f", rectangle.area()) );
		
	}

}
