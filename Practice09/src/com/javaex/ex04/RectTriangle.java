package com.javaex.ex04;


public class RectTriangle extends Shape{
    private double width;
    private double height;
	public RectTriangle(double width, double height) {
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
		return height+width+Math.sqrt(Math.pow(height,2)+Math.pow(width,2));
	}
	public double getArea() {
		return (0.5*height*width);
	}

}