package model.entities;

import model.entities.enums.Color;
import model.service.AbstractShape;

public class Rectangle extends AbstractShape {
	
	private double width;
	private double heigth;
	
	public Rectangle(double width, Double heigth, Color color) {
		super(color);
		this.width = width;
		this.heigth = heigth;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeight() {
		return heigth;
	}
	
	public void setHeight(double height) {
		this.heigth = height;
	}	

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public Double area() {		
		return getWidth()* getHeight();
	}

}
