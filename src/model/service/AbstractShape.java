package model.service;

import model.entities.enums.Color;

public abstract class AbstractShape implements Shape {
	
	Color color;
	
	public AbstractShape(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

}
