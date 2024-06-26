package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
   
	private double width;
    private double height;
    
    public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

//	public void setWidth(double width) {
//		this.width = width;
//	}

	public double getHeight() {
		return height;
	}

//	public void setHeight(double height) {
//		this.height = height;
//	}
	@Override
	public void resize(double s) {
		width*=s;
		height*=s;
	}
	public double getPerimeter() {
		return 2*(height+width);
	}	
	
	public double getArea() {
		return width*height;
	}
	
	

	
}