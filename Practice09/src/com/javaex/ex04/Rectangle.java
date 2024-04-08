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

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	public double getPerimeter() {
		return 2*(height+width);
	}
	@Override
	public void resize(double s) {
		// TODO Auto-generated method stub
		width=s*width;
		height=s*height;
		
	}
	public double getArea() {
		return height*width;
	}

	
}