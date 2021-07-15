package model.entities;

import model.entities.enums.Color;
import model.service.AbstractShape;

public class Circle extends AbstractShape {
	
	private double radius;
	
	
	public Circle(double radius, Color color) {
		super(color);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public Double area() {		
		return Math.PI * Math.pow(getRadius(), 2) ;
	}

}
